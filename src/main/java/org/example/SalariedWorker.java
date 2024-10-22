package org.example;
/*Определить функцию начисления зарплаты.*/

public class SalariedWorker extends Worker
{
    public int pricePerHour;

    public SalariedWorker(String name,  int pricePerHour)
    {
        super(name);
        this.pricePerHour = pricePerHour;
    }

    public int  Salary(int workTime)
    {
        return this.pricePerHour * workTime;
    }
}