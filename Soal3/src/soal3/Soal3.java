/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

/**
 *
 * @author ctray
 */

import java.util.Scanner;

public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan dua karakter
        System.out.print("Masukkan karakter ke-1: ");
        char karakter1 = input.next().charAt(0);
        
        System.out.print("Masukkan karakter ke-2: ");
        char karakter2 = input.next().charAt(0);
        
        // Menghitung kode ASCII dari karakter pertama dan kedua
        int kodeASCII1 = (int) karakter1;
        int kodeASCII2 = (int) karakter2;
        
        // Menjumlahkan kode ASCII dari kedua karakter
        int hasilJumlah = kodeASCII1 + kodeASCII2;
        
        // Menampilkan hasil jumlah
        System.out.println("Jumlah kode ASCII dari " + karakter1 + " dan " + karakter2 + " adalah: " + hasilJumlah);
        
        // Menutup scanner
        input.close();

    }
    
}
