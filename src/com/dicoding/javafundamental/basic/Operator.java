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
        System.out.println("\n2. OPERATOR ARITMATIKA");
        System.out.println("Merupakan operator yang digunakan untuk perhitungan seperti tambah, kurang, kali, bagi dll.");
        int a = 50;
        int b = 10;

        System.out.println("\nPenjumlahan");
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
        System.out.println("\n3. OPERATOR UNARY");
        System.out.println("Merupakan operator yang melakukan berbagai operasi Aritmatik yang hanya melibatkan satu operand. " +
                "Operasi-operasi tersebut dapat berupa penambahan, pengurangan atau membalik suatu nilai dari bolean.");
        System.out.println("\nOperator Unary Plus");
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

    public void Equality(){
        System.out.println("\n4. OPERATOR EQUALITY");
        System.out.println("Merupakan operator untuk membandingkan 2 variable dan menghasilkan nilai true or false");

        int nilai1 = 20;
        int nilai2 = 30;
        boolean equal = nilai1==nilai2;
        boolean notequal = nilai1!=nilai2;
        boolean greater = nilai1>nilai2;
        boolean less = nilai1<nilai2;
        boolean greaterEq = nilai1>=nilai2;
        boolean lessEq = nilai1<=nilai2;

        System.out.println("\nEqual To");
        System.out.println("Hasil perbandingan equal antara nilai1 dan nilai2 = "+nilai1+"="+nilai2+"("+equal+")");

        System.out.println("\nNot Equal To");
        System.out.println("Hasil perbandingan not equal antara nilai1 dan nilai2 = "+nilai1+"!="+nilai2+"("+notequal+")");

        System.out.println("\nGreater Than To");
        System.out.println("Hasil perbandingan greater than antara nilai1 dan nilai2 = "+nilai1+">"+nilai2+"("+greater+")");

        System.out.println("\nLess Than To");
        System.out.println("Hasil perbandingan less than antara nilai1 dan nilai2 = "+nilai1+"<"+nilai2+"("+less+")");

        System.out.println("\nGreater Than or Equal To");
        System.out.println("Hasil perbandingan greater than or equal antara nilai1 dan nilai2 = "+nilai1+">="+nilai2+"("+greaterEq+")");

        System.out.println("\nLess Than or Equal To");
        System.out.println("Hasil perbandingan less than or equal antara nilai1 dan nilai2 = "+nilai1+"<="+nilai2+"("+lessEq+")");

    }
    public void Conditional(){
        System.out.println("\n5. OPERATOR CONDITIONAL");
        System.out.println("Merupakan operator yang digunakan pada dua atau lebih ekspresi boolean, (or(||) dan and(&&)");

        int v = 30;
        int av = 50;

        System.out.println("Hasil 30 == 50 || 30 < 50 adalah " + (v == av || v < av));
        System.out.println("Hasil 30 == 50 && 30 < 50 adalah " + (v == av && v < av));

    }
}
