package com.example.SoftwareManagementUsingSpring.model;


	import java.awt.Menu;
import java.util.ArrayList;
	import java.util.List;
	import java.util.Map;
	import java.util.Optional;
	import java.util.Random;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SoftwareManagementUsingSpring.model.User;
import com.example.absentData.AbsentStudentRepository;





	@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	@RequestMapping("/users")
	public class UserController {
//		//open postm
//		@Autowired
//		private UserServiceImplementation userServ;
//		
	    private final UserRepository UserRepository;

	    @Autowired
	    public UserController(UserRepository UserRepository) {
	        this.UserRepository = UserRepository;
	    }

//		@GetMapping("/blocks")
//	    public List<User> getAllBlocks() {
//	        return userServ.getAllBlocks();
//	    }
		
		
//		@GetMapping("/blocks/{blockNo}")
//		public List<User> findBlockByPRN(@PathVariable long blockNo)
//		{
//			List<User> userList = new ArrayList<User>();
//			userList = this.userServ.findBlockByPRN(blockNo);
//			
//			return  userList;
//			
//		}
		@GetMapping("/blocks")
		public List<User> findBlockByPRN(
		    @RequestParam("blockNo") long blockNo,
		    @RequestParam("selectedDate") String selectedDate
		) {
		    List<User> userList = new ArrayList<>();
		    userList = this.UserRepository.findBlockByPRN(blockNo, selectedDate);
		    return userList;
		}

		
		
//		@GetMapping
//		public ResponseEntity<List<User>> getAllBlocks(@RequestParam(required = false) String name) {
//			try {
//				List<User> blockList  = UserRepository.getBlockFromDb(name);
//
//				
//				if (blockList.isEmpty()) {
//					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//				}
//
//				return new ResponseEntity<>(blockList, HttpStatus.OK);
//			} catch (Exception e) {
//				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//			}
//		}
		
		
		

	}
  
