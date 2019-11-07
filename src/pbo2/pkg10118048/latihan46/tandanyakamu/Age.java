/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan46.tandanyakamu;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : memberi tahu tanda seseorang berdasarkan tahun kelahirannya
 */
public class Age {
    
    private int yearBirth, yearNow;
    private final String ANSI_RED = "\u001B[31m";

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public void setYearNow(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int hitungUmur() {
        return yearNow-yearBirth;
        
    }
    
    public String tandanyaKamu(int umur) {
        String ket;
        if (umur >= 0 && umur <= 5)
            ket = ANSI_RED + "LAGI LUCU-LUCU NYA";
        else if (umur > 5 && umur <= 10)
            ket = ANSI_RED + "MASIH ANAK_ANAK";
        else if (umur > 10 && umur <= 13)
            ket = ANSI_RED + "MASIH REMAJA";
        else if (umur > 13 && umur <= 19)
            ket = ANSI_RED + "ALAY";
        else if (umur > 19 && umur <= 29)
            ket = ANSI_RED + "LAGI GALAU NYARI JODOH";
        else if (umur > 29 && umur <= 35)
            ket = ANSI_RED + "LAGI SIBUK NYARI UANG";
        else if (umur > 35 && umur <= 150)
            ket = ANSI_RED + "SUDAH TUA";
        else 
            ket = ANSI_RED + "TIDAK TERDETEKSI DI KEHIDUPAN";
        return ket;
    }
    
}
