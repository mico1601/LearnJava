package com.dicoding.javafundamental.basic;

public class Operator {
    public void Assignment (){
        System.out.println("1. OPERATOR ASSIGNMENT");
        System.out.println("Merupakan operator untuk pemberian nilai ke dalam variable menggunakan simbol sama dengan (=)");
        int value = 16;
        int anotherValue = 20;

        System.out.println("\nNilai Value = " + value);
        System.out.println("Nilai Another Value = "+ anotherValue);
    }

    public void Aritmatika (){
        System.out.println("2. OPERATOR ARITMATIKA");
        System.out.println("Merupakan operator yang digunakan untuk perhitungan seperti tambah, kurang, kali, bagi dll.");
        int a = 50;
        int b = 10;

        System.out.println("Penjumlahan");
        System.out.println("Hasil Penjumlahan A + B = (" + a +"+"+ b + ") = " + (a+b));
        System.out.println("\nPengurangan");
        System.out.println("Hasil Pengurangan A - B = (" + a +"-"+ b + ") = " + (a-b));
        System.out.println("\nPerkalian");
        System.out.println("Hasil Perkalian A * B = (" + a +"*"+ b + ") = " + (a*b));
        System.out.println("\nPembagian");
        System.out.println("Hasil Pembagian A / B = (" + a +"/"+ b + ") = " + (a/b));
        System.out.println("Modulus");
        System.out.println("Hasil Modulus A % B = (" + a +"%"+ b + ") = " + (a%b));


    }
}
