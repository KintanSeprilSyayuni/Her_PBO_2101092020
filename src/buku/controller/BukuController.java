/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku.controller;

import buku.model.*;
import buku.view.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class BukuController {
 private FormBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao; 
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudulBuku().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
    }
    
    public void saveBuku(){
        buku = new Buku();
        buku.setKode_buku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul_buku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert OK");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku : list){
            Object[] row = {
                buku.getKode_buku(),
                buku.getJudul_buku(),
                buku.getPengarang(),
                buku.getPenerbit()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void updateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku.setKode_buku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul_buku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update Ok");
    }
    
    public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku, "Delete Ok");
    }
    
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku!= null){
            formBuku.getTxtKodeBuku().setText(buku.getKode_buku());
            formBuku.getTxtJudulBuku().setText(buku.getJudul_buku());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
        }
    }
}