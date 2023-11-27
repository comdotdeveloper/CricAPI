package io.javadev.CricAPI.services;

import java.util.List;
import java.util.Map;

import io.javadev.CricAPI.entities.Match;

public interface MatchService {

	// get all matches
	List<Match> getAllMatches();
	
	// get live matches
	List<Match> getLiveMatches();
	
	List<List<String>> getPointTable();
}
