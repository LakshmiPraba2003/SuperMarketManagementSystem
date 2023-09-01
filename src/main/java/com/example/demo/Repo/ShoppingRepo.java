package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ShoppingCart;

public interface ShoppingRepo extends JpaRepository<ShoppingCart, Integer>{

}
