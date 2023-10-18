package com.boniewijaya2021.springboot.service;

import com.boniewijaya2021.springboot.entity.Karyawan;
import com.boniewijaya2021.springboot.repository.KaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaryawanService {

    @Autowired
    private KaryawanRepository karyawanRepository;

    public List<Karyawan> getAllKaryawan() {
        return karyawanRepository.findAll();
    }

    public Karyawan getKaryawanById(Long id) {
        return karyawanRepository.findById(id).orElse(null);
    }

    public Karyawan saveKaryawan(Karyawan karyawan) {
        return karyawanRepository.save(karyawan);
    }

    public void deleteKaryawan(Long id) {
        karyawanRepository.deleteById(id);
    }
}