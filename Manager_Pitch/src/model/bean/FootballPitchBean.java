package model.bean;

public class FootballPitchBean{
	private int idPitch;
	private String pitchName;
	private String pitchSize;
	private String pitchZone;
	private Double price;
	
	public int getIdPitch() {
		return idPitch;
	}
	public void setIdPitch(int idPitch) {
		this.idPitch = idPitch;
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
