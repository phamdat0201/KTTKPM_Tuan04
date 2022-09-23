package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.entity.MayBay;
import com.example.spring_data_jpa.repository.MayBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MayBayController {
	@Autowired
    private MayBayRepository maybayRepository;

    @GetMapping("cau2")
    public List<MayBay> cau2(){
        return maybayRepository.findByTambayMoreThanNKm(10000);
    }
    @GetMapping("cau7")
    public Integer cau7(){
        return maybayRepository.countMaybayByLoai("Boeing");
    }
}
