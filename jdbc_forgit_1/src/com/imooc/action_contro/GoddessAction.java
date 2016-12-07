package com.imooc.action_contro;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.imook.dao.GoddessDao;
import com.imook.model.Goddess;

public class GoddessAction {


		
	public void add(Goddess goddess) throws Exception{
		GoddessDao dao =new GoddessDao();
		dao.addGoddess(goddess);
	}
	
	public Goddess get(Long id) throws SQLException
	{
		GoddessDao dao =new GoddessDao();
		return dao.getGoddess(id);
	}
		
	public void edit(Goddess goddess) throws SQLException{
		GoddessDao dao =new GoddessDao();
		dao.updateGoddess(goddess);	
	}
		
	public void del(Long id) throws SQLException{
		GoddessDao dao =new GoddessDao();
		dao.delGoddess(id);	
	}
		
	public List<Goddess> query() throws Exception{
		GoddessDao dao =new GoddessDao();
		return dao.query();
	}
		
	public List<Goddess> query(List<Map<String, Object>>params) throws Exception{
		GoddessDao dao =new GoddessDao();
		return dao.query(params);
	}
		
}