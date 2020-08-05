package com.freshers.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "freshersdata")
public class Data implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="S.No")
    private int SNo;
	@Column(name="SBU")
	private String SBU;
	@Column(name="Cluster")
	private String Cluster;
	@Column(name="Account")
	private String Account;
	@Column(name="Quarter")
	private String Quarter;
	@Column(name="Month")
	private String Month;
	@Column(name="Skill")
	private String Skill;
	@Column(name="Location")
	private String Location;
	@Column(name="Cohart")
	private String Cohart;
	@Column(name="Count")
	private long Count;
	public String getSBU() {
	return SBU;
	}
	public void setSBU(String sBU) {
	SBU = sBU;
	}
	public String getCluster() {
	return Cluster;
	}
	public void setCluster(String cluster) {
	Cluster = cluster;
	}
	public String getAccount() {
	return Account;
	}
	public void setAccount(String account) {
	Account = account;
	}
	public String getQuarter() {
	return Quarter;
	}
	public void setQuarter(String quarter) {
	Quarter = quarter;
	}
	public String getMonth() {
	return Month;
	}
	public void setMonth(String month) {
	Month = month;
	}
	public String getSkill() {
	return Skill;
	}
	public void setSkill(String skill) {
	Skill = skill;
	}
	public String getLocation() {
	return Location;
	}
	public void setLocation(String location) {
	Location = location;
	}
	public String getCohart() {
	return Cohart;
	}
	public void setCohart(String cohart) {
	Cohart = cohart;
	}
	public long getCount() {
	return Count;
	}
	public void setCount(long count) {
	Count = count;
	}
	public Data(String sBU, String cluster, String account, String quarter, String month, String skill, String location,
	String cohart, long count) {
	super();
	SBU = sBU;
	Cluster = cluster;
	Account = account;
	Quarter = quarter;
	Month = month;
	Skill = skill;
	Location = location;
	Cohart = cohart;
	Count = count;
	}
	public Data() {
	super();
	// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
	return "Data [SBU=" + SBU + ", Cluster=" + Cluster + ", Account=" + Account + ", Quarter=" + Quarter
	+ ", Month=" + Month + ", Skill=" + Skill + ", Location=" + Location + ", Cohart=" + Cohart + ", Count="
	+ Count + "]";
	}
	public Data(String sBU, long count) {
		super();
		SBU = sBU;
		Count = count;
	}
	
}
