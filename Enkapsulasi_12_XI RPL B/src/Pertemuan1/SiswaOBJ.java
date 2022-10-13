/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author Fitra Ramadhani Buchori
 */
public class SiswaOBJ {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Siswa s1 = new Siswa();
        s1.setNama("Fitra");
        s1.setNilai(90);
        s1.setKelas("XI RPL B");
        
        s1.getAll();
    }
}

