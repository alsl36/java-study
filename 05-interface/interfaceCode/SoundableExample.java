package interfaceCode;

public class SoundableExample {
    
    public static void printSound(Soundable soundable) {
        soundable.sound();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        printSound(dog);
        printSound(cat);
    }
}
