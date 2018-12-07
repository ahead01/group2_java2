/**
 * 
 */
package com.software.group2.repos;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.software.group2.entities.MyClass;

/**
 * @author Austin
 *
 */
public interface MyClassRepo extends CrudRepository<MyClass, Integer> {
	
	@Query(value="SELECT * FROM group2.class where ClassInstitutionID = :institutionID",nativeQuery=true)
	Iterable<MyClass> findAllByInstitutionID(@Param("institutionID") String institutionID);

	@Query(value="SELECT * FROM group2.class where " + 
			"	ClassName like CONCAT('%', :keyword, '%') " + 
			" or ClassDesc like CONCAT('%', :keyword, '%')  " + 
			" or ClassInstitutionID like CONCAT('%', :keyword, '%')  " + 
			" or ClassInstitutionID in  (select InstitutionID from group2.institution  " + 
			"							where InstitutionName like CONCAT('%', :keyword, '%') " + 
			"							or InstitutionDesc like CONCAT('%', :keyword, '%') )",nativeQuery=true)
	Iterable<MyClass> findByKeyword(@Param("keyword") String keyword);

}
