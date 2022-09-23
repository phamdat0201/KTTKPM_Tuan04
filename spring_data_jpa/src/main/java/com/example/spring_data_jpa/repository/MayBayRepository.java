package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
	@Query(value = "select * from maybay where tambay>=?1",nativeQuery = true)
    public List<MayBay> findByTambayMoreThanNKm(Integer tambay);

    @Query(value = "select  count(*) from maybay where loai like %?1%",nativeQuery = true)
    public Integer countMaybayByLoai(String loai);
}
