// Parent class
class Animal {
    protected String name;
    protected String command;
    protected String birthDate;

    public Animal(String name, String command, String birthDate) {
        this.name = name;
        this.command = command;
        this.birthDate = birthDate;
    }

    public void performCommand() {
        System.out.println(name + " performs command: " + command);
    }
}

// Child classes
class Pet extends Animal {
    public Pet(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}

class PackAnimal extends Animal {
    public PackAnimal(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}

class Dog extends Pet {
    public Dog(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}

class Cat extends Pet {
    public Cat(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}

class Hamster extends Pet {
    public Hamster(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}

class Horse extends PackAnimal {
    public Horse(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}

class Donkey extends PackAnimal {
    public Donkey(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}
