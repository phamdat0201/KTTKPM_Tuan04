package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.entity.NhanVien;
import com.example.spring_data_jpa.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NhanVienController {
	@Autowired
    private NhanVienRepository nhanvienRepository;
    @GetMapping("cau3")
    public List<NhanVien> cau3(){
        return nhanvienRepository.findByLuongLessThanEqual(10000);
    }
    
}
