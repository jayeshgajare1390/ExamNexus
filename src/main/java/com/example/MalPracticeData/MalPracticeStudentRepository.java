package com.example.MalPracticeData;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.absentData.AbsentStudent;

@Repository
public interface MalPracticeStudentRepository extends JpaRepository<MalPracticeStudent, Long> {
	List<MalPracticeStudent> findByyear(String classs);
	@Query("SELECT a FROM MalPracticeStudent a WHERE a.examyear = ?1 AND a.year = ?2 AND a.examination = ?3")
    List<MalPracticeStudent> findCustomMalPracticeStudents(String examYear, String year, String examination);
	}
