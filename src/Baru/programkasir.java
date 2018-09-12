/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baru;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class programkasir {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      Scanner scan = new Scanner(System.in);
      
      
String namaKasir, namaBarang, kodeBarang;
int harga, jumlah, total = 0;
int potongan1, potongan2, potongan3;

  System.out.println("  Program Kasir   ");
  System.out.print("Nama Kasir : "); namaKasir = scan.next();
  System.out.print("Nama Barang : "); namaBarang = scan.next();
  System.out.print("Kode Barang : "); kodeBarang = scan.next();
    
System.out.print ("Masukkan Harga Barang : Rp ");
harga = input.nextInt();
System.out.print ("Jumlah Barang : ");
jumlah = input.nextInt();
total = harga*jumlah;
System.out.println("Total Bayar : Rp "+ total);
potongan1 = (total - ((total*10)/100));
potongan2 = (total - ((total*20)/100));
potongan3 = (total - ((total*50)/100));

if(total >= 500000){
System.out.println("Total Bayar (Diskon 50%) : Rp "+ potongan3);
}else if(total >= 200000 ){
System.out.println("Total Bayar (Diskon 20%) : Rp "+ potongan2);
}else if(total >= 500000){
System.out.println("Total Bayar (Diskon 10%) : Rp "+ potongan1);
}
if (jumlah >= 50 && total >= 500000) {
System.out.println("Total Bayar (Diskon 10%) : Rp " +(potongan3-((potongan3*50)/100)));
}else if (jumlah >= 50 && total >= 200000) {
System.out.println("Total Bayar : Rp "+ (potongan2-((potongan2*20)/100)));
}else if (jumlah >= 50 && total >= 100000){
System.out.println("Total Bayar (Diskon 20%) : Rp "+ (potongan1-((potongan1*10)/100)));
}else if (jumlah >= 50){
System.out.println("Total Bayar (Diskon 50%) : Rp "+ (total-((total*5)/100)));}
}
}
