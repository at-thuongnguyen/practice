package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.FootballPitchBean;
import model.bean.HourBean;



public class FootballPitchForm extends ActionForm{
	private int idPitch;
	private String pitchName;
	private String pitchSize;
	private String pitchZone;
	private Double price;
	private String submit;
	private ArrayList<FootballPitchBean> listSan;
	private ArrayList<FootballPitchBean> listNamePitch;
	
	private FootballPitchBean footballPitchBean;
	
	
	
	
	
	public ArrayList<FootballPitchBean> getListNamePitch() {
		return listNamePitch;
	}
	public void setListNamePitch(ArrayList<FootballPitchBean> listNamePitch) {
		this.listNamePitch = listNamePitch;
	}
	public int getIdPitch() {
		return idPitch;
	}
	public void setIdPitch(int idPitch) {
		this.idPitch = idPitch;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public ArrayList<FootballPitchBean> getListSan() {
		return listSan;
	}
	public void setListSan(ArrayList<FootballPitchBean> listSan) {
		this.listSan = listSan;
	}
	public FootballPitchBean getFootballPitchBean() {
		return footballPitchBean;
	}
	public void setFootballPitchBean(FootballPitchBean footballPitchBean) {
		this.footballPitchBean = footballPitchBean;
	}

	public String getPitchName() {
		return pitchName;
	}
	public void setPitchName(String pitchName) {
		this.pitchName = pitchName;
	}
	public String getPitchSize() {
		return pitchSize;
	}
	public void setPitchSize(String pitchSize) {
		this.pitchSize = pitchSize;
	}
	public String getPitchZone() {
		return pitchZone;
	}
	public void setPitchZone(String pitchZone) {
		this.pitchZone = pitchZone;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
