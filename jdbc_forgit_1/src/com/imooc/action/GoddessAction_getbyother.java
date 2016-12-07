package com.imooc.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imook.dao.GoddessDao;
import com.imook.model.Goddess;

public class GoddessAction_getbyother {

	public static void main(String[] args) throws Exception{
		
		GoddessDao g=new GoddessDao();
		
		//List<Goddess> result = g.query("Û¬","²ú");
		List<Map<String,Object>> params = new ArrayList<Map<String,Object>>();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("name", "name");
		param.put("rela", "=");		
		param.put("value", "'Û¬³¬'");
		params.add(param);
		List<Goddess> result = g.query(params);	
		
		for(int i =0; i<result.size();i++){
			System.out.println(result.get(i).toString());
		}
	}
}

