package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.FootballPitchBean;
import model.bean.userBean;

public class UsersForm extends ActionForm{
		private int id;
		private String first_name;
		private String last_name;
		private String birth_date;
		private String phone;
		private String address;
		private String nric;
		private String email;
		private String password;
		private String repassword;
		private String role;
		private String submit;
		private ArrayList<userBean> listUsers;
		
		
		public ArrayList<userBean> getListUsers() {
			return listUsers;
		}
		public void setListUsers(ArrayList<userBean> listUsers) {
			this.listUsers = listUsers;
		}
		public String getSubmit() {
			return submit;
		}
		public void setSubmit(String submit) {
			this.submit = submit;
		}
		public String getRepassword() {
			return repassword;
		}
		public void setRepassword(String repassword) {
			this.repassword = repassword;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getBirth_date() {
			return birth_date;
		}
		public void setBirth_date(String birth_date) {
			this.birth_date = birth_date;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getNric() {
			return nric;
		}
		public void setNric(String nric) {
			this.nric = nric;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		@Override
		public void reset(ActionMapping mapping, HttpServletRequest request) {
			// TODO Auto-generated method stub
			super.reset(mapping, request);
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


