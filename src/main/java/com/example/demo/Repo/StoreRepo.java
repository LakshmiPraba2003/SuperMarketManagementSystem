package com.example.demo.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Customer;

public interface StoreRepo extends JpaRepository<Customer, Integer> {
    @Query(value="select * from Customer ",nativeQuery=true)
    public List<Customer> getAllRows();
}
