package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.BookPitchForm;
import model.bean.FootballPitchBean;
import model.bean.HourBean;
import model.bo.HourBO;
import model.bo.PitchBO;

public class Book_Pitch_Action extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		//Khoi tạo form
		BookPitchForm bookPitchForm = (BookPitchForm) form;
		//khoi tao pitchBO lấy danh sach sân
		PitchBO pitchBO= new PitchBO();
		ArrayList<FootballPitchBean> listNamePitch = pitchBO.getListNamePitch();
		bookPitchForm.setListNamePitch(listNamePitch);
		//Khởi tạo lấy danh sách h
		HourBO hourBO = new HourBO();
		ArrayList<HourBean> listHour = hourBO.getListHour();
		bookPitchForm.setListHour(listHour);
		return mapping.findForward("thanhcong");
	}
}
