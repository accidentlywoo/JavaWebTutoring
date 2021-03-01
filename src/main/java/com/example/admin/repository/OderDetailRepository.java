package com.example.admin.repository;

import com.example.admin.model.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
