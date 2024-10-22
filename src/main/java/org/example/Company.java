package org.example;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*1. Создайте класс компания Company, содержащей сотрудников и реализующей методы:
•	найм одного сотрудника — hire(),
•	найм списка сотрудников – hireAll(),
•	увольнение сотрудника – fire(),
•	получение значения дохода компании – getIncome().
Аргументы и возвращаемое значение методов выберите на основании логики работы вашего приложения.
2. Создайте два метода, возвращающие список указанной длины (count). Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы:
•	List<Employee> getTopSalaryStaff(int count),
•	List<Employee> getLowestSalaryStaff(int count).
3. Создайте классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:
•	Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег. Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
•	TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы, если доход компании более 10 млн рублей.
•	Operator — зарплата складывается только из фиксированной части.
Каждый класс сотрудника должен  реализовывать метод, возвращающий зарплату сотрудника:
•	getMonthSalary()
Аргументы и возвращаемое значение метода выберите в соответствии с логикой начисления зарплат.
Для каждого класса провести модульное тестирование основных методов класса.*/

public class Company
{
    public String name;
    //поле для хранения сотрудников, содержащее массив из объектов класса Worker
    public List<EmployeeOnStaff> workers = new ArrayList<>();

    public Company(String name, EmployeeOnStaff ... workers)
    {
        this.name = name;
        this.workers.addAll(Arrays.asList(workers));
    }

    public void hire(EmployeeOnStaff worker) {
        this.workers.add(worker);
    }

    public void hireAll(List<EmployeeOnStaff> workers) {
        this.workers.addAll(workers);
    }

    public void fire(EmployeeOnStaff worker) {
        this.workers.remove(worker);
    }

    //сортировка по убыванию зарплаты, на вывод список длины count работников с максимальной зарплатой
    public   List <EmployeeOnStaff> getTopSalaryStaff(int count){
        List<EmployeeOnStaff> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(workers.get(i));
        }
        list.sort((o1, o2) -> o2.Salary() - o1.Salary());
        return list;

    }

    //сортировка по возрастанию зарплаты, на вывод список длины count работников с минимальной зарплатой
    public List<EmployeeOnStaff> getLowestSalaryStaff(int count) {
        List<EmployeeOnStaff> list = Company.getTopSalaryStaff(count);
        //переворачиваем список
        List<EmployeeOnStaff> result= list.reversed();
        return result;
    }
}
