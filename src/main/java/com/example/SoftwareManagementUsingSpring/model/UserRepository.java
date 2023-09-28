package com.example.SoftwareManagementUsingSpring.model;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.stereotype.Repository;

import com.example.SoftwareManagementUsingSpring.model.User;



	@Repository
	public interface UserRepository extends JpaRepository<User, Long>{

//		@Query(value = "SELECT * FROM student  p WHERE p.block_no= ?1",nativeQuery = true  )
//		public List<User> findBlockByPRN(long PRN);
		
		@Query(value = "SELECT * FROM student p WHERE p.block_no = ?1 AND p.date = ?2", nativeQuery = true)
		public List<User> findBlockByPRN(long blockNo, String selectedDate);

	}

