/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class testarraydua {

    static int nis[][] = {{210650}, {210651}, {210652}};

    static String nama[][] = {{"Ade"}, {"Galih"}, {"Baihaqi"}};

    public void tampil(String n) {
        System.out.println("Identitas Siswa Angkatan 24");
    }

    public void namanis(int n) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(nama[1][j] + ":" + nis[1][j]);
            }
        }
    }

    public static void main(String[] args) {
        testarraydua siswa = new testarraydua();
        siswa.tampil(null);
        System.out.println(nama.length);//3
        System.out.println(nama[0].length);//1
        System.out.println(nis.length);//3
        System.out.println(nis[0].length);//1
        siswa.namanis(3);
    }
}
