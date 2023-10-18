package com.boniewijaya2021.springboot.repository;

import com.boniewijaya2021.springboot.entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {
}