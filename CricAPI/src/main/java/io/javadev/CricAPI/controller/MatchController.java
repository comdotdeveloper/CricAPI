package io.javadev.CricAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javadev.CricAPI.entities.Match;
import io.javadev.CricAPI.services.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	private MatchService matchService;
	
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		
		return new ResponseEntity<List<Match>>(matchService.getLiveMatches(), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatchs(){
		return new ResponseEntity<List<Match>> (matchService.getAllMatches(), HttpStatus.OK);
	}
	
	@GetMapping("/pointtable")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<> (matchService.getPointTable(), HttpStatus.OK );
	}
}
