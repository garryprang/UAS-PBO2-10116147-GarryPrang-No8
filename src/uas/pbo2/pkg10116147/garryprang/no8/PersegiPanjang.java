/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pbo2.pkg10116147.garryprang.no8;

/**
 * Nama     : Garry Prang
 * NIM      : 10116147
 * Kelas    : PBO-2
 * Tanggal  : 20 Februari 2021
 * No. Soal : 8
 */
public class PersegiPanjang implements BangunDatar 
{
    private int luas;
    private final int panjang, lebar;
    
    public PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void hitungLuas()
    {
        luas = panjang * lebar;
        
        System.out.println("Luas Persegi Panjang = " + luas);
    }    
}
