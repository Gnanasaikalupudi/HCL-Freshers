package com.freshers.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Login implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="userName")
	private String userName;
	@Column(nullable=false)
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public Login() {
		super();
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + "]";
	}
	

}
