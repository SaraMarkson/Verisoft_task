package verisoft_task;

public abstract class Animal {

    private boolean mammals;//יונק
    private boolean carnivorous;//אוכל בשר
    public final static int MOOD_HAPPY = 1;
    public final static int MOOD_SCARE = 2;
    private int mood;

    //Constractor
    public Animal(boolean mammals, boolean carnivorous, int mood) {
        setMammals(mammals);
        setCarnivorous(carnivorous);
        setMood(mood);
    }
 
    //Returns true if the animal is mammal and else, return false
    public boolean isMammals() {
        return mammals;
    }

    //Change the mammals
    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }

    //Returns true if the animal is carnivorous and else, return false
    public boolean isCarnivorous() {
        return carnivorous;
    }

    //Change the carnivorous
    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }
    
    //Return the mood of the animal
    public int getMood() {
        return mood;
    }

    //Change the mood of the animal
    public void setMood(int mood) {
        this.mood = mood;
    }

    //What does the animal do when it greets people
    public void sayHello(){}

    //What the animal does when it greets people, depending on its mood
    public abstract void sayHello(int mood);

    @Override
    public String toString() {
        return "\nAm I a mammals? " + mammals + "\nAm I a carnivorous? " + carnivorous+"\nMy mood: "+mood;
    }
}
