package org.example;

import java.io.ObjectInputStream;

public class EmployeeWithRate extends Worker
{
    public int workingDays;
    public int rate;

    public EmployeeWithRate(String name, int workingDays, int rate)
    {
        super(name);
        this.workingDays = workingDays;
        this.rate = rate;
    }

    public int GetRate(){
        return (int) rate;
    }

    public int Salary(){
        return this.rate*this.workingDays;
    }
}
