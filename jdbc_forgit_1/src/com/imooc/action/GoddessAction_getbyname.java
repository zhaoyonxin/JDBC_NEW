package com.imooc.action;

import java.util.List;

import com.imook.dao.GoddessDao;
import com.imook.model.Goddess;

public class GoddessAction_getbyname {

	public static void main(String[] args) throws Exception{
		
		GoddessDao g=new GoddessDao();
		
		List<Goddess> result = g.query("Û¬","²ú");
		
		for(int i =0; i<result.size();i++){
			System.out.println(result.get(i).toString());
		}
	}
}


