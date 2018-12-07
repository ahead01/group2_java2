/**
 * 
 */
package com.software.group2.entities;

import java.util.ArrayList;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author Austin
 *
 */
@Entity
public class Institution implements User {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer InstitutionID;
	
	@Column(name="institutionpwd")
	private String InstitutionPWD;
	
	@Column(name="institutionname")
	private String InstitutionName;
	
	@Column(name="institutiondesc")
	private String InstitutionDesc;
	
	@Column(name="institutionemail")
	private String InstitutionEmail;
	
	@Column(name="institutionzipcd")
	private String InstitutionZipCD;
	
	@Column(name="institutionstreetaddr")
	private String InstitutionStreetAddr;
	
	@Column(name="institutioncity")
	private String InstitutionCity;
	
	@Column(name="institutionstatecd")
	private String InstitutionStateCD;
	
	@Column(name="institutionapproved")
	private String InstitutionApproved;
	
	@Transient
	public ArrayList<MyVideo> videos;
	
	@Transient
	public ArrayList<MyClass> classes;
	
	@Override
	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		return true;
	}

	public Institution(String institutionPWD, String institutionName, String institutionDesc, String institutionEmail,
			String institutionZipCD, String institutionStreetAddr, String institutionCity, String institutionStateCD) {
		super();
		InstitutionPWD = institutionPWD;
		InstitutionName = institutionName;
		InstitutionDesc = institutionDesc;
		InstitutionEmail = institutionEmail;
		InstitutionZipCD = institutionZipCD;
		InstitutionStreetAddr = institutionStreetAddr;
		InstitutionCity = institutionCity;
		InstitutionStateCD = institutionStateCD;
	}
	
	/**
	 * @return the institutionApproved
	 */
	public String getInstitutionApproved() {
		return InstitutionApproved;
	}

	/**
	 * @param institutionApproved the institutionApproved to set
	 */
	public void setInstitutionApproved(String institutionApproved) {
		InstitutionApproved = institutionApproved;
	}

	/**
	 * @return the institutionID
	 */
	public Integer getInstitutionID() {
		return InstitutionID;
	}

	/**
	 * @param institutionID the institutionID to set
	 */
	public void setInstitutionID(Integer institutionID) {
		InstitutionID = institutionID;
	}

	/**
	 * @return the institutionPWD
	 */
	public String getInstitutionPWD() {
		return InstitutionPWD;
	}

	/**
	 * @param institutionPWD the institutionPWD to set
	 */
	public void setInstitutionPWD(String institutionPWD) {
		InstitutionPWD = institutionPWD;
	}

	public Institution() {
		super();
	}

	/**
	 * @return the institutionName
	 */
	public String getInstitutionName() {
		return InstitutionName;
	}

	/**
	 * @param institutionName the institutionName to set
	 */
	public void setInstitutionName(String institutionName) {
		InstitutionName = institutionName;
	}

	/**
	 * @return the institutionDesc
	 */
	public String getInstitutionDesc() {
		return InstitutionDesc;
	}

	/**
	 * @param institutionDesc the institutionDesc to set
	 */
	public void setInstitutionDesc(String institutionDesc) {
		InstitutionDesc = institutionDesc;
	}

	/**
	 * @return the institutionEmail
	 */
	public String getInstitutionEmail() {
		return InstitutionEmail;
	}

	/**
	 * @param institutionEmail the institutionEmail to set
	 */
	public void setInstitutionEmail(String institutionEmail) {
		InstitutionEmail = institutionEmail;
	}

	/**
	 * @return the institutionZipCD
	 */
	public String getInstitutionZipCD() {
		return InstitutionZipCD;
	}

	/**
	 * @param institutionZipCD the institutionZipCD to set
	 */
	public void setInstitutionZipCD(String institutionZipCD) {
		InstitutionZipCD = institutionZipCD;
	}

	/**
	 * @return the institutionStreetAddr
	 */
	public String getInstitutionStreetAddr() {
		return InstitutionStreetAddr;
	}

	/**
	 * @param institutionStreetAddr the institutionStreetAddr to set
	 */
	public void setInstitutionStreetAddr(String institutionStreetAddr) {
		InstitutionStreetAddr = institutionStreetAddr;
	}

	/**
	 * @return the institutionCity
	 */
	public String getInstitutionCity() {
		return InstitutionCity;
	}

	/**
	 * @param institutionCity the institutionCity to set
	 */
	public void setInstitutionCity(String institutionCity) {
		InstitutionCity = institutionCity;
	}

	/**
	 * @return the institutionStateCD
	 */
	public String getInstitutionStateCD() {
		return InstitutionStateCD;
	}

	/**
	 * @param institutionStateCD the institutionStateCD to set
	 */
	public void setInstitutionStateCD(String institutionStateCD) {
		InstitutionStateCD = institutionStateCD;
	}

	/**
	 * @return the videos
	 */
	public ArrayList<MyVideo> getVideos() {
		return videos;
	}

	/**
	 * @param videos the videos to set
	 */
	public void setVideos(ArrayList<MyVideo> videos) {
		this.videos = videos;
	}

	/**
	 * @return the classes
	 */
	public ArrayList<MyClass> getClasses() {
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(ArrayList<MyClass> classes) {
		this.classes = classes;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPwd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPwd(String pwd) {
		// TODO Auto-generated method stub
		
	}
	


}
