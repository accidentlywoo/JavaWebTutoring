package com.example.admin.repository;

import com.example.admin.AdminApplicationTests;
import com.example.admin.model.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest extends AdminApplicationTests {

	@Autowired
	private ItemRepository itemRepository;

	@Test
	public void create(){
		Item item = new Item();
		item.setName("노트북");
		item.setPrice(100000);
		item.setContent("삼성 노트북");

		Item save = itemRepository.save(item);
		assertNotNull(save);
	}

	@Test
	public void read(){
	    Long id = 1L;

		Optional<Item> byId = itemRepository.findById(id);

		assertTrue(byId.isPresent());
	}
}