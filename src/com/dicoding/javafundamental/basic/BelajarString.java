package com.dicoding.javafundamental.basic;

public class BelajarString {
    public void CallBelajarString() {
        System.out.println("STRING\n");
        String salam = "Hallo Gaes";
        System.out.println(salam);
        //output = Hallo Gaes

        System.out.println("\n1. Menyimpan variable char lebih dari 1 karakter");
        char[] micoChars = {'m', 'i', 'c', 'o'};

        //Membuat variable baru dari variable yang sudah ada
        String micoString = new String(micoChars);
        System.out.println(micoString);
        // output = mico

        System.out.println("\n2. Method Length untuk Mengetahui panjang string");
        int panjangString = micoString.length();
        System.out.println(panjangString);
        // output 4

        System.out.println("\n3. Method charAt Mengambil karakter tertentu (1 Karakter)");
        String ambil = "Mico Fahrizal";
        char result = ambil.charAt(8);
        System.out.println(result);
        //output = r

        System.out.println("\n4. Method Substring Mengambil karater tertentu (lebih dari 1 karakter + " +
                "hitungan karakter seperti array mulai dari index ke 0");
        String ambil2 = "Bandar Lampung";
        String hasil = ambil2.substring(0, 5);
        System.out.println(hasil);
        //output = Banda

        System.out.println("\n5. Method format Digunakan untuk memformat sebuah string.");
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

        System.out.println("\n6. Menggunakan contains() untuk mencari sebuah karakter pada sebuah string");
        String kalimat = "Ini adalah contoh kalimat";
        String kataYangDicari = "contoh";

        boolean apakahTerdapat = kalimat.contains(kataYangDicari);

        if (apakahTerdapat) {
            System.out.println("Kalimat mengandung kata '" + kataYangDicari + "'");
        } else {
            System.out.println("Kalimat tidak mengandung kata '" + kataYangDicari + "'");
        }
        // output = Kalimat mengandung kata 'contoh'


        System.out.println("\n7. Method equals, digunakan untuk membandingkan dua objek apakah sama atau tidak");
        String address = "Lampung";
        String address1 = "Lampu";
        String address2 = "Lampung";

        System.out.println(address.equals(address1)); // Output: false
        System.out.println(address.equals(address2)); // Output: true

        System.out.println("\n8. Method empty digunakan untuk mengecek apakah nilai tersebut kosong\n");
        String hati = "";
        if (hati.isEmpty()) {
            System.out.println("Anda Jomblo");
        } else {
            System.out.println("Anda tidak Jomblo");
        }
        //output = Anda Jomblo

        System.out.println("\n9. Method concat digunakan untuk menggabungkan lebih dari 1 buah string");
        String firstName = "Mico";
        String lastName = "Fahrizal";
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println(fullName); // Output: Mico Fahrizal

        System.out.println("\n10. Method replace digunakan untuk mengganti karakter dalam sebuaH string");
        String str = "Hello, World!";
        String newStr = str.replace('l', 'x');
        System.out.print("from Hello, World!");
        System.out.println(" To " + newStr); // Output: From Hello, World To Hexxo, Worxd!


        System.out.println("\n11. Method indexOf() digunakan untuk mengetahui index keberapa dari string yang dicari");
        String test = "test Index";
        String cari = "st";

        System.out.println(test.indexOf(cari));

        System.out.println("\n12. Method toLowerCase() digunakan untuk mengubah string ke huruf kecil");
        String huruf = "BeBas Aja";

        System.out.println(huruf.toLowerCase());

        System.out.println("\n13. Method toUpperCase() digunakan untuk mengubah string ke huruf Besar");
        String huruf1 = "BeBas Aja";

        System.out.println(huruf1.toUpperCase());

        System.out.println("\n14. Method trim() digunakan untuk menghapus spasi di awal atau akhir string");
        String trim = " Ini Contoh trim diawal ada spasi";
        System.out.println(trim.trim());


        System.out.println("\n15. Method valueOf(int value) digunakan untuk mengubah tipe yang diberikan menjadi sebuah string");
        int change = 20;
        System.out.println("Variable change di awal bertipe data int dan sekarang bertipe " + ((Object) String.valueOf(change)).getClass().getSimpleName());

        System.out.println("\n16. Method compareTo() digunakan untuk membandingkan dua nilai variable");
        System.out.println("Nilai negatif: Jika string pertama muncul sebelum string kedua dalam urutan abjad.\n" +
                "Nilai nol: Jika kedua string sama.\n" +
                "Nilai positif: Jika string pertama muncul setelah string kedua dalam urutan abjad.\n");
        String comp = "Apa aja";
        String comp1 = "Apa sAja";
        String comp2 = "Apa aja";

        System.out.println(comp.compareTo(comp1));
        System.out.println(comp.compareTo(comp2));
    }
}
