package com.thecodedemo.shopeasy.repositories;

import com.thecodedemo.shopeasy.auth.entities.User;
import com.thecodedemo.shopeasy.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {

    List<Order> findByUser(User user);
}
