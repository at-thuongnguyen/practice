package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.ConnectDB;
import model.bean.FootballPitchBean;


public class PitchDAO {
ConnectDB db = new ConnectDB();
	
	public ArrayList<FootballPitchBean> getListSan() {
		db.connect();
		String sql=	"select ID, pitch_name, pitch_size, pitch_zone, price from footbal_pitchs";
		ResultSet rs = null;
		try {
			Statement stmt = db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
		ArrayList<FootballPitchBean> list = new ArrayList<FootballPitchBean>();
		FootballPitchBean footballPitchBean;
		try {
			while(rs.next()){
				footballPitchBean = new FootballPitchBean();
				footballPitchBean.setIdPitch(rs.getInt("ID"));
				footballPitchBean.setPitchName(rs.getString("pitch_name"));
				footballPitchBean.setPitchSize((rs.getString("pitch_size")));
				footballPitchBean.setPitchZone((rs.getString("pitch_zone")));
				footballPitchBean.setPrice((rs.getDouble("price")));
			
				list.add(footballPitchBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
