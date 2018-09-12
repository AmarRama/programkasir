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

public class ConvertVocal2Angka {

    public static void main(String[] args) {
        String identitas = "Abiyu Fauzan Amar Ramadhani / XRPL6 / 02";
        tampilJudul(identitas);

        String kalimat = tampilInput();
        String convert = vocal2Angka(kalimat);
        tampilPerKata(kalimat, convert);
        tampilHasil(convert);

    }

    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : " + identitas);
        System.out.println("\nConvert Kalimat Alay Angka (Vokal ke Angka)\n");
    }

    private static String tampilInput() {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String kalimat = a.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);

        return kalimat;
    }

    private static String vocal2Angka(String kalimat) {
        char[][] arConvert = {{'a', '4'}, {'i', '1'}, {'u', '2'}, {'e', '3'}, {'o', '0'}};

        kalimat = kalimat.toLowerCase();
        for (int i = 0; i < arConvert.length; i++) {
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        }

        return kalimat;
    }

    private static void tampilPerKata(String kalimat, String convert) {
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");

        for (int i = 0; i < arrKal.length; i++) {
            System.out.println(arrKal[i] + " => " + arrCon[i]);
        }
    }

    private static void tampilHasil(String convert) {
        System.out.println("Kalimat Alay Angka : " + convert);
    }
}
