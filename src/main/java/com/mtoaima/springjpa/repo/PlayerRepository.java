package com.mtoaima.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtoaima.springjpa.model.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {
	

}
