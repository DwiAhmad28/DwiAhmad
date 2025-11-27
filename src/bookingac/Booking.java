/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
package BookingAC;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 150)
    private String paket;

    @Column(name = "harga_per_unit", nullable = false)
    private int hargaPerUnit;

    @Column(name = "jumlah_ac", nullable = false)
    private int jumlahAc;

    @Column(name = "total_harga", nullable = false)
    private long totalHarga;

    @Column(name = "tanggal_pesan", insertable = false, updatable = false)
    private Timestamp tanggalPesan;

    public Booking() {}

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPaket() { return paket; }
    public void setPaket(String paket) { this.paket = paket; }

    public int getHargaPerUnit() { return hargaPerUnit; }
    public void setHargaPerUnit(int hargaPerUnit) { this.hargaPerUnit = hargaPerUnit; }

    public int getJumlahAc() { return jumlahAc; }
    public void setJumlahAc(int jumlahAc) { this.jumlahAc = jumlahAc; }

    public long getTotalHarga() { return totalHarga; }
    public void setTotalHarga(long totalHarga) { this.totalHarga = totalHarga; }

    public Timestamp getTanggalPesan() { return tanggalPesan; }
    public void setTanggalPesan(Timestamp tanggalPesan) { this.tanggalPesan = tanggalPesan; }
}

