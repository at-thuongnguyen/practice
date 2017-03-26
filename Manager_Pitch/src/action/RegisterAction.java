package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.UsersForm;
import model.bo.UsersBO;



public class RegisterAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
			//khoi tao form nguoi dung
			UsersForm  usersForm = (UsersForm) form;
		
			UsersBO usersBO= new UsersBO();
			
			
			//nguoi dung nhan submit
			if("submit".equals(usersForm.getSubmit())){	
				String email = usersForm.getEmail();
				String password = usersForm.getPassword();
				String first_name = usersForm.getFirst_name();
				String last_name = usersForm.getLast_name();
				String phone = usersForm.getPhone();
				String role = "user";
				
				usersBO.addUser(email, password, first_name, last_name,phone,role);
				return mapping.findForward("addedUser");
			} else {											
				return mapping.findForward("addUser");
			}
	}
	}

