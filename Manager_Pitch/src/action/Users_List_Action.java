package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.UsersForm;
import model.bean.userBean;
import model.bo.UsersBO;



public class Users_List_Action extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		UsersForm usersForm  =(UsersForm) form;	
		
		UsersBO usersBO = new UsersBO();
		
		ArrayList<userBean> listUsers=usersBO.getListUsers();
		usersForm.setListUsers(listUsers);	
		return mapping.findForward("danhSachTaiKhoan");
		
	}
}
