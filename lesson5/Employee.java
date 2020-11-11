package lesson5;

public class Employee {
    String name;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String fio, String mail, String number, int cash, int years) {
        name=fio;
        email=mail;
        phone=number;
        salary=cash;
        age=years;
    }

    public void showInfo(){
        System.out.println("Сотрудник "+this.name);
        System.out.println("Телефон "+this.phone);
        System.out.println("Электронный адрес "+this.email);
        System.out.println("Зарплатушка "+this.salary);
        System.out.println("Возраст "+this.age);
        System.out.println();
    }
}
