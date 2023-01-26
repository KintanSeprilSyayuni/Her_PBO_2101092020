/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class BukuDaoImpl implements BukuDao {
    private List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("WB", "Web Dinamis", "Abdul Kadir", "Erlangga"));
        data.add(new Buku("BD", "Basis Data", "Didik Setiyadi", "Deepublish"));
      
    }


    @Override
    public Buku save(Buku buku) {
        data.add(buku);
        return buku;
    }

    @Override
    public Buku update(int index, Buku buku) {
        data.set(index, buku);
        return buku;
    }
    
    @Override
    public void delete(int index) {
        data.remove(index);
    }
    
    @Override
    public Buku getBuku(int index) {
        return data.get(index);
    }
    

    @Override
    public List<Buku> getAllBuku() {
        return data;
    }
}
