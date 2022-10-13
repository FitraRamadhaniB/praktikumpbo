/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;
import javax.swing.JOptionPane;

/**
 *
 * @author Fitra Ramadhani Buchori
 */
public class VolumeOBJ {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Volume balok = new Volume();
        
        balok.setInput1(JOptionPane.showInputDialog("Masukkan panjang :"));
        balok.setInput2(JOptionPane.showInputDialog("Masukkan lebar : "));
        balok.setInput3(JOptionPane.showInputDialog("Masukkan tinggi : "));
        
        balok.menghitung();
    }
}

