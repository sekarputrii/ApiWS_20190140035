/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.webservice.a.praktikum.pws;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ASUS ROG
 */
@Entity
@Table(name="barang")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Barang {
    @Id
    private String kode_barang;
    private String nama_barang;
    private int harga_barang;
    private int stock_barang;
    private String agensi;
}
