package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.FootballPitchBean;
import model.bean.HourBean;

public class BookPitchForm extends ActionForm{
	private int idBookPitchForm;
	private int idUser;
	private int idFootballPitch;
	private String dayBook;
	private int idFrameTime;
	private boolean confirm;
	private ArrayList<FootballPitchBean> listNamePitch;
	private ArrayList<HourBean> listHour;
	
	public ArrayList<HourBean> getListHour() {
		return listHour;
	}
	public void setListHour(ArrayList<HourBean> listHour) {
		this.listHour = listHour;
	}
	public ArrayList<FootballPitchBean> getListNamePitch() {
		return listNamePitch;
	}
	public void setListNamePitch(ArrayList<FootballPitchBean> listNamePitch) {
		this.listNamePitch = listNamePitch;
	}
	public int getIdBookPitchForm() {
		return idBookPitchForm;
	}
	public void setIdBookPitchForm(int idBookPitchForm) {
		this.idBookPitchForm = idBookPitchForm;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdFootballPitch() {
		return idFootballPitch;
	}
	public void setIdFootballPitch(int idFootballPitch) {
		this.idFootballPitch = idFootballPitch;
	}
	public String getDayBook() {
		return dayBook;
	}
	public void setDayBook(String dayBook) {
		this.dayBook = dayBook;
	}
	public int getIdFrameTime() {
		return idFrameTime;
	}
	public void setIdFrameTime(int idFrameTime) {
		this.idFrameTime = idFrameTime;
	}
	public boolean isConfirm() {
		return confirm;
	}
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	
}
