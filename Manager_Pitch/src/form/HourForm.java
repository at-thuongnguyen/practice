package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.HourBean;



public class HourForm extends ActionForm{
	private int idHour;
	private String frameTime;
	private ArrayList<HourBean> listHour;
	
	public int getIdHour() {
		return idHour;
	}
	public void setIdHour(int idHour) {
		this.idHour = idHour;
	}
	
	public String getFrameTime() {
		return frameTime;
	}
	public void setFrameTime(String frameTime) {
		this.frameTime = frameTime;
	}
	
}
