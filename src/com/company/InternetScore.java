package com.company;


import java.util.List;
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

    public void categorySelection(List<Appliances> refrigeratorList, List<Appliances> tvList, List<Appliances> hooverList, List<Appliances> basket) {
        System.out.println("1.Холодильники");
        System.out.println("2.Телевизоры");
        System.out.println("3.Пылесосы");
        System.out.println("4.Выйти из магазина/просмотр корзины");
        Scanner scr = new Scanner(System.in);
        category = scr.nextInt();
        if (category > 0 && category <= 3) {
            System.out.println("Загрузка данных по интересующей Вас категории");
        } else if (category == 4) {
            System.out.println("Оплатите Ваши товары в корзине");
            System.out.println(basket);

        } else if (category > 4) {
            System.out.println("Неправильно выбрана категория,попробуйте еще");
        }

        if (category == 1) {
            for (Appliances refrigerator1 : refrigeratorList) {
                System.out.println(refrigerator1);
            }
            System.out.println("Для помещения интересующего товара в корзину укажите его порядковый номер");
            System.out.println("Для возврата в предыдущее меню введите 0");
            int choice = scr.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    basket.add(refrigeratorList.get(0));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 2:
                    basket.add(refrigeratorList.get(1));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 3:
                    basket.add(refrigeratorList.get(2));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 4:
                    basket.add(refrigeratorList.get(3));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 5:
                    basket.add(refrigeratorList.get(4));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
            }
        } else if (category == 2) {
            for (Appliances tv1 : tvList) {
                System.out.println(tv1);
            }
            System.out.println("Для помещения интересующего товара в корзину укажите его порядковый номер");
            System.out.println("Для возврата в предыдущее меню введите 0");
            int choice = scr.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    basket.add(tvList.get(0));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 2:
                    basket.add(tvList.get(1));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 3:
                    basket.add(tvList.get(2));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 4:
                    basket.add(tvList.get(3));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 5:
                    basket.add(tvList.get(4));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
            }

        } else if (category == 3) {
            for (Appliances hoover1 : hooverList) {
                System.out.println(hoover1);
            }
            System.out.println("Для помещения интересующего товара в корзину укажите его порядковый номер");
            System.out.println("Для возврата в предыдущее меню введите 0");
            int choice = scr.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    basket.add(hooverList.get(0));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 2:
                    basket.add(hooverList.get(1));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 3:
                    basket.add(hooverList.get(2));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 4:
                    basket.add(hooverList.get(3));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
                case 5:
                    basket.add(hooverList.get(4));
                    System.out.println("Спасибо Ваш товар добавлен в корзину");
                    break;
            }

        }

    }
}











