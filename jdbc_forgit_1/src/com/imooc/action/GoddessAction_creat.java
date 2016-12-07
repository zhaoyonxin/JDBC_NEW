package com.imooc.action;

import com.imook.dao.GoddessDao;
import com.imook.model.Goddess;

public class GoddessAction_creat {

	public static void main(String[] args) throws Exception{
		
		GoddessDao g=new GoddessDao();
		
		Goddess g1 = new Goddess();
				
		g1.setCreat_at(null);//怎么写TIMESTAMP格式的东东呢，不会哦
		
		g1.setUpdate_at(null);
		
		g1.setName("小王");
		
		g1.setQq(5454781);
		
		g1.setXiuzhenstyle("好吧");
		
		g1.setBiyeschool("家里蹲大学");
		
		g1.setXuehao(656244);
		
		g1.setRuxuetime(null);
		
		g1.setRibaolianjie("有何不可");
		
		g1.setZhiyuan("我勒个去");
		
		g1.setTuijianren("我是好人");
				
		g.addGoddess(g1);

	}
}