package com.example.spring_data_jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MAYBAY")
@Data
public class MayBay {
    
	@Id
    private String mamb;
    private String loai;
    private Long tambay;
}