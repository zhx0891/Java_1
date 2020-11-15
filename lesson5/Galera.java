package lesson5;

class Galera {


    public static void main(String[] args) {
    Employee[] compStaff = new Employee[5];
        compStaff[0]= new Employee( "Щукина Мария Викторовна","shukinam@geek.ru ", "88005009001", 30000, 24);
        compStaff[1]= new Employee( "Скляренко Наталья Леопольдовна","sklyarenkon@geek.ru ", "88005009002", 40000, 30);
        compStaff[2]= new Employee( "Морозов Иван Сергеевич","moroz@geek.ru ", "88005009003", 35000, 42);
        compStaff[3]= new Employee( "Карташёв Андрей Владимирович","akartashov@geek.ru ", "88005009004", 50000, 59);
        compStaff[4]= new Employee( "Жуков Владимир Владимирович","zhukovv@geek.ru ", "88005009005", 300000, 40);

        for (int i = 0; i < 5; i++) {
            if (compStaff[i].age > 40) compStaff[i].showInfo();

        }


    }
}
