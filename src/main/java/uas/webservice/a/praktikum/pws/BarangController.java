/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.webservice.a.praktikum.pws;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import uas.webservice.a.praktikum.pws.Barang;

/**
 *
 * @author ASUS ROG
 */
@CrossOrigin
@RestController
@RequestMapping("/data")
public class BarangController {
    @Autowired
    private BarangRepo barang;
    
    @GetMapping("/barang")
    public List<Barang> getAllbarang(){
        return barang.findAll();
    }
    
    @GetMapping("/barang/{KodeBarang}")
    public Barang getbarangById(@PathVariable String KodeBarang){
        return barang.findById(KodeBarang).get();
    }
    
    @PostMapping ("/barang")
    public Barang savebarangDetails(@RequestBody Barang i){
        return barang.save(i);
    }
    
    @PutMapping("/barang")
    public Barang updatebarang(@RequestBody Barang i){
        return barang.save(i);
    }
    
    @DeleteMapping("/barang/{KodeBarang}")
    public ResponseEntity<HttpStatus> deletebarangById(@PathVariable String KodeBarang){
        barang.deleteById(KodeBarang);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}