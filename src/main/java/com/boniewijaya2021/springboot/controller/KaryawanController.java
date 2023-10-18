package com.boniewijaya2021.springboot.controller;

import com.boniewijaya2021.springboot.entity.Karyawan;
import com.boniewijaya2021.springboot.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/karyawan")
public class KaryawanController {

    @Autowired
    private KaryawanService karyawanService;

    @GetMapping("/")
    public List<Karyawan> getAllKaryawan() {
        return karyawanService.getAllKaryawan();
    }

    @GetMapping("/{id}")
    public Karyawan getKaryawanById(@PathVariable Long id) {
        return karyawanService.getKaryawanById(id);
    }

    @PostMapping("/")
    public Karyawan saveKaryawan(@RequestBody Karyawan karyawan) {
        return karyawanService.saveKaryawan(karyawan);
    }

    @DeleteMapping("/{id}")
    public void deleteKaryawan(@PathVariable Long id) {
        karyawanService.deleteKaryawan(id);
    }
}
