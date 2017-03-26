package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.UsersForm;
import model.bo.UsersBO;


public class loginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UsersForm usersform = (UsersForm) form;
		UsersBO usersBO = new UsersBO();
		String email = usersform.getEmail();
		String password = usersform.getPassword();
		if(usersBO.checkLogin(email, password)){				//kiem tra neu chinh xac
			return mapping.findForward("thanhCong");
		} else {														//neu khong chinh xac
			
			return mapping.findForward("thatBai");
		}
	}
}
