/**
 * 
 */
package com.software.group2.repos;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.software.group2.entities.Student;

/**
 * @author Austin
 *
 */
public interface StudentRepo extends CrudRepository<Student, Integer> {

	@Query(value="SELECT EXISTS(SELECT * FROM group2.student where StudentUserName = :username)",nativeQuery=true)
	BigInteger checkBystudentUserName(@Param("username") String studentUserName);

	@Query(value="SELECT * FROM group2.student where StudentUserName = :username",nativeQuery=true)
	Optional<Student> findBystudentUserName(@Param("username") String studentUserName);
	
	

}
