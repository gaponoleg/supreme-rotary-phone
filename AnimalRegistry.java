import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AnimalRegistry {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showCommands(String name) {
        for (Animal animal : animals) {
            if (animal.name.equals(name)) {
                animal.performCommand();
                return;
            }
        }
        System.out.println("Animal not found");
    }

    public void teachNewCommand(String name, String newCommand) {
        for (Animal animal : animals) {
            if (animal.name.equals(name)) {
                animal.command = newCommand;
                System.out.println(name + " has been taught the new command: " + newCommand);
                return;
            }
        }
        System.out.println("Animal not found");
    }
}


