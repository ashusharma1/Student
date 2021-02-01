package com.example.demo;

public class Pojo {
	private String suname;
	private String suid;
	public Pojo() {
		super();
	}
	public Pojo(String suname, String suid) {
		super();
		this.suname = suname;
		this.suid = suid;
	}
	public String getSuname() {
		return suname;
	}
	public void setSuname(String suname) {
		this.suname = suname;
	}
	public String getSuid() {
		return suid;
	}
	public void setSuid(String suid) {
		this.suid = suid;
	}
	@Override
	public String toString() {
		return "Pojo [suname=" + suname + ", suid=" + suid + "]";
	}
	
}
