/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : memberi tahu tanda seseorang berdasarkan tahun kelahirannya
 */
public class PBO210118048Latihan46TandanyaKamu {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Age age = new Age();
        
        age.setYearNow(2019);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.print("Hari Ini Tahun : " + age.getYearNow());
        System.out.println("\nUmur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }

}
