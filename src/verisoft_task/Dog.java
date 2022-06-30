package verisoft_task;

public class Dog extends Animal implements Land {

    //Assuming these are not amputated animals
    final private int numberOfLegs = 4;

    //Constractor
    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    //Returns the number of legs of the animal
    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    //What does the dog do when he greets people
    @Override
    public void sayHello() {
        // Dogs usually greet people by "wagging their tails". 
        System.out.println("wagging tails");
    }

    //What does the dog do when he greets people according to his mood
    @Override
    public void sayHello(int mood) {
        switch (mood) {
            //When they feel comfortable being touched, they will bark.
            case (Animal.MOOD_HAPPY) ->
                System.out.println("bark loudly");
            // When they are frightened and upset, they will make a "whooping" sound.
            case (Animal.MOOD_SCARE) ->
                System.out.println("whooping sound");
            default ->
                sayHello();
        }
    }

    @Override
    public String toString() {
        return "Hey! I'm a dog,\nThe number of my legs: " + numberOfLegs + super.toString();
    }
}
