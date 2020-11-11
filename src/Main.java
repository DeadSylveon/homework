import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        /* 4 Вывести при помощи методов из пункта 3 ФИО и должность. */
        System.out.println("Задание 4:");
        Worker worker = new Worker("Старец Игорь", "менеджер", 124546789, 2300, 36);
        System.out.println(worker.getName() + " - " + worker.getPosition() + "\n");

        /* 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет; */
        System.out.println("Задание 5:");
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иванов Михаил", "директор", 123456789, 35000, 39);
        workers[1] = new Worker("Смит Алекс", "менеджер", 475673674, 30000, 41);
        workers[2] = new Worker("Данич Ирина", "бухгалтер", 569732245, 28000, 46);
        workers[3] = new Worker("Лиходеева Анна", "back-end разработчик", 123556789, 27000, 38);
        workers[4] = new Worker("Серый Иван", "front-end разработчик", 435354444, 28000, 48);

        System.out.println("Сотрудники старше 40 лет:");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge()>40) System.out.println(workers[i].toString());
        }
        System.out.println();

        /* 6 Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000 */
        System.out.println("Задание 6:");
        System.out.println("Сотрудники, которым была повышена зарплата:");
        salaryUp(workers);
        System.out.println();

        /* 7 Подсчитать средние арифметические зарплаты и возраста */
        System.out.println("Задание 7:");
        int salaryCount = 0;
        for (int i = 0; i < workers.length; i++) {
            salaryCount += workers[i].getSalary();
        }
        System.out.println("Среднее арифметическое зарплат: " + salaryCount/workers.length);

        int ageCount = 0;
        for (int i = 0; i < workers.length; i++) {
            ageCount += workers[i].getAge();
        }
        System.out.println("Среднее арифметическое возраста: " + ageCount/workers.length);
    }

    public static void salaryUp(Worker[] workers){ // метод для задания 6
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 45) {
                workers[i].setSalary(workers[i].getSalary()+5000);
                System.out.println(workers[i]);
            }
        }
    }
}
