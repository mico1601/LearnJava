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
    public void Unary (){
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();
        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + nilaiAwal2);
        System.out.println();
        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);
        System.out.println();
        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4);
        System.out.println();
        System.out.println("Operator komplemen logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
