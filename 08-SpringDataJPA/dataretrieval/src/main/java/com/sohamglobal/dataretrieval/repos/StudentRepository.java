package com.sohamglobal.dataretrieval.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sohamglobal.dataretrieval.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select s from Student s where s.course= :cnm")
	List<Student> findByCourse(@Param("cnm") String cnm);
}
