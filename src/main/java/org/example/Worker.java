package org.example;
/*Создать базовый класс – работник, и производные классы – служащий с почасовой оплатой, служащий в штате и служащий с процентной ставкой.
Определить функцию начисления зарплаты.*/

 class Worker {
    public String name;

    public Worker(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }
}

