import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Animal Registry Menu ===");
            System.out.println("1. Add new animal");
            System.out.println("2. Show commands for an animal");
            System.out.println("3. Teach a new command to an animal");
            System.out.println("4. Use Counter");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewAnimal(registry, scanner);
                    break;
                case 2:
                    showCommands(registry, scanner);
                    break;
                case 3:
                    teachNewCommand(registry, scanner);
                    break;
                case 4:
                    useCounter();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to add a new animal
    private static void addNewAnimal(AnimalRegistry registry, Scanner scanner) {
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter command: ");
        String command = scanner.nextLine();
        System.out.print("Enter birth date (YYYY-MM-DD): ");
        String birthDate = scanner.nextLine();
        System.out.print("Is it a pet (1) or pack animal (2)? ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Animal animal;
        if (type == 1) {
            animal = new Pet(name, command, birthDate);
        } else if (type == 2) {
            animal = new PackAnimal(name, command, birthDate);
        } else {
            System.out.println("Invalid type. Animal not added.");
            return;
        }

        registry.addAnimal(animal);
        System.out.println(name + " has been added to the registry.");
    }

    // Method to show commands for an animal
    private static void showCommands(AnimalRegistry registry, Scanner scanner) {
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        registry.showCommands(name);
    }

    // Method to teach a new command to an animal
    private static void teachNewCommand(AnimalRegistry registry, Scanner scanner) {
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new command: ");
        String newCommand = scanner.nextLine();
        registry.teachNewCommand(name, newCommand);
    }

    // Method to use the Counter
    private static void useCounter() {
        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            System.out.println("Counter value: " + counter.getValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
