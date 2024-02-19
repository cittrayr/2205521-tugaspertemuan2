/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author ctray
 */
import java.util.Scanner;
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan ke-1: ");
        int bilangan1 = input.nextInt();
        
        System.out.print("Masukkan bilangan ke-2: ");
        int bilangan2 = input.nextInt();
        
        System.out.print("Masukkan bilangan ke-3: ");
        int bilangan3 = input.nextInt();
        
        // Menampilkan hasil operasi penambahan
        int hasilJumlah = bilangan1 + bilangan2 + bilangan3;
        System.out.println("Hasil jumlah ketiga bilangan: " + hasilJumlah);
        
        // Menampilkan hasil operasi pengurangan
        int hasilKurang = bilangan1 - bilangan2 - bilangan3;
        System.out.println("Hasil Kurang ketiga bilangan: " + hasilKurang);
        
        // Menampilkan hasil operasi perkalian
        int hasilKali = bilangan1 * bilangan2 * bilangan3;
        System.out.println("Hasil Kali ketiga bilangan: " + hasilKali);
        
        int hasilBagi = bilangan1 / bilangan2 / bilangan3;
        System.out.println("Hasil Bagian ketiga bilangan: " + hasilBagi);
    }
    
}
