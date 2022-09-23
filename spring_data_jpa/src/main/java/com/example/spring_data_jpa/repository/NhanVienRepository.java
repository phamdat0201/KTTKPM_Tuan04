package com.example.spring_data_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_data_jpa.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
	 public List<NhanVien> findByLuongLessThanEqual(double luong);
}
