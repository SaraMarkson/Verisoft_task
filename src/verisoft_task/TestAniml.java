package verisoft_task;

public class TestAniml {

    public static void main(String[] args) {
        Animal[] animalsArr = {
            new Cat(true, true, 1),
            new Dog(true, true, 2),
            new Frog(false, false, 1)};

        for (Animal animal : animalsArr) {
            System.out.println("\n" + animal);
            animal.sayHello(animal.getMood());
            if (!(animal instanceof Frog)) {
                animal.sayHello();  
            }
        }

    }
}
