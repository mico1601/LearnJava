package com.dicoding.javafundamental.basic;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    public void Input (){
        System.out.println("\nINPUT OUTPUT");
        System.out.println("\n1. Scanner");
        System.out.println("\nScanner merupakan kelas yang menyediakan fungsi-fungsi untuk membaca dan mengambil input dari pengguna.");
        System.out.println("\nContoh program inputan dengan scanner");

        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("\nMasukkan Angka Pertama : ");a = input.nextInt();
        System.out.println("\nMasukkan Angka Kedua : ");b = input.nextInt();
        System.out.println("\nAngkan Pertama = "+a);
        System.out.println("\nAngkan Kedua = "+b);


        System.out.println("\n2. BufferedReader");
        System.out.println("\nKelas dalam Java ini merupakan paket dari Java.io. " +
                "BufferedReader dapat digunakan pada materi ini sebagai Basic Input " +
                "karena sebenarnya kelas ini tidak hanya digunakan untuk membaca input dari keyboard saja, " +
                "melainkan juga untuk mendapatkan input dari user.");
        System.out.println("\nContoh program inputan dengan BufferedReader");
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sangat sederhana");
        int value = 0;
        int anotherValue = 0;
        try {
            System.out.print("Masukan Angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int resul = value + anotherValue;
        System.out.println("Hasilnya adalah : " + resul);


    }
}
