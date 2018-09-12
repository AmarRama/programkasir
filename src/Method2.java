/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Method2 {
    
    public static double hitung(double jarak, double waktu_tempuh){
        double kecepatan = jarak / waktu_tempuh;
        System.out.println("Kecapatannya adalah : " + kecepatan);
        return kecepatan;
    }
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        //inisialisasi
        double x,y;
        
            System.out.println("Masukan jarak yang ditmepuh : ");
            x = masukan.nextDouble();
            System.out.println("Masukan waktu yang ditempuh : ");
            y = masukan.nextDouble();
            hitung(x,y);
    }
}
    
    

