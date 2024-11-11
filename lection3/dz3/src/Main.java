


//1. Добавить в классовую модель из домашнего задания 1 (или написать новую модель)
//примеры использования дженерик-классов (обобщенных типов) и дженерик-интерфейсов.
//2. Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение.
//Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true если переданное число делится без остатка на 13.
//3. Написать функциональный интерфейс с методом, который принимает три дробных числа: a, b, c и
//возвращает тоже дробное число. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант.
//Кто забыл, D = b^2 — 4ac.
//
//Выполнять нужно в том же репозитории, что и остальное, но в отдельной ветке.
//Для проверки создать новый ПР и прислать на него ссылку в форму (будет в понедельник)


public class Main {
    public static void main(String[] args) {

        Square<Double> square1 = new Square<>(5.5);
        System.out.println(square1.calculateArea());
        System.out.println(square1.calculatePerimetr());

        Triangle<Double> triangle1 = new Triangle<>(10.0, 10.0, 12.0);
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle1.calculatePerimetr());

        System.out.println(square1.getInfo());
        System.out.println(triangle1.getInfo());

        CheckMethod<Integer> check =  (num) -> num% 13 == 0;
        System.out.println("Число делится на 13 "+ check.check(26));
        System.out.println("Число делится на 13 "+ check.check(98));

        Diskriminant diskriminant = (a,b,c ) -> b * b - 4*a*c;
        System.out.println("Дискриминант равен : " + diskriminant.calculate(2.0,3.0 , 1.));
        System.out.println("Дискриминант равен : " + diskriminant.calculate(4.5,10.0 , 2.5));
    }
}



