package com.company;


import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        InternetScore one = new InternetScore("БытТехник");

        List<Appliances> basket = new ArrayList<>(15);

        Appliances[] refrigerator = new Appliances[5];
        refrigerator[0] = new Refrigerator(5, "Samsung", "RB34N5440SA/UA", "Серебристый", "192x59.5x67.5", 15749, 246, "A+", 98, "No");
        refrigerator[1] = new Refrigerator(4, "Bosch", "KGN39VI306", "Нерж.сталь", "203x60x66", 15799, 279, "A++", 87, "Yes");
        refrigerator[2] = new Refrigerator(3, "Liebherr", "CP48B", "Белый", "201.1x60x65.5", 13999, 243, "A+++", 99, "No");
        refrigerator[3] = new Refrigerator(2, "Indesit", "LI8FF2X", "Нерж.сталь", "189/60/68", 8499, 215, "A++", 90, "Yes");
        refrigerator[4] = new Refrigerator(1, "LG", "GAB509SLKM", "Графит", "203x59.5x68.2", 14874, 277, "A++", 107, "Yes");
        List<Appliances> refrigeratorList = new ArrayList<>();

        for (Appliances refrigerator1 : refrigerator) {
            int k = 0;
            refrigeratorList.add(k, refrigerator1);
        }


        Appliances[] tv = new Appliances[5];
        tv[0] = new Tv(5, "Samsung", "UE50NU7002UXUA", "Black", "112.4x65x7", 14499, 50, "3840x2160", "Tizen", "Quad-core");
        tv[1] = new Tv(4, "Sony", "KDL43WF805BR", "Black", "97x63.1x26.8", 13999, 43, "1920x1080", "Android", "4K-Reality Pro");
        tv[2] = new Tv(3, "LG", "49UM7100PLB", "Titanium", "110.8x70.8x23.1", 14499, 49, "3840x2160", "WebOS4.5", "4 core processor");
        tv[3] = new Tv(2, "Philips", "43PUS7304/12", "Silver", "96.4x59.4x19", 16599, 43, "3840x2160", "AndroidTV", "Phillips P5");
        tv[4] = new Tv(1, "Kivi", "55UR50GU/GR", "Grey", "123.8x77.7x23.9", 12999, 55, "3840x2160", "Android 7.0", "-----");
        List<Appliances> tvList = new ArrayList<>();

        for (Appliances tv1 : tv) {
            int k = 0;
            tvList.add(k, tv1);
        }

        Appliances[] hoover = new Appliances[5];
        hoover[0] = new Hoover(5, "Bosch", "BGS05A225", "White", "31.4x38.1x26.8", 2499, "Container (without bag)", 1.5, 700, "Hepa 12(washing)");
        hoover[1] = new Hoover(4, "Samsung", "VC18M21DOVG/UK", "Titanium", "27.2x24.3x39.8", 2899, "Container (without bag)", 1.5, 1800, "Hepa 11");
        hoover[2] = new Hoover(3, "Rowenta", "RO3798EA", "Red", "27.62x40.94x29.03", 2999, "Container (without bag)", 1.5, 750, "Hepa 13");
        hoover[3] = new Hoover(2, "Philips", "FC9350/01", "Black", "28.1x41x24.7", 2899, "Container (without bag)", 1.5, 1800, "Hepa");
        hoover[4] = new Hoover(1, "Electrolux", "PC91GMBT", "Grey", "30.8x29.6x43.7", 8999, "Container (without bag)", 1.6, 500, "Hepa 13(washing)");
        List<Appliances> hooverList = new ArrayList<>();

        for (Appliances hoover1 : hoover) {
            int k = 0;
            hooverList.add(k, hoover1);
        }

        one.greeting();
        while (one.getCategory() != 4) {
            one.categorySelection(refrigeratorList, tvList, hooverList, basket);
        }
    }
}

