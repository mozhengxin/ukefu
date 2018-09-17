package com.ukefu.util.freeswitch.model;

import java.util.Date;

import com.ukefu.webim.web.model.Extention;

public class CallCenterAgent implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -884536468331333053L;
	private String userid ;
	private String username ;
	private String organ ;
	
	private String extno ;
	
	private String orgi ;
	private Date updatetime ;
	private String status ;
	private String workstatus ;
	private String siptrunk ;
	
	private String eventid ;
	
	private Extention extention ;
	
	private String nameid ;
	
	public CallCenterAgent(String userid, String extno , String orgi) {
		this.userid = userid ;
		this.extno = extno ;
		this.orgi = orgi ;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getExtno() {
		return extno;
	}
	public void setExtno(String extno) {
		this.extno = extno;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrgi() {
		return orgi;
	}

	public void setOrgi(String orgi) {
		this.orgi = orgi;
	}

	public String getEventid() {
		return eventid;
	}

	public void setEventid(String eventid) {
		this.eventid = eventid;
	}

	public Extention getExtention() {
		return extention;
	}

	public void setExtention(Extention extention) {
		this.extention = extention;
	}

	public String getWorkstatus() {
		return workstatus;
	}

	public void setWorkstatus(String workstatus) {
		this.workstatus = workstatus;
	}

	public String getNameid() {
		return nameid;
	}

	public void setNameid(String nameid) {
		this.nameid = nameid;
	}

	public String getSiptrunk() {
		return siptrunk;
	}

	public void setSiptrunk(String siptrunk) {
		this.siptrunk = siptrunk;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOrgan() {
		return organ;
	}

	public void setOrgan(String organ) {
		this.organ = organ;
	}
}
