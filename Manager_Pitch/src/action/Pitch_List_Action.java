package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.FootballPitchForm;
import model.bean.FootballPitchBean;
import model.bo.PitchBO;



public class Pitch_List_Action extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		FootballPitchForm footballPitchForm  =(FootballPitchForm) form;		
		PitchBO pitchBO = new PitchBO();
		ArrayList<FootballPitchBean> listSan=pitchBO.getListSan();
		footballPitchForm.setListSan(listSan);		
		return mapping.findForward("danhSachSan");
		
	}
}
