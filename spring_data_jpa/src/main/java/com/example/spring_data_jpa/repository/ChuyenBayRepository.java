package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
	
	public List<ChuyenBay> findByGaden(String gaden);
    public List<ChuyenBay> findByDodaiBetween(long min, long max);
    public List<ChuyenBay> findByGadiAndGaden(String gadi, String gaden);
    public Integer countChuyenbayByGadi(String gadi);

}
