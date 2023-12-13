package home;

public class Dog extends Animal {
      String likeGame;

      public Dog(String likeGame,String name,int age) {
            this.name = name;
            this.age = age;
            this.likeGame = likeGame;
      }

      @Override
      public String toString() {
            return "Dog{" +
                    "likeGame='" + likeGame + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
      }

      public void toGulat(){
            System.out.printf("%s to go gulat",this.name);
      }
}
