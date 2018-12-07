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
public class MyVideo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer VideoID;
	
	@Column(name="videoname")
	private String VideoName;
	
	@Column(name="videodesc")
	private String VideoDesc;
	
	@Column(name="videoinstitutionid")
	private Integer VideoInstitutionID;
	
	@Column(name="videoclassid")
	private Integer VideoClassID;
	
	
	
	public MyVideo() {
		super();
	}
	/**
	 * @return the videoID
	 */
	public Integer getVideoID() {
		return VideoID;
	}
	/**
	 * @param videoID the videoID to set
	 */
	public void setVideoID(Integer videoID) {
		VideoID = videoID;
	}
	/**
	 * @return the videoName
	 */
	public String getVideoName() {
		return VideoName;
	}
	/**
	 * @param videoName the videoName to set
	 */
	public void setVideoName(String videoName) {
		VideoName = videoName;
	}
	/**
	 * @return the videoDesc
	 */
	public String getVideoDesc() {
		return VideoDesc;
	}
	/**
	 * @param videoDesc the videoDesc to set
	 */
	public void setVideoDesc(String videoDesc) {
		VideoDesc = videoDesc;
	}
	/**
	 * @return the videoInstitutionID
	 */
	public Integer getVideoInstitutionID() {
		return VideoInstitutionID;
	}
	/**
	 * @param videoInstitutionID the videoInstitutionID to set
	 */
	public void setVideoInstitutionID(Integer videoInstitutionID) {
		VideoInstitutionID = videoInstitutionID;
	}
	/**
	 * @return the videoClassID
	 */
	public Integer getVideoClassID() {
		return VideoClassID;
	}
	/**
	 * @param videoClassID the videoClassID to set
	 */
	public void setVideoClassID(Integer videoClassID) {
		VideoClassID = videoClassID;
	}

}
