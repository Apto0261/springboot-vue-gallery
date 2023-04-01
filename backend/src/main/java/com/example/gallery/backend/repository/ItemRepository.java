package com.example.gallery.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gallery.backend.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
    
}
