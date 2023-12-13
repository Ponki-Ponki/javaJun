package home;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Создайте абстрактный класс "Animal" с полями "name" и "age".
 * Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
 * Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
 * Выведите на экран информацию о каждом объекте.
 * Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
 *
 * Дополнительная задача:
 *
 * Доработайте метод генерации запроса на удаление объекта из таблицы БД (DELETE FROM <Table> WHERE ID = '<id>')
 * В классе QueryBuilder который мы разработали на семинаре.
 */


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ArrayList<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Dog("play football","shark",5));
        listAnimal.add(new Cat("orange","murzic",2));

        Class<?> classAnimal = Class.forName("home.Animal");
        Method[] a = classAnimal.getDeclaredMethods();
        for (Method method: a){
            System.out.println("метод "+method);
        }
    }
}