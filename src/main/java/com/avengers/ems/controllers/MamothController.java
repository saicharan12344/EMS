package com.avengers.ems.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ems")
public class MamothController {
	
	@GetMapping(path= "/sample", produces = MediaType.ALL_VALUE)
	public ResponseEntity<String> sampleEndPoint(){
		return ResponseEntity.status(HttpStatus.OK).body("Working API!");
	}
}
