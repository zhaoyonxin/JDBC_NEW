package com.imooc.action;

import com.imook.dao.GoddessDao;
import com.imook.model.Goddess;

public class GoddessAction_update {

	public static void main(String[] args) throws Exception{
		
		GoddessDao g=new GoddessDao();
		
		Goddess g1 = new Goddess();
				
		g1.setCreat_at(null);//��ôдTIMESTAMP��ʽ�Ķ����أ�����Ŷ
		
		g1.setUpdate_at(null);
		
		g1.setName("С����֨֨֨֨");
		
		g1.setQq(5454781);
		
		g1.setXiuzhenstyle("�ðɰͰͰְ�");
		
		g1.setBiyeschool("����״�ѧ������");
		
		g1.setXuehao(656244);
		
		g1.setRuxuetime(null);
		
		g1.setRibaolianjie("�кβ���");
		
		g1.setZhiyuan("���ո�ȥ");
		
		g1.setTuijianren("���Ǻ���������");
		
		g1.setID((long) 20);
		
		g.updateGoddess(g1);

	}
}
