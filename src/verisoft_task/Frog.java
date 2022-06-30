package verisoft_task;

public class Frog extends Animal implements Land, Water {

    //Assuming these are not amputated animals
    final private int numberOfLegs = 4;

    //Constractor
    public Frog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    //Returns the number of legs of the animal
    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    //What does the frog do when he greets people according to his mood
    @Override
    public void sayHello(int mood) {
        switch (mood) {
            //When the frog is in a good mood, it will sing "quack quack quack" on the shore.
            case (Animal.MOOD_HAPPY) ->
                System.out.println("quack quack quack on the shore");
            //when frightened, it will "plop into the water".
            case (Animal.MOOD_SCARE) ->
                System.out.println("plop into the water");
        }
    }

    //The frog has gills
    @Override
    public boolean hasGills() {
        return true;
    }

    //The frog lays eggs
    @Override
    public boolean hasLaysEggs() {
        return true;
    }

    @Override
    public String toString() {
        return "Hey! I'm a frog,\nThe number of my legs: " + numberOfLegs + super.toString();
    }
}
