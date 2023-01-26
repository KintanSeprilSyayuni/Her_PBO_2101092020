/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kintan.model;

/**
 *
 * @author User
 */
public class Anggota {
    private String nobp;
    private String nama;
    private String alamat;

    public Anggota(){
        
    }
    
    //constructor
    public Anggota(String nobp, String nama, String alamat){
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    //setter
    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    //getter
    public String getNobp() {
        return nobp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
}
