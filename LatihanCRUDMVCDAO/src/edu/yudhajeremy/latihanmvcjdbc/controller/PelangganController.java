/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.yudhajeremy.latihanmvcjdbc.controller;

import edu.yudhajeremy.latihanmvcjdbc.model.PelangganModel;
import edu.yudhajeremy.latihanmvcjdbc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author
 * Nama     : Yudha Jeremy Yudhistira
 * NIM      : 10116554
 * Kelas    : PBO - 12
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetPelanggan(PelangganView view){
        model.resetPelanggan();
    }
    
    public void insertPelanggan(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"Nama tidak Boleh Kosong");
        }else if(nama.length()>255){
            JOptionPane.showMessageDialog(view,"Nama Tidak  Boleh Lebih Dari 255 Karakter");
        }else if(telepon.length()>12){
            JOptionPane.showMessageDialog(view,"Nomor Telepon Tidak  Boleh Lebih Dari 12 Karakter");
        }else if(!email.contains("@") || !email.contains(".")){
            JOptionPane.showMessageDialog(view,"Email Tidak Valid");
        }else {
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);
            
            try {
                model.insertPelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Ditambahkan");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan Pesan", throwable.getMessage()});
            }
        }    
            
    }
    
    public void updatePelanggan(PelangganView view){
       
        if(view.getTablePelanggan().getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(view, "Silahkan Seleksi Baris Data yang Akan Diubah");
            return;
        }
        
        Integer id = Integer.parseInt(view.getTxtId().getText());
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"Nama tidak Boleh Kosong");
        }else if(nama.length()>255){
            JOptionPane.showMessageDialog(view,"Nama Tidak  Boleh Lebih Dari 255 Karakter");
        }else if(telepon.length()>12){
            JOptionPane.showMessageDialog(view,"Nomor Telepon Tidak  Boleh Lebih Dari 12 Karakter");
        }else if(!email.contains("@") || !email.contains(".")){
            JOptionPane.showMessageDialog(view,"Email Tidak Valid");
        }else {
            model.setId(id);
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);
            
            try {
                model.updatePelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Ubah");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan Pesan", throwable.getMessage()});
            }
        } 
        
    }
    
    public void deletePelanggan(PelangganView view){
        if(view.getTablePelanggan().getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(view, "Silahkan Seleksi Baris Data yang Akan Dihapus");
            return;
        }
        
        if (JOptionPane.showInternalConfirmDialog(view, "Anda Yakin Akan Menghapus?")==JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtId().getText());
            model.setId(id);
            
           try {
                model.deletePelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Hapus");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan Pesan", throwable.getMessage()});
            }
        }
        
        
    }
    
    
}
