package com.imooc.view;

import java.util.Scanner;

import com.imooc.action_contro.GoddessAction;
import com.imook.model.Goddess;


public class View {
	private static final String CONTEXT="��ӭ����Ů������� \n"+
			"������Ů������Ĺ����б� \n"+
			"[MAIN/M]:���˵�\n" +
			"[QUERY/Q]:�鿴ȫ��Ů�����Ϣ\n" +
			"[GET/G]:�鿴ĳλŮ�����ϸ��Ϣ\n" +
			"[ADD/A]:���Ů����Ϣ\n" +
			"[UPDATE/U]:����Ů����Ϣ\n" +
			"[DELETE/D]:ɾ��Ů����Ϣ\n" +
			"[SEARCH/S]:��ѯŮ����Ϣ\n" +
			"[EXIT/E]:�˳�Ů�����\n" +
			"[BREAK/B]:�˳���ǰ���ܣ��������˵�";
	private static final String OPERATION_MAIN="MAIN";
	private static final String OPERATION_QUERY="QUERY";
	private static final String OPERATION_GET="GET";
	private static final String OPERATION_ADD="ADD";
	private static final String OPERATION_UPDATE="UPDATE";
	private static final String OPERATION_DELETE="DELETE";
	private static final String OPERATION_SEARCH="SEARCH";
	private static final String OPERATION_EXIT="EXIT";
	private static final String OPERATION_BREAK="BREAK";
	
	public static void main(String[] args){
		System.out.println(CONTEXT);
		//�������ֳ����һֱ����
		Scanner scan = new Scanner(System.in);
		Goddess goddess = new Goddess();
		GoddessAction mm= new GoddessAction();
		String prenious=null;
		Integer step = 1;
			while(scan.hasNext()){
				String in = scan.next().toString();
				if(OPERATION_EXIT.equals(in.toUpperCase())
						||OPERATION_EXIT.subSequence(0, 1).equals(in.toUpperCase())){
					System.out.println("���ѳɹ��˳�Ů�����.");
					break;
				}else if(OPERATION_ADD.equals(in.toUpperCase())
						||OPERATION_ADD.subSequence(0, 1).equals(in.toUpperCase())
						||OPERATION_ADD.equals(prenious)){
					prenious=OPERATION_ADD;
					//����Ů��
					
					if(1==step){
						System.out.println("������Ů���[����]");						
					}else if(2==step){
						goddess.setName(in);
						System.out.println("������Ů�����������");
					}else if(3==step){
						goddess.setXiuzhenstyle(in);
						System.out.println("������qq");
					}else if(4==step){
						goddess.setQq(Integer.valueOf(in));
						System.out.println("������ѧ��");
					}else if(5==step){
						goddess.setXuehao(Integer.valueOf(in));
									
						try {
							mm.add(goddess);
							System.out.println("����Ů��ɹ�");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("����Ů��ʧ��");
							step=5;
						}
					}if(OPERATION_ADD.endsWith(prenious))
						step++;
				}else{
					System.out.println("�������ֵΪ��"+in);
				}
			}
	}
}
