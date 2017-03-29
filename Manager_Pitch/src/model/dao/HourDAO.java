package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.ConnectDB;
import model.bean.FootballPitchBean;
import model.bean.HourBean;

public class HourDAO
{
	ConnectDB db = new ConnectDB();
	public ArrayList<HourBean> getListHour() {
		db.connect();
		String sql = "select id, frame_time from frame_times";
		ResultSet rs = null;
		try {
			Statement stmt = db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		ArrayList<HourBean> list = new ArrayList<HourBean>();
		HourBean hourBean;
		try {
			while(rs.next()){
				hourBean = new HourBean();
				hourBean.setIdHour(rs.getInt("id"));
				hourBean.setFrameTime(rs.getString("frame_times"));
				
			
				list.add(hourBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
