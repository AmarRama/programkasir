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

public class Latihan04 {

    public static void kode(int ulang) {
        if (ulang >= 1) {
            int hasil = 0;
            int awal = 0;
            int akhir = 0;
            Scanner as = new Scanner(System.in);
            System.out.println("Menghitung hasil jumlah bilangan m sampai n dengan Rekursif");
            System.out.println(" ");
            System.out.print("Masukan bilangan awal (m):");
            awal = as.nextInt();
            System.out.print("Masukan bilangan akhir (n):");
            akhir = as.nextInt();
            for (int i = awal; i <= akhir; i++) {
                hasil = i + hasil;
            }
            System.out.println("Hasil:" + hasil);
            kode(--ulang);
        }
    }

    public static void main(String[] args) {
        String identitas = "Abiyu Fauzan Amar Ramadhani / XRPL6 / 02";
        System.out.println("identitas :" + identitas);
        System.out.println(" ");
        kode(1);

    }
}
