/**
 * 
 */
package com.software.group2.entities;

/**
 * @author Austin
 *
 */
public interface User {	

	/**
	 * @return a boolean value indicating if the user is 
	 * authenticated or not
	 */
	public boolean isAuthenticated();

	/**
	 * @return the id
	 */
	public Integer getId();
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id);
	
	/**
	 * @return the pwd
	 */
	public String getPwd();
	
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd);	

}
