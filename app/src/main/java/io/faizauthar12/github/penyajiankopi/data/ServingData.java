package io.faizauthar12.github.penyajiankopi.data;

import java.util.ArrayList;

import io.faizauthar12.github.penyajiankopi.R;
import io.faizauthar12.github.penyajiankopi.models.Serving;

public class ServingData {
    private static String[] servingNames = {
            "Espresso",
            "Frappé",
            "Latte",
            "Americano",
            "Cappuccino",
            "Macchiato",
            "Mocha",
            "Cortado",
            "Kopi Turki",
            "Doppio"
    };

    private static String[] servingDetails = {
            "Espresso adalah minuman yang dihasilkan dengan mengekstraksi biji kopi yang sudah digiling dengan menyemburkan air panas di bawah tekanan tinggi. Espresso berasal dari Bahasa Italia yang berarti express atau cepat karena dibuat untuk disajikan dengan segera kepada pelanggan.",
            "Frappé adalah minuman es kopi khas Yunani yang bersalut buih, terbuat dari kopi instan, gula, air dan es. Frappé pertama kali diciptakan pada September 1957. Kopi ini pertama kali dibuat oleh Dimitrios Vakondios secara tidak disengaja. Dimitrios pada waktu itu adalah seorang penjual dari produk Nestlé.",
            "Latte atau Caffè latte (Bahasa Italia yang artinya kopi susu) adalah espresso atau kopi yang dicampur dengan susu dan memiliki lapisan busa yang tipis di bagian atasnya. Perbandingan antara susu dengan kopi pada caffè latte adalah 2:1. Di AS kombinasi latte terdiri dari sepertiga espresso dan dua pertiga susu panas, sehingga lebih terasa susunya dibanding cappuccino. Minuman ini pertama kali ditemukan di Italia pada akhir 1950 oleh Lino Meiorin. Ia merupakan pemilik dari sebuah cafe dan merupakan barista pertama dari Italia. Pengunjung cafenya ketika itu tidak terbiasa dengan rasa dari cappuccino tradisional yang sangat tajam dan karenanya meminta lebih banyak susu (latte) untuk dicampur dengan kopi tersebut. Lama-kelamaan Lino memutuskan untuk menjual minuman espresso dengan lebih banyak susu dan menyebutnya sebagai caffè latte. Ketika itu, ia menyajikan caffè latte dalam mangkuk dan kemudian beralih menggunakan gelas bir. Kini, caffè latte disajikan dalam cangkir.",
            "Caffè Americano (juga dikenal sebagai Americano atau Amerika; Bahasa Spanyol Italia: café americano, secara harfiah kopi Amerika) adalah jenis minuman kopi yang disiapkan dengan mengencerkan espresso dengan air panas, memberikan kekuatan yang serupa, tetapi rasa yang berbeda dari, kopi yang diseduh secara tradisional . Kekuatan Americano bervariasi dengan jumlah tembakan espresso dan jumlah air yang ditambahkan. Nama ini juga dieja dengan beragam kapitalisasi dan penggunaan diakritik: mis., Café americano.",
            "Cappuccino adalah minuman kopi berbasis espresso yang berasal dari Italia, dan secara tradisional disiapkan dengan busa susu kukus. Variasi minuman melibatkan penggunaan krim, bukan susu, dan penyedap dengan bubuk kayu manis atau cokelat.",
            "Caffè macchiato, kadang-kadang disebut espresso macchiato, adalah minuman kopi espresso dengan sedikit susu, biasanya berbusa. Dalam bahasa Italia, makchiato berarti bernoda atau terlihat sehingga terjemahan harfiah caffè macchiato adalah bernoda atau kopi bertanda.",
            "Caffè mocha, juga disebut mocaccino, adalah varian caffè latte rasa cokelat. Ejaan yang umum digunakan adalah mochaccino dan juga mochachino. Nama ini berasal dari kota Mocha, Yaman, yang merupakan salah satu pusat perdagangan kopi awal.",
            "Cortado adalah minuman yang terdiri dari espresso dicampur dengan jumlah susu hangat yang kira-kira sama untuk mengurangi keasaman. Susu dalam cortado dikukus, tetapi tidak berbusa dan bertekstur seperti pada banyak minuman kopi Italia.",
            "Kopi Turki adalah minuman kopi yang dibuat dengan menghancurkan biji kopi di dalam lesung dan menggunakan alu ataupun menggiling biji kopi tersebut hingga halus dengan gilingan kopi yang disebut kahve değirmeni. Biji kopi yang digunakan untuk membuat kopi Turki harus digiling hingga menjadi sangat halus.",
            "Espresso Doppio adalah suntikan ganda, diekstraksi menggunakan penyaring kopi ganda di portafilter. Ini menghasilkan 60 ml minuman, dua kali lipat jumlah espresso sekali minum. Lebih umum disebut double standar, itu adalah standar dalam menilai kualitas espresso dalam kompetisi barista."
    };

    private static int[] servingImages = {
            R.drawable.espresso,
            R.drawable.frappe,
            R.drawable.latte,
            R.drawable.americano,
            R.drawable.cappuccino,
            R.drawable.macchiato,
            R.drawable.mocha,
            R.drawable.cortado,
            R.drawable.turki,
            R.drawable.doppio

    };

    private static int[] servingCofee = {
            70,
            60,
            50,
            70,
            60,
            60,
            60,
            50,
            70,
            70
    };

    private static int[] servingMilk = {
            0,
            0,
            10,
            0,
            10,
            10,
            10,
            20,
            0,
            0
    };

    private static int[] servingWater = {
            30,
            40,
            40,
            30,
            30,
            30,
            30,
            30,
            30,
            30
    };

    public static ArrayList<Serving> getListData() {
        ArrayList<Serving> list = new ArrayList<>();
        for (int position = 0; position < servingNames.length; position++) {
            Serving serving = new Serving();
            serving.setName(servingNames[position]);
            serving.setDetail(servingDetails[position]);
            serving.setImg(servingImages[position]);
            serving.setCofee(servingCofee[position]);
            serving.setMilk(servingMilk[position]);
            serving.setWater(servingWater[position]);
            list.add(serving);
        }
        return list;
    }
}
