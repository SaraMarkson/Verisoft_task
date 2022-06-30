package verisoft_task;

public class Cat extends Animal implements Land {

    //Assuming these are not amputated animals
    final private int numberOfLegs = 4;

    //Constractor
    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    //Returns the number of legs of the animal
    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    //What does the cat do when he greets people
    @Override
    public void sayHello() {
        //Cats usually make a "meow~" sound when they greet people.
        System.out.println("meow~ sound");
    }

    //What does the cat do when he greets people according to his mood
    @Override
    public void sayHello(int mood) {
        switch (mood) {
            //when they are in a good mood, they make a "purr, purr" sound.
            case (Animal.MOOD_HAPPY) ->
                System.out.println("purr, purr sound");
            //when they are frightened, they make a "hiss" sound.
            case (Animal.MOOD_SCARE) ->
                System.out.println("hiss sound");
            default ->
                sayHello();
        }
    }

    @Override
    public String toString() {
        return "Hey! I'm a cat,\nThe number of my legs: " + numberOfLegs + super.toString();
    }
}
