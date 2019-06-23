package DesignPatterns;

interface Animals {
    Animal getSpecificAnimal();
}
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is: " + name;
    }
}

class Dog implements Animals {
    private Animal obj;

    public Dog(String name) {
        obj = new Animal(name);
    }

    @Override
    public Animal getSpecificAnimal() {
        return  obj;
    }
}

class Cat implements Animals {
    private Animal obj;

    public Cat(String name) {
        obj = new Animal(name);
    }

    @Override
    public Animal getSpecificAnimal() {
        return  obj;
    }
}
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Animal kind = null;
        Animals animal = new Cat("Miauu");
        kind = animal.getSpecificAnimal();
        System.out.println(kind);
    }
}
