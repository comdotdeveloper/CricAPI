package io.javadev.CricAPI.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javadev.CricAPI.entities.Match;

@Repository
public interface MatchRepo extends JpaRepository<Match, Integer>{

	
	Optional<Match> findByTeamHeading(String teamHeading);
	
}
