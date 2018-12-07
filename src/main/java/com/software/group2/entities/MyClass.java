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
@Entity(name = "class")
public class MyClass {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ClassID;
	
	@Column(name = "classname")
	private String ClassName;
	
	@Column(name = "classdesc")
	private String ClassDesc;
	
	@Column(name = "classseats")
	private int ClassSeats;
	
	@Column(name = "classinstitutionid")
	public Integer ClassInstitutionID;

	
	
	/**
	 * 
	 */
	public MyClass() {
		super();
	}

	/**
	 * @return the classID
	 */
	public Integer getClassID() {
		return ClassID;
	}

	/**
	 * @param classID the classID to set
	 */
	public void setClassID(Integer classID) {
		ClassID = classID;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return ClassName;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		ClassName = className;
	}

	/**
	 * @return the classDesc
	 */
	public String getClassDesc() {
		return ClassDesc;
	}

	/**
	 * @param classDesc the classDesc to set
	 */
	public void setClassDesc(String classDesc) {
		ClassDesc = classDesc;
	}

	/**
	 * @return the classSeats
	 */
	public int getClassSeats() {
		return ClassSeats;
	}

	/**
	 * @param classSeats the classSeats to set
	 */
	public void setClassSeats(int classSeats) {
		ClassSeats = classSeats;
	}

	/**
	 * @return the classInstitutionID
	 */
	public Integer getClassInstitutionID() {
		return ClassInstitutionID;
	}

	/**
	 * @param classInstitutionID the classInstitutionID to set
	 */
	public void setClassInstitutionID(Integer classInstitutionID) {
		ClassInstitutionID = classInstitutionID;
	}

	
}
