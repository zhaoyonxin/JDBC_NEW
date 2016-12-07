package com.imooc.action;

import java.util.List;

import com.imook.dao.GoddessDao;
import com.imook.model.Goddess;

public class GoddessAction {

	public static void main(String[] args) throws Exception{
		
		GoddessDao g=new GoddessDao();
		
		List<Goddess> gs=g.query();
		
		for (Goddess goddess : gs) {
			System.out.println(goddess.getName()+":"+goddess.getQq()+":"+goddess.getZhiyuan()
								+":"+goddess.getCreat_at());
		}
	}
}