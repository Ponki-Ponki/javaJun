package home;

public class Cat extends Animal{
    String color;

    public Cat(String color,String name, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void toEat(){
        System.out.printf("%s to go eat",this.name);
    }
    public void makeSound(){
        System.out.println("Мяу!");
    }
}
