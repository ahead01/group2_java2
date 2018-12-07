/**
 * 
 */
package com.software.group2.repos;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Austin
 *
 */
import com.software.group2.entities.Admin;


public interface AdminRepo extends CrudRepository<Admin, Integer> {
	
	@Transactional
	@Modifying
	@Query(value="UPDATE group2.institution SET InstitutionApproved = :approval WHERE InstitutionID = :id",nativeQuery=true)
	int updateApproveInst(@Param("id")  Integer id, @Param("approval")  Integer approval);

	@Query(value="SELECT EXISTS(SELECT * FROM group2.admin where adminUsername = :username)",nativeQuery=true)
	BigInteger checkByAdminUserName(@Param("username") String adminUserName);

	@Query(value="SELECT * FROM group2.admin where adminUsername = :username",nativeQuery=true)
	Optional<Admin> findByAdminUsername(@Param("username") String id);
	

}
