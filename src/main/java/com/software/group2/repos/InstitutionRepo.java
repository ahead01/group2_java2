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

import com.software.group2.entities.Institution;


/**
 * @author Austin
 *
 */
public interface InstitutionRepo extends CrudRepository<Institution, Integer> {

	@Query(value="SELECT * FROM group2.institution where InstitutionName = :username",nativeQuery=true)
	Optional<Institution> findByInstitutionUserName(@Param("username") String institutionUserName);

	@Query(value="SELECT EXISTS(SELECT * FROM group2.institution where InstitutionName = :username)",nativeQuery=true)
	BigInteger checkByInstitutionUserName(@Param("username") String institutionUserName);

	@Query(value="SELECT * FROM group2.institution where InstitutionApproved = 0",nativeQuery=true)
	Iterable<Institution> findAllUnapproved();

	@Transactional
	@Modifying
	@Query(value="UPDATE group2.institution SET InstitutionDesc = :newVal WHERE InstitutionID = :id",nativeQuery=true)
	int updateInstitutionDesc(@Param("id") int institutionID, @Param("newVal") String newVal);

	@Transactional
	@Modifying
	@Query(value="UPDATE group2.institution SET InstitutionEmail = :newVal WHERE InstitutionID = :id",nativeQuery=true)
	int updateInstitutionEmail(@Param("id") int institutionID, @Param("newVal") String newVal);


}
