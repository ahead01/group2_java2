/**
 * 
 */
package com.software.group2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Austin
 *
 */
@Entity
public class Student implements User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer StudentID;
	
	@Column(name="studentfname")
	private String StudentFName;
	
	@Column(name="studentlname")
	private String StudentLName;
	
	@Column(name="studentpwd")
	private String StudentPWD;
	
	@Column(name="studentusername")
	private String StudentUserName;
	
	@Column(name="studentzip")
	private String StudentZip;
	
	@Column(name="studentaddress")
	private String StudentAddress;
	
	@Column(name="studentcity")
	private String StudentCity;
	
	@Column(name="studentstate")
	private String StudentState;

	@Column(name="studentemail")
	private String StudentEmail;
	
	/**
	 * @return the studentEmail
	 */
	public String getStudentEmail() {
		return StudentEmail;
	}


	/**
	 * @param studentEmail the studentEmail to set
	 */
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}


	@Override
	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		return true;
	}


	public Student() {
		super();
	}


	/**
	 * @return the studentID
	 */
	public Integer getStudentID() {
		return StudentID;
	}


	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(Integer studentID) {
		StudentID = studentID;
	}


	/**
	 * @return the studentFName
	 */
	public String getStudentFName() {
		return StudentFName;
	}


	/**
	 * @param studentFName the studentFName to set
	 */
	public void setStudentFName(String studentFName) {
		StudentFName = studentFName;
	}


	/**
	 * @return the studentLName
	 */
	public String getStudentLName() {
		return StudentLName;
	}


	/**
	 * @param studentLName the studentLName to set
	 */
	public void setStudentLName(String studentLName) {
		StudentLName = studentLName;
	}


	/**
	 * @return the studentPWD
	 */
	public String getStudentPWD() {
		return StudentPWD;
	}


	/**
	 * @param studentPWD the studentPWD to set
	 */
	public void setStudentPWD(String studentPWD) {
		StudentPWD = studentPWD;
	}


	/**
	 * @return the studentUserName
	 */
	public String getStudentUserName() {
		return StudentUserName;
	}


	/**
	 * @param studentUserName the studentUserName to set
	 */
	public void setStudentUserName(String studentUserName) {
		StudentUserName = studentUserName;
	}


	/**
	 * @return the studentZip
	 */
	public String getStudentZip() {
		return StudentZip;
	}


	/**
	 * @param studentZip the studentZip to set
	 */
	public void setStudentZip(String studentZip) {
		StudentZip = studentZip;
	}


	/**
	 * @return the studentAddress
	 */
	public String getStudentAddress() {
		return StudentAddress;
	}


	/**
	 * @param studentAddress the studentAddress to set
	 */
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}


	/**
	 * @return the studentCity
	 */
	public String getStudentCity() {
		return StudentCity;
	}


	/**
	 * @param studentCity the studentCity to set
	 */
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}


	/**
	 * @return the studentState
	 */
	public String getStudentState() {
		return StudentState;
	}


	/**
	 * @param studentState the studentState to set
	 */
	public void setStudentState(String studentState) {
		StudentState = studentState;
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
