package com.imooc.action;

import com.imook.dao.GoddessDao;
import com.imook.model.Goddess;

public class GoddessAction_get {

	public static void main(String[] args) throws Exception{
		
		GoddessDao g=new GoddessDao();
		
		Goddess g2 = g.getGoddess((long) 20);
		System.out.println(g2.toString());

	}
}
