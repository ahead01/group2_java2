/**
 * 
 */
package com.software.group2.entities;

import javax.persistence.Column;
/**
 * @author Austin
 *
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Admin implements User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer adminID;
	
	@Column(name="adminusername")
	private String adminUsername;
	
	
	@Column(name="adminpwd")
	private String adminPWD;
	
	
	public Admin() {
		super();
	}


	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		return true;
	}
	

	/**
	 * @param id the id to set
	 */
	public void setId(Integer adminID) {
		this.adminID = adminID;
	}
	/**
	 * @return the adminPWD
	 */
	public String getPwd() {
		return adminPWD;
	}
	/**
	 * @param pwd the adminPWD to set
	 */
	public void setPwd(String adminPWD) {
		this.adminPWD = adminPWD;
	}

	public Integer getId() {
		return this.adminID;
	}


	/**
	 * @return the adminID
	 */
	public Integer getAdminID() {
		return adminID;
	}


	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(Integer adminID) {
		this.adminID = adminID;
	}


	/**
	 * @return the adminUsername
	 */
	public String getAdminUsername() {
		return adminUsername;
	}


	/**
	 * @param adminUsername the adminUsername to set
	 */
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}


	/**
	 * @return the adminPWD
	 */
	public String getAdminPWD() {
		return adminPWD;
	}


	/**
	 * @param adminPWD the adminPWD to set
	 */
	public void setAdminPWD(String adminPWD) {
		this.adminPWD = adminPWD;
	}




}
