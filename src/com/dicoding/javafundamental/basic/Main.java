package com.dicoding.javafundamental.basic;

public class Main {
    public static void main (String[] args){
        System.out.println("Belajar String\n");
        String salam = "Hallo Gaes";
        System.out.println(salam);
        //output = Hallo Gaes

        System.out.println("\nMenyimpan variable char lebih dari 1 karakter");
        char[] micoChars = {'m', 'i', 'c', 'o'};

        //Membuat variable baru dari variable yang sudah ada
        String micoString= new String(micoChars);
        System.out.println(micoString);
        // output = mico

        System.out.println("\nMethod Length untuk Mengetahui panjang string");
        int panjangString = micoString.length();
        System.out.println(panjangString);
        // output 4

        System.out.println("\nMethod charAt Mengambil karakter tertentu (1 Karakter)");
        String ambil = "Mico Fahrizal";
        char result =  ambil.charAt(8);
        System.out.println(result);
        //output = r

        System.out.println("Method Substring Mengambil karater tertentu (lebih dari 1 karakter + " +
                "hitungan karakter seperti array mulai dari index ke 0");
        String ambil2 = "Bandar Lampung";
        String hasil = ambil2.substring(0,5);
        System.out.println(hasil);
        //output = Banda

        System.out.println("\nMethod format Digunakan untuk memformat sebuah string.");
        String nama = "Andi";
        int umur = 25;
        double tinggiBadan = 1.75;
        // Contoh 1: Menyisipkan string dan integer
        String kalimat1 = String.format("Nama saya %s dan umur saya %d tahun.", nama, umur);
        System.out.println(kalimat1);
        //output = Nama saya Andi dan umur saya 25 tahun.

        // Contoh 2: Menyisipkan string, integer, dan double
        String kalimat2 = String.format("Tinggi badan %s adalah %.2f meter.", nama, tinggiBadan);
        System.out.println(kalimat2);
        //output = Tinggi badan Andi adalah 1.75 meter.

        // Contoh 3: Menggunakan placeholder dengan nomor
        String kalimat3 = String.format("Nilai ujian Matematika: %1$d, Bahasa Inggris: %2$d", 85, 90);
        System.out.println(kalimat3);
        //output = Nilai ujian Matematika: 85, Bahasa Inggris:90

        System.out.println("Menggunakan contains() untuk mencari sebuah karakter pada sebuah string");
        String kalimat = "Ini adalah contoh kalimat";
        String kataYangDicari = "contoh";

        boolean apakahTerdapat = kalimat.contains(kataYangDicari);

        if (apakahTerdapat) {
            System.out.println("Kalimat mengandung kata '" + kataYangDicari + "'");
        } else {
            System.out.println("Kalimat tidak mengandung kata '" + kataYangDicari + "'");
        }
        // output = Kalimat mengandung kata 'contoh'


        System.out.println("Method equals, digunakan untuk membandingkan dua objek apakah sama atau tidak");
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);
        Person person3 = new Person("Jane Doe", 25);

        System.out.println(person1.equals(person2)); // Output: true
        System.out.println(person1.equals(person3)); // Output: false

        System.out.println("Method empty digunakan untuk mengecek apakah nilai tersebut kosong\n");
        String hati = "";
        if (hati.isEmpty()) {
            System.out.println("Anda Jomblo");
        } else {
            System.out.println("Anda tidak Jomblo");
        }
        //output = Anda Jomblo

        System.out.println("Method concat digunakan untuk menggabungkan lebih dari 1 buah string");
        String firstName = "Mico";
        String lastName = "Fahrizal";
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println(fullName); // Output: Mico Fahrizal

        System.out.println("Method replace digunakan untuk mengganti karakter dalam sebuat string");
        String str = "Hello, World!";
        String newStr = str.replace('l', 'x');
        System.out.print("from Hello, World!");
        System.out.println(" To "+newStr); // Output: From Hello, World To Hexxo, Worxd!


    }

}
