package model.bean;

public class BookPitchBean {
	private int idBookPitchForm;
	private int idUser;
	private int idFootballPitch;
	private String dayBook;
	private int idFrameTime;
	private boolean confirm;
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
