package es.um.scsyd.flicker.interestingphoto.flicker.jsonUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ObjPath
{
	private enum ItemType { OBJ, ARR, ARR_SEARCH };

	private class PathItem
	{
		public ItemType type;
		public Object value;
	}

	private List<PathItem> pitems = new ArrayList<PathItem>();

	public static ObjPath in(Map<String,Object> o)
	{
		return new ObjPath(o);
	}

	private Map<String, Object> obj;

	private ObjPath(Map<String, Object> m)
	{
		obj = m;
	}
	
	public ObjPath o(String s)
	{
		PathItem pi = new PathItem();
		pi.type = ItemType.OBJ;
		pi.value = s;
		pitems.add(pi);
		return this;
	}

	public ObjPath a(Integer i)
	{
		PathItem pi = new PathItem();
		pi.type = ItemType.ARR;
		pi.value = i;
		pitems.add(pi);
		return this;
	}

	public ObjPath as(String keyvalue)
	{
		PathItem pi = new PathItem();
		pi.type = ItemType.ARR_SEARCH;
		pi.value = keyvalue;
		pitems.add(pi);
		return this;
	}

	public Object value()
	{
		Iterator<PathItem> it = pitems.iterator();
		return _value2(obj, it);
	}

	@SuppressWarnings("unchecked")
	private Object _value2(Object o, Iterator<PathItem> it)
	{
		if (!it.hasNext())
			return o;

		PathItem pi = it.next();
		if (pi.type == ItemType.OBJ)
		{
			Map<String, Object> m = (Map<String,Object>)o;
			return _value2(m.get(pi.value), it);
		}
		else if (pi.type == ItemType.ARR)
		{
			List<String> ls = (List<String>)o;
			return _value2(ls.get((Integer)pi.value), it);
		}
		else
		{	// ARR_SEARCH
			String[] kv = ((String)pi.value).split(":");
			List<Object> ls = (List<Object>)o;
			return _value2(findInList(ls, kv[0], kv[1]), it);
		}
	}
	
	public Object value(String path)
	{
		return _value(path, obj);
	}

	@SuppressWarnings("unchecked")
	private Object _value(String path, Object obj)
	{
		if (path.isEmpty())
			return obj;

		int dotindex, squareindex;
		dotindex = path.indexOf('.');
		if (dotindex == -1) dotindex = path.length();
		squareindex = path.indexOf('[');
		if (squareindex == -1) squareindex = path.length();
		boolean isObj = false;

		int maxindex = Math.min(dotindex, squareindex);
		if (maxindex == dotindex)
			isObj = true;
		else
			maxindex = squareindex;

		String memberAccess = path.substring(0, maxindex);
		String restPath = path.substring(Math.min(maxindex + 1, path.length()));
		if (isObj)
		{
			// Obj
			return _value(restPath, ((Map<String,Object>)obj).get(memberAccess));
		} else
		{
			// Object access, then array
			int endSquareIndex = restPath.indexOf(']');
			List<Object> objList = (List<Object>)((Map<String,Object>)obj).get(memberAccess);

			Object result;
			if (restPath.startsWith("{"))
			{
				// Object list search
				int endBrace = restPath.indexOf('}');
				String[] keyvalue = restPath.substring(1,endBrace).split(":");
				result = findInList(objList, keyvalue[0], keyvalue[1]);
			}
			else
			{
				int index = Integer.parseInt(restPath.substring(0, endSquareIndex));
				result = objList.get(index);
			}

			restPath = restPath.substring(endSquareIndex + 1);
			if (restPath.startsWith("."))
				restPath = restPath.substring(1);

			return _value(restPath, result);
		}
	}

	@SuppressWarnings("unchecked")
	private Object findInList(List<Object> objList, String string, String string2)
	{
		Optional<Object> maybeResult =
				objList.stream().filter(o -> {
					Map<String,Object> m = (Map<String, Object>)o;
					Object maybeKey = m.get(string);
					return (maybeKey != null) && string2.equals(maybeKey);
				}).findFirst();
		return maybeResult.orElse(null);
	}
}
