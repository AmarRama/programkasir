/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class Latihan05 {

    public static void main(String[] args) {
        String identitas = "Abiyu Fauzan Amar Ramadhani / XRPL6 / 02";
        System.out.println("identitas :" + identitas);
        System.out.println(" ");
        kode(1);
    }

    public static void kode(int ulang) {
        if (ulang >= 1);
        int faktorial = 1;
        int angka = 0;
        Scanner as = new Scanner(System.in);
        System.out.println("Masukan faktorial dengan Rekursif");
        System.out.println(" ");
        System.out.println("Masukan Bilangan :");
        angka = as.nextInt();
        for (int i = 1; 1 <= angka; i++) {
            faktorial = i * faktorial;
        }
        System.out.println("Hasil:" + faktorial);
        kode(1);
        
    }
}
