/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author ctray
 */

import java.util.Scanner;
        
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Membuat objek scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan jumlah uang
        System.out.print("Masukkan jumlah uang Anda (dalam rupiah): ");
        int uang = input.nextInt();
        
        // Meminta pengguna memasukkan status cuaca (true jika hujan, false jika tidak)
        System.out.print("Apakah hari ini hujan? (true/false): ");
        boolean hujan = input.nextBoolean();
        
        // Ekspresi untuk menentukan apakah seseorang akan membeli gorengan atau tidak
        boolean akanBeliGorengan = (uang > 5000) && (!hujan);
        
        // Menampilkan hasil
        if (akanBeliGorengan) {
            System.out.println("Anda akan membeli gorengan hari ini!");
        } else {
            System.out.println("Anda tidak akan membeli gorengan hari ini.");
        }
        
        // Menutup scanner
        input.close();
    }
    
}
