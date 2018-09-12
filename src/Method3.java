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
public class Method3 {
     public static int hitung(int bil1, int bil2, int bil3){
      int hasil = 0;
      if (bil1>bil2){
          if(bil1>bil3)
              hasil = bil1;
      }
         if(bil1<bil2){
             if(bil2>bil3)
                 hasil = bil2;
         }
         if (bil1<bil3){
             if (bil3>bil2)
                 hasil = bil3;
         }
         return hasil;
    }
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        int bil1,bil2,bil3,hasil;
        
        System.out.print("Masukkan bilangan 1 :");
        bil1 = masukan.nextInt();
        System.out.print("Masukkan bilangan 2 :");
        bil2 = masukan.nextInt();
        System.out.print("Masukan bilangan 3 :");
        bil3 = masukan.nextInt();
        hasil = hitung(bil1,bil2,bil3);
        System.out.println("Hasilnya yang terbesar adalah " + hasil);
        
    }
    
}
