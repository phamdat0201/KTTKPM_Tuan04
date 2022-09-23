package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.entity.ChuyenBay;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_data_jpa.repository.ChuyenBayRepository;

@RestController
public class ChuyenBayController {
	@Autowired
    private ChuyenBayRepository chuyenbayRepository;
    @RequestMapping("cau1")
    public List<ChuyenBay> cau1(){
        return  chuyenbayRepository.findByGaden("DAD");
    }
    @RequestMapping("cau4")
    public List<ChuyenBay> cau4(){
        return  chuyenbayRepository.findByDodaiBetween(8000,10000);
    }
    @RequestMapping("cau5")
    public List<ChuyenBay> cau5(){
        return  chuyenbayRepository.findByGadiAndGaden("SGN","BMV");
    }
    @RequestMapping("cau6")
    public Integer cau6(){
        return  chuyenbayRepository.countChuyenbayByGadi("SGN");
    }
}
