package com.mtoaima.springjpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mtoaima.springjpa.model.Player;
import com.mtoaima.springjpa.repo.PlayerRepository;

@SpringBootTest
class SpringjpaApplicationTests {
	
	@Autowired
	private PlayerRepository repository;

	@Test
	public void testSavePlayer() {
		Player player = new Player();
		
		player.setId(1l);
		player.setName("mostafa");
		player.setScore(2);
		repository.save(player);
		
		Player savedPlayer = repository.findById(1l).get();
		assertNotNull(savedPlayer);
	}

}
