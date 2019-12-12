package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.entity.StudTest;

@Repository
public interface IStudTestRepository extends JpaRepository<StudTest, Integer> {

	@Query("SELECT st FROM StudTest st WHERE st.idStudent = ?1 AND st.idTest = ?2")
	List<StudTest> findByIdStudentAndIdTest(Integer idStudent, Integer idTest);
}
