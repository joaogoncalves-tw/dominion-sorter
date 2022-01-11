package com.dominion.dominionsorter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dominion.dominionsorter.services.CartaService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DominionSorterApplicationTests {

	@Autowired
	CartaService cartaService;

	@Test
	void testGet(){
		assertEquals("carta", cartaService.get());
	}
}
