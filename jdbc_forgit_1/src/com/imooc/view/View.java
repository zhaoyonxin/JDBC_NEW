package com.imooc.view;

import java.util.Scanner;

import com.imooc.action_contro.GoddessAction;
import com.imook.model.Goddess;


public class View {
	private static final String CONTEXT="欢迎来到女神禁区： \n"+
			"下面是女神禁区的功能列表： \n"+
			"[MAIN/M]:主菜单\n" +
			"[QUERY/Q]:查看全部女神的信息\n" +
			"[GET/G]:查看某位女神的详细信息\n" +
			"[ADD/A]:添加女神信息\n" +
			"[UPDATE/U]:更新女神信息\n" +
			"[DELETE/D]:删除女神信息\n" +
			"[SEARCH/S]:查询女神信息\n" +
			"[EXIT/E]:退出女神禁区\n" +
			"[BREAK/B]:退出当前功能，返回主菜单";
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
		//怎样保持程序的一直运行
		Scanner scan = new Scanner(System.in);
		Goddess goddess = new Goddess();
		GoddessAction mm= new GoddessAction();
		String prenious=null;
		Integer step = 1;
			while(scan.hasNext()){
				String in = scan.next().toString();
				if(OPERATION_EXIT.equals(in.toUpperCase())
						||OPERATION_EXIT.subSequence(0, 1).equals(in.toUpperCase())){
					System.out.println("您已成功退出女神禁区.");
					break;
				}else if(OPERATION_ADD.equals(in.toUpperCase())
						||OPERATION_ADD.subSequence(0, 1).equals(in.toUpperCase())
						||OPERATION_ADD.equals(prenious)){
					prenious=OPERATION_ADD;
					//新增女神
					
					if(1==step){
						System.out.println("请输入女神的[姓名]");						
					}else if(2==step){
						goddess.setName(in);
						System.out.println("请输入女神的修真类型");
					}else if(3==step){
						goddess.setXiuzhenstyle(in);
						System.out.println("请输入qq");
					}else if(4==step){
						goddess.setQq(Integer.valueOf(in));
						System.out.println("请输入学号");
					}else if(5==step){
						goddess.setXuehao(Integer.valueOf(in));
									
						try {
							mm.add(goddess);
							System.out.println("新增女神成功");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("新增女神失败");
							step=5;
						}
					}if(OPERATION_ADD.endsWith(prenious))
						step++;
				}else{
					System.out.println("您输入的值为："+in);
				}
			}
	}
}
