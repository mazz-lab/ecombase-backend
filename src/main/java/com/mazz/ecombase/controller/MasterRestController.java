package com.mazz.ecombase.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mazz.ecombase.entity.UserMaster;
import com.mazz.ecombase.repository.UserMasterRepository;

@RestController
@RequestMapping("/api")
public class MasterRestController {
	@Autowired
	UserMasterRepository userMasterRepository;

	@GetMapping("/users")
	public List<UserMaster> welcome() {
		
		return userMasterRepository.findAll();
	}
	
	///dsfdsfdsf
	// Create a new user
	@PostMapping("/user")
	public UserMaster createUser( @RequestBody UserMaster user ) {
		UserMaster us=new UserMaster();


		return userMasterRepository.save(user);
	}
	
	
	@GetMapping(path = {"/user/{userId}"})
	public ResponseEntity<UserMaster> findById(@PathVariable long userId){
	  return userMasterRepository.findById(userId)
	          .map(record -> ResponseEntity.ok().body(record))
	          .orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("/user/{userId}")
    public Optional<Object> updatePost(@PathVariable Long userId, @Valid @RequestBody UserMaster userReq) {
        return userMasterRepository.findById(userId).map(user -> {
        	user.setUserName(userReq.getUserName());
            return userMasterRepository.save(user);
        });
    }
	
	
}
