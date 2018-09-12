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
public class Latihan02 {

    public static void main(String[] args) {

        cetak(3);
    }

    public static void cetak(int i) {
        if (i > 0) {
            System.out.println("Smk Telkom Malang");
            cetak(--i);
        }
    }

}
