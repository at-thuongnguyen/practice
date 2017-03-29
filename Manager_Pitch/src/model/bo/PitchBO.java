package model.bo;

import java.util.ArrayList;

import model.bean.FootballPitchBean;
import model.dao.PitchDAO;



public class PitchBO {
	static PitchDAO pitchDAO = new PitchDAO();
	public ArrayList<FootballPitchBean> getListSan(){
		return pitchDAO.getListSan();
	}
	public ArrayList<FootballPitchBean> getListNamePitch() {
		
		return pitchDAO.getListNamePitch();
	}
}
