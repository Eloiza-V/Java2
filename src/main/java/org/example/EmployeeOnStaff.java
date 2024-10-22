package org.example;

public class EmployeeOnStaff extends Worker
{
    public int numberWorkingDays;
    public int pricePerDay;


    public EmployeeOnStaff(String name, int numberWorkingDays, int pricePerDay) {
        super(name);
        this.numberWorkingDays = numberWorkingDays;
        this.pricePerDay = pricePerDay;
    }

    public int getNumberWorkingDays()
    {
        return numberWorkingDays;
    }

    public int Salary(){
        return this.numberWorkingDays* this.pricePerDay;
    }
}
