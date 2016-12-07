package com.imook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.imook.db.DBUtil;
import com.imook.model.Goddess;

public class GoddessDao {
	
	public void addGoddess(Goddess g) throws Exception{
		Connection conn = DBUtil.getConnection();
		String sql = ""+
					 "insert into idxinxi"+
					 "(creat_at,update_at,name,qq,xiuzhenstyle,biyeschool,"+
					 "xuehao,ruxuetime,ribaolianjie,zhiyuan,tuijianren)"+
					 "values(" +
					 "?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setTimestamp(1, g.getCreat_at());
		ptmt.setTimestamp(2, g.getUpdate_at());
		ptmt.setString(3, g.getName());		
		ptmt.setInt(4, g.getQq());
		ptmt.setString(5, g.getXiuzhenstyle());
		ptmt.setString(6, g.getBiyeschool());
		ptmt.setInt(7, g.getXuehao());
		ptmt.setDate(8, g.getRuxuetime());
		ptmt.setString(9, g.getRibaolianjie());
		ptmt.setString(10, g.getZhiyuan());
		ptmt.setString(11, g.getTuijianren());
		
		ptmt.execute();
	}
	
	public void updateGoddess(Goddess g) throws SQLException{
		
		Connection conn = DBUtil.getConnection();
		String sql = ""+
					 " update idxinxi "+
					 " set creat_at=?,update_at=?,name=?,qq=?,xiuzhenstyle=?,biyeschool=?, "+
					 " xuehao=?,ruxuetime=?,ribaolianjie=?,zhiyuan=?,tuijianren=? "+
					 " where ID=? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setTimestamp(1, g.getCreat_at());
		ptmt.setTimestamp(2, g.getUpdate_at());
		ptmt.setString(3, g.getName());		
		ptmt.setInt(4, g.getQq());
		ptmt.setString(5, g.getXiuzhenstyle());
		ptmt.setString(6, g.getBiyeschool());
		ptmt.setInt(7, g.getXuehao());
		ptmt.setDate(8, g.getRuxuetime());
		ptmt.setString(9, g.getRibaolianjie());
		ptmt.setString(10, g.getZhiyuan());
		ptmt.setString(11, g.getTuijianren());
		ptmt.setLong(12, g.getID());
		
		ptmt.execute();
	}

	public void delGoddess(Long ID) throws SQLException{
		
		Connection conn = DBUtil.getConnection();
		String sql = ""+
					 " delete from idxinxi "+
					 " where ID=? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);	

		ptmt.setLong(1,ID);
		ptmt.execute();
	}
	
	public List<Goddess> query() throws Exception{
		Connection conn = DBUtil.getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs =stmt.executeQuery("select name,qq,zhiyuan,creat_at from idxinxi");
		
		List<Goddess> gs=new ArrayList<Goddess>();
		Goddess g=null;
		while(rs.next()){
			g=new Goddess();
			g.setName(rs.getString("name"));
			g.setQq(rs.getInt("qq"));
			g.setZhiyuan(rs.getString("zhiyuan"));
			g.setCreat_at(rs.getTimestamp("creat_at"));
			
			gs.add(g);
		}
		return gs;
	}
	
	public Goddess getGoddess(Long ID) throws SQLException{
		Goddess g=null;
		Connection conn = DBUtil.getConnection();
		String sql = ""+
					 " select * from idxinxi "+
					 " where ID=? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setLong(1, ID);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			g=new Goddess();
			g.setID(rs.getLong("ID"));
			g.setName(rs.getString("name"));
			g.setQq(rs.getInt("qq"));
			g.setZhiyuan(rs.getString("zhiyuan"));
			g.setCreat_at(rs.getTimestamp("creat_at"));
		}
		return g;
	}


	public List<Goddess> query(String name,String xiuzhenstyle) throws Exception{
		List<Goddess> result=new ArrayList<Goddess>();
	
		Connection conn = DBUtil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select * from idxinxi ");
	
		sb.append(" where name like ? and xiuzhenstyle like ?");
	
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
	
		ptmt.setString(1, "%"+name+"%");
		ptmt.setString(2, "%"+xiuzhenstyle+"%");
	
		ResultSet rs = ptmt.executeQuery();

		Goddess g=null;
		while(rs.next()){
			g=new Goddess();
			g.setName(rs.getString("name"));
			g.setQq(rs.getInt("qq"));
			g.setZhiyuan(rs.getString("zhiyuan"));
			g.setCreat_at(rs.getTimestamp("creat_at"));
			
			result.add(g);
		
		}
		return result;
	}
	
	public List<Goddess> query(List<Map<String,Object>> params) throws Exception{
		List<Goddess> result=new ArrayList<Goddess>();
	
		Connection conn = DBUtil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select * from idxinxi where 1=1 ");
		
		if(params!=null&&params.size()>0){
			for(int i= 0; i< params.size();i++){
				Map<String, Object> map = params.get(i);
				sb.append(" and "+map.get("name")+" "+map.get("rela")+" "+map.get("value")+" ");
			}
		}
	
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		
		System.out.println(sb.toString());
		
		ResultSet rs = ptmt.executeQuery();

		Goddess g=null;
		while(rs.next()){
			g=new Goddess();
			g.setName(rs.getString("name"));
			g.setQq(rs.getInt("qq"));
			g.setZhiyuan(rs.getString("zhiyuan"));
			g.setCreat_at(rs.getTimestamp("creat_at"));
			
			result.add(g);
		
		}
		return result;
	}
}

