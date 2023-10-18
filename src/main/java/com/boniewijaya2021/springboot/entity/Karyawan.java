package com.boniewijaya2021.springboot.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "tbl_users", schema = "cobain")
@Table(name = "Karyawan", schema = "sample")
public class Karyawan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nama_karyawan")
    private String namaKaryawan;

    @Column(name = "nik")
    private String nik;

    @Column(name = "tanggal_lahir")
    private LocalDateTime tanggalLahir;

    @Column(name = "nomor_kk")
    private String nomorKk;

    // Getter dan Setter
}
//@Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(columnDefinition = "serial")
//  private Long id;
//  private String email;
//  private String password;