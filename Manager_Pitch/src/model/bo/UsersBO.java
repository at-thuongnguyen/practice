package model.bo;

import java.util.ArrayList;

import model.bean.userBean;
import model.dao.UsersDAO;

public class UsersBO {
	UsersDAO usersDAO = new UsersDAO();
	public boolean checkLogin(String email, String password) {
		return usersDAO.checkLogin(email, password);
	}
	public void addUser(String email, String password, String first_name, String last_name,
			String phone, String role) {
		usersDAO.addUser(email, password,  first_name, last_name,phone,role);
		
	}
	public  ArrayList<userBean> getListUsers() {
		
		return usersDAO.getListUsers();
	}
}
