package com.example.admin.repository;

import com.example.admin.AdminApplicationTests;
import com.example.admin.model.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class OderDetailRepositoryTest extends AdminApplicationTests {

	@Autowired
	private OderDetailRepository oderDetailRepository;

	@Test
	public void create(){
		OrderDetail orderDetail = new OrderDetail();

		orderDetail.setOrderAt(LocalDateTime.now());

		orderDetail.setUserId(1L);

		orderDetail.setItemId(1L);

		OrderDetail save = oderDetailRepository.save(orderDetail);

		assertNotNull(save);

	}
}