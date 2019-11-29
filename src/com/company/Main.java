package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InternetScore one = new InternetScore("БытТехник");
        Appliances[] basket = new Appliances[15];
        Appliances[] appliances1 = new Appliances[15];
        appliances1[0] = new Refrigerator(1, "Samsung", "RB34N5440SA/UA", "Серебристый", "192x59.5x67.5", 15749, 246, "A+", 98, "No");
        appliances1[1] = new Refrigerator(2, "Bosch", "KGN39VI306", "Нерж.сталь", "203x60x66", 15799, 279, "A++", 87, "Yes");
        appliances1[2] = new Refrigerator(3, "Liebherr", "CP48B", "Белый", "201.1x60x65.5", 13999, 243, "A+++", 99, "No");
        appliances1[3] = new Refrigerator(4, "Indesit", "LI8FF2X", "Нерж.сталь", "189/60/68", 8499, 215, "A++", 90, "Yes");
        appliances1[4] = new Refrigerator(5, "LG", "GAB509SLKM", "Графит", "203x59.5x68.2", 14874, 277, "A++", 107, "Yes");
//       Appliances [] appliances2 = new Appliances [5];
        appliances1[5] = new Tv(6, "Samsung", "UE50NU7002UXUA", "Black", "112.4x65x7", 14499, 50, "3840x2160", "Tizen", "Quad-core");
        appliances1[6] = new Tv(7, "Sony", "KDL43WF805BR", "Black", "97x63.1x26.8", 13999, 43, "1920x1080", "Android", "4K-Reality Pro");
        appliances1[7] = new Tv(8, "LG", "49UM7100PLB", "Titanium", "110.8x70.8x23.1", 14499, 49, "3840x2160", "WebOS4.5", "4 core processor");
        appliances1[8] = new Tv(9, "Philips", "43PUS7304/12", "Silver", "96.4x59.4x19", 16599, 43, "3840x2160", "AndroidTV", "Phillips P5");
        appliances1[9] = new Tv(10, "Kivi", "55UR50GU/GR", "Grey", "123.8x77.7x23.9", 12999, 55, "3840x2160", "Android 7.0", "-----");
//       Appliances [] appliances3 = new Appliances [5];
        appliances1[10] = new Hoover(11, "Bosch", "BGS05A225", "White", "31.4x38.1x26.8", 2499, "Container (without bag)", 1.5, 700, "Hepa 12(washing)");
        appliances1[11] = new Hoover(12, "Samsung", "VC18M21DOVG/UK", "Titanium", "27.2x24.3x39.8", 2899, "Container (without bag)", 1.5, 1800, "Hepa 11");
        appliances1[12] = new Hoover(13, "Rowenta", "RO3798EA", "Red", "27.62x40.94x29.03", 2999, "Container (without bag)", 1.5, 750, "Hepa 13");
        appliances1[13] = new Hoover(14, "Philips", "FC9350/01", "Black", "28.1x41x24.7", 2899, "Container (without bag)", 1.5, 1800, "Hepa");
        appliances1[14] = new Hoover(15, "Electrolux", "PC91GMBT", "Grey", "30.8x29.6x43.7", 8999, "Container (without bag)", 1.6, 500, "Hepa 13(washing)");
        one.greeting();
        while (one.getCategory() != 7) {
            one.categorySelection(appliances1, basket);
            one.actionStore(appliances1, basket);
            System.out.println(Arrays.toString(basket));
        }
    }
}