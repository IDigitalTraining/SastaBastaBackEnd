package com.sastabasta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.sastabasta.entities.Admin;
import com.sastabasta.service.AdminService;
import com.sastabasta.service.AdminServiceImp;

@RequestMapping("admin")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("addAdmin")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin){
		return new ResponseEntity<Admin>(adminService.addAdmin(admin),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Admin> checkLogin(@RequestBody Admin admin) {
		return new ResponseEntity<Admin>(adminService.findByEmailAndPassword(admin.getEmail(),admin.getPassword()), HttpStatus.OK);
	}

}
