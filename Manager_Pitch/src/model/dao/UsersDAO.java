package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.ConnectDB;
import model.bean.FootballPitchBean;
import model.bean.userBean;

public class UsersDAO {
	ConnectDB db = new ConnectDB();
	public boolean checkLogin(String email, String password) {
		db.connect();
		String sql=	String.format("SELECT email FROM users WHERE email = '%s' AND password = '%s'", email, password);
		ResultSet rs = null;
		try {
			Statement stmt =db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public void addUser(String email, String password, String first_name, String last_name,
			String phone, String role) {
		db.connect();
		String sql=	String.format("insert into users (email, password, first_name,last_name,phone,role) "+
					" VALUES ('%s','%s',N'%s',N'%s','%s' ,'%s' )", email,password,first_name,last_name,phone,role);
		try {
			Statement stmt = db.getConnection().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public ArrayList<userBean> getListUsers() {
		db.connect();
		String sql= "select first_name, last_name, birth_day, phone, address, nric, email, password from users where role='user'";
		ResultSet rs = null;
		try {
			Statement stmt = db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
		ArrayList<userBean> list = new ArrayList<userBean>();
		userBean userBean;
		try {
			while(rs.next()){
				userBean = new userBean();
				userBean.setFirst_name(rs.getString("first_name"));
				userBean.setLast_name(rs.getString("last_name"));
				userBean.setBirth_date(rs.getString("birth_day"));
				userBean.setPhone(rs.getString("phone"));
				userBean.setAddress(rs.getString("address"));
				userBean.setNric(rs.getString("nric"));
				userBean.setEmail(rs.getString("email"));
				userBean.setPassword(rs.getString("password"));
				list.add(userBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
