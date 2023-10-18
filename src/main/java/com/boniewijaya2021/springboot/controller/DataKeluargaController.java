package com.boniewijaya2021.springboot.controller;

import com.boniewijaya2021.springboot.entity.DataKeluarga;
import com.boniewijaya2021.springboot.service.DataKeluargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data-keluarga")
public class DataKeluargaController {

    @Autowired
    private DataKeluargaService dataKeluargaService;

    @GetMapping("/")
    public List<DataKeluarga> getAllDataKeluarga() {
        return dataKeluargaService.getAllDataKeluarga();
    }

    @GetMapping("/{id}")
    public DataKeluarga getDataKeluargaById(@PathVariable Long id) {
        return dataKeluargaService.getDataKeluargaById(id);
    }

    @PostMapping("/")
    public DataKeluarga saveDataKeluarga(@RequestBody DataKeluarga dataKeluarga) {
        return dataKeluargaService.saveDataKeluarga(dataKeluarga);
    }

    @DeleteMapping("/{id}")
    public void deleteDataKeluarga(@PathVariable Long id) {
        dataKeluargaService.deleteDataKeluarga(id);
    }
}
