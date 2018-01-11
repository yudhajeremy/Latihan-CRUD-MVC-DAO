/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.yudhajeremy.latihanmvcjdbc.service;

import edu.yudhajeremy.latihanmvcjdbc.entity.Pelanggan;
import edu.yudhajeremy.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author 
 * Nama     : Yudha Jeremy Yudhistira
 * NIM      : 10116554
 * Kelas    : PBO - 12
 */
public interface PelangganDao {
    
    public void insertPelanggan (Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan (Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan (Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
