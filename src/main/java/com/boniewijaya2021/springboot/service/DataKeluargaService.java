package com.boniewijaya2021.springboot.service;

import com.boniewijaya2021.springboot.entity.DataKeluarga;
import com.boniewijaya2021.springboot.repository.DataKeluargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataKeluargaService {

    @Autowired
    private DataKeluargaRepository dataKeluargaRepository;

    public List<DataKeluarga> getAllDataKeluarga() {
        return dataKeluargaRepository.findAll();
    }

    public DataKeluarga getDataKeluargaById(Long id) {
        return dataKeluargaRepository.findById(id).orElse(null);
    }

    public DataKeluarga saveDataKeluarga(DataKeluarga dataKeluarga) {
        return dataKeluargaRepository.save(dataKeluarga);
    }

    public void deleteDataKeluarga(Long id) {
        dataKeluargaRepository.deleteById(id);
    }
}
