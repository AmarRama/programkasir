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
/**
 *
 * @author ASUS
 */
public class ProgramKasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

    String namaPembeli;
    int anggota;
    int ulangi;
    double diskon = 0.1;
    double totalBayarAkhir;
    double
jumlahBarang,hargaSatuan,totalHarga,totalBayar;

do{
    System.out.println(" ## Program Kasir  ## ");
    System.out.print("Nama Pembeli : "); namaPembeli = scan.next();
    
    System.out.print("Jumlah Barang :"); jumlahBarang = scan.nextDouble();
   
    System.out.print("Harga Satu Barang : ");
hargaSatuan = scan.nextDouble();

System.out.println("Total Harga = ");
totalHarga = jumlahBarang * hargaSatuan;

System.out.println(jumlahBarang + " * " + hargaSatuan + " = " + totalHarga );

if(totalHarga > 1000000){
if(totalHarga < 1000000){
   System.out.println(totalHarga);    
     }else
   System.out.println(totalHarga - (totalHarga * diskon));
     }else


System.out.println(totalHarga * diskon);
System.out.println("Total Bayar = ");

totalBayar = totalHarga - (totalHarga * diskon);
System.out.println(totalHarga * diskon);

System.out.println(totalHarga + " - " + "(" + totalHarga + " * " + diskon + ")" + " = " + totalBayar);

System.out.println("Apakah Anggota ? ");
System.out.println("1. Ya");
System.out.println("2. Tidak");
System.out.print("Jawab : ");
anggota = scan.nextInt();
            
if(anggota == 1){           
   if(anggota == 2){
                                    System.out.println(totalBayar);{}

 }else
            
System.out.println(totalBayarAkhir = totalBayar - (totalBayar * diskon));
 
 }else
System.out.println(totalBayar);
                    
totalBayarAkhir = scan.nextDouble();

System.out.println("Ulangi ?");
System.out.println("1=Ya");
System.out.println("2=Tidak");
System.out.print("Jawab : ");
ulangi = scan.nextInt();
}while(ulangi == 1);

System.out.println("Terima Kasih, Semoga anda puas dengan pelayanan kami");
    }
    
}