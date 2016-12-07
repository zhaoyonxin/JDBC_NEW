package com.imooc.action;

import com.imook.dao.GoddessDao;

public class GoddessAction_delete {

	public static void main(String[] args) throws Exception{
		
		GoddessDao g=new GoddessDao();
		
		g.delGoddess((long) 28);
		g.delGoddess((long) 29);
		g.delGoddess((long) 30);
		g.delGoddess((long) 31);
		g.delGoddess((long) 32);
		g.delGoddess((long) 33);
	}
}
