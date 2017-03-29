package model.bo;

import java.util.ArrayList;

import model.bean.HourBean;
import model.dao.HourDAO;

public class HourBO {
	HourDAO hourDAO = new HourDAO();
	public ArrayList<HourBean> getListHour() {
		// TODO Auto-generated method stub
		return hourDAO.getListHour();
	}

}
