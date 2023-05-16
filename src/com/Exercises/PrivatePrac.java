package com.Exercises;

public class PrivatePrac {
	
	private int accno;
	private String adharno;
	
	public String getAdhar(String adharno) {

		this.adharno = adharno;

		return adharno;

	}

	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

}
