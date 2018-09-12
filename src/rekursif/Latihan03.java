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

public class Latihan03 {

    public static void cetakAngka(int angka) {
        if (angka <= 0) {
            System.out.println(angka + " ");
            cetakAngka(--angka);
        }

    }

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        System.out.print("Masukan bilangan :");
        int N = baca.nextInt();
        cetakAngka(N);
    }
}
