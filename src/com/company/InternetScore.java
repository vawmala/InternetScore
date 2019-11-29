package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class InternetScore {
    private String name;
    private int category;

    private Refrigerator refrigerator;
    private Tv tv;
    private Hoover hoover;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }


    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public Hoover getHoover() {
        return hoover;
    }

    public void setHoover(Hoover hoover) {
        this.hoover = hoover;
    }

    public InternetScore(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void greeting() {
        System.out.println("Рады Вас приветствовать в нашем интернет магазине бытовой техники" + " " + name);
        System.out.println("Для предоставления более полной информации пожалуйста выберите одну из категорий интересующей Вас техники");
    }

    public void categorySelection(Appliances[] appliances1, Appliances[] basket) {
        System.out.println("1.Холодильники");
        System.out.println("2.Телевизоры");
        System.out.println("3.Пылесосы");
        System.out.println("4.Выйти из магазина");
        Scanner scr = new Scanner(System.in);
        category = scr.nextInt();
        if (category > 0 && category <= 3) {
            System.out.println("Загрузка данных по интересующей Вас категории");
        } else if (category == 4) {
            System.out.println("Оплатите Ваши товары в корзине");
            System.out.println(Arrays.toString(basket));
            System.exit(0);
        }
        if (category == 1) {
            System.out.println(appliances1[0]);
            System.out.println(appliances1[1]);
            System.out.println(appliances1[2]);
            System.out.println(appliances1[3]);
            System.out.println(appliances1[4]);

        } else if (category == 2) {
            System.out.println(appliances1[5]);
            System.out.println(appliances1[6]);
            System.out.println(appliances1[7]);
            System.out.println(appliances1[8]);
            System.out.println(appliances1[9]);
        } else if (category == 3) {
            System.out.println(appliances1[10]);
            System.out.println(appliances1[11]);
            System.out.println(appliances1[12]);
            System.out.println(appliances1[13]);
            System.out.println(appliances1[14]);
        }

    }

    public void actionStore(Appliances[] appliances1, Appliances[] basket) {
        System.out.println("Для помещения интересующего товара в корзину укажите его порядковый номер");
        System.out.println("Для возврата в предыдущее меню введите 0");
        Scanner scr = new Scanner(System.in);
        int choice = scr.nextInt();
        switch (choice) {
            case 0:
                break;
            case 1:
                basket[0] = appliances1[0];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 2:
                basket[1] = appliances1[1];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 3:
                basket[2] = appliances1[2];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 4:
                basket[3] = appliances1[3];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 5:
                basket[4] = appliances1[4];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 6:
                basket[5] = appliances1[5];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 7:
                basket[6] = appliances1[6];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 8:
                basket[7] = appliances1[7];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 9:
                basket[8] = appliances1[8];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 10:
                basket[9] = appliances1[9];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 11:
                basket[10] = appliances1[10];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 12:
                basket[11] = appliances1[11];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 13:
                basket[12] = appliances1[12];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 14:
                basket[13] = appliances1[13];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
            case 15:
                basket[14] = appliances1[14];
                System.out.println("Спасибо Ваш товар добавлен в корзину");
                break;
        }
    }

}


//    public void actionStore(Appliances[] appliances1,Appliances[] appliances2,Appliances[] appliances3) {
//    Appliances [] basket = new Appliances[15];
//        System.out.println("Для помещения интересующего товара в корзину укажите его порядковый номер");
//        System.out.println("Для возврата в предыдущее меню введите 6");
//        System.out.println("Для окончания работы магазина 7");
//        Scanner scr = new Scanner(System.in);
//        int choice = scr.nextInt();
//        switch (choice) {
//            case 1:
//                basket [0] = appliances1[0];
//                System.out.println("Спасибо Ваш товар добавлен в корзину");
//                System.out.println(Arrays.toString(basket));
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("HaHaHa");
//            case 6:
//                break;
//            case 7:
//                System.exit(0);
//        }








