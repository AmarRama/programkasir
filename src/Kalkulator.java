/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */import java.util.Scanner;
public class Kalkulator {
    
    
  public static void main(String[] args) {
  // variabel
  int a,b,operator;
  double c = 0;
  // membuat scanner
  Scanner masukan = new Scanner(System.in);

  //proses
  System.out.println("Masukkan bilangan ''pertama: ");
  a = masukan.nextInt();
  System.out.println("Masukkan bilangan kedua: ");
  b = masukan.nextInt();
  System.out.println("Pilih operasi bilangan yang dikehendaki: ");
  System.out.println("1. Penjumlahan");
  System.out.println("2. Pengurangan");
  System.out.println("3. Perkalian");
  System.out.println("4. Pembagian");
  operator = masukan.nextInt();
  double aa = a;
  double bb = b;
 
  if(operator == 1)
  c = a + b;
  if(operator == 2)
  c = a - b;
  if(operator == 3)
  c = aa * bb;
  if(operator == 4)
  c = aa / bb;
  System.out.println("Hasil = " + c);

  }

}
