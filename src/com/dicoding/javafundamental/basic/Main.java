package com.dicoding.javafundamental.basic;

public class Main {
    public static void main (String[] args){
        String salam = "Hallo Gaes";
        System.out.println(salam);
//        output = Hallo Gaes
        //Menyimpan variable char lebih dari 1 karakter

        char[] micoChars = {'m', 'i', 'c', 'o'};

        //Membuat variable baru dari variable yang sudah ada
        String micoString= new String(micoChars);
        System.out.println(micoString);
        // output = mico

        //Mengetahui panjang string
        int panjangString = micoString.length();
        System.out.println(panjangString);
        // output 4

        //Mengambil karakter tertentu (1 Karakter)
        String ambil = "Mico Fahrizal";
        char result =  ambil.charAt(8);
        System.out.println(result);
        //output = r

        //Mengambil karater tertentu (lebih dari 1 karakter)
        //hitungan karakter seperti array mulai dari index ke 0
        String ambil2 = "Bandar Lampung";
        String hasil = ambil2.substring(0,5);
        System.out.println(hasil);
        //output = Banda

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

        // Menggunakan contains() untuk mencari sebuah karakter pada vsebuah string
        String kalimat = "Ini adalah contoh kalimat";
        String kataYangDicari = "contoh";

        boolean apakahTerdapat = kalimat.contains(kataYangDicari);

        if (apakahTerdapat) {
            System.out.println("Kalimat mengandung kata '" + kataYangDicari + "'");
        } else {
            System.out.println("Kalimat tidak mengandung kata '" + kataYangDicari + "'");
        }
        // output = Kalimat mengandung kata 'contoh'


        //Method equals, digunakan untuk membandingkan dua objek apakah sama atau tidak
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);
        Person person3 = new Person("Jane Doe", 25);

        System.out.println(person1.equals(person2)); // Output: true
        System.out.println(person1.equals(person3)); // Output: false
    }

}
