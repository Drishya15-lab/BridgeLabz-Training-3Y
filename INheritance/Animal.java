// Superclass
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass: Dog
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

// Subclass: Cat
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
}

// Subclass: Bird
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps: Tweet tweet!");
    }
}

// Test class
public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Tommy", 3),
                new Cat("Whiskers", 2),
                new Bird("Tweety", 1)
        };

        for (Animal a : animals) {
            System.out.print(a.name + " says: ");
            a.makeSound();  // Polymorphism in action
        }
    }
}