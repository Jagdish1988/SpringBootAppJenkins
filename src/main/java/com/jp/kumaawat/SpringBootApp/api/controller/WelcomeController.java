/**
 * 
 */
package com.jp.kumaawat.SpringBootApp.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("/api/v1/welcome")
public class WelcomeController {
	
	@GetMapping
	public ResponseEntity<String> getWelcome() {
		return ResponseEntity.ok("Hi Welcome and Congratulations...");
	}
}
