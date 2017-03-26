package model.bo;

import java.util.ArrayList;

import model.bean.FootballPitchBean;
import model.dao.PitchDAO;



public class PitchBO {
	PitchDAO pitchDAO = new PitchDAO();
	public ArrayList<FootballPitchBean> getListSan(){
		return pitchDAO.getListSan();
	}
}
