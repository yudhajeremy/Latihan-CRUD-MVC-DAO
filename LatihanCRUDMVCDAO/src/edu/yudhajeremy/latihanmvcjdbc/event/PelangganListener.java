/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.yudhajeremy.latihanmvcjdbc.event;

import edu.yudhajeremy.latihanmvcjdbc.entity.Pelanggan;
import edu.yudhajeremy.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author 
 * Nama     : Yudha Jeremy Yudhistira
 * NIM      : 10116554
 * Kelas    : PBO - 12
 */
public interface PelangganListener {
    
    public void onChange (PelangganModel model);
    
    public void onInsert (Pelanggan pelanggan);
    
    public void onDelete ();
    
    public void onUpdate (Pelanggan pelanggan);
    
    
}
