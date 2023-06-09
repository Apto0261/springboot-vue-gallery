package com.example.gallery.backend.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int memberId;

    @Column(length =50, nullable = false)
    private String name;

    @Column(length =500, nullable = false)
    private String address;

    @Column(length =10, nullable = false)
    private String payment;

    @Column(length =16)
    private String cardNumber;

    @Column(length =500 , nullable = false)
    private String items;

    @CreationTimestamp
    @Column(name = "create_time")
    private LocalDateTime createTime;
}
