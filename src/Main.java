import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Constructors
        MenuEngine engine = new MenuEngine();
        Library library = new Library();
        ArrayList<Books> books = new ArrayList<>(library.getNumOfBooks());
        engine.createLibrary();

        while (true) {
            engine.printMenu();
            int choice;
            do {
                System.out.println("Изберете опция между 1 и 6");
                choice = scan.nextInt();

            } while (choice < 1 || choice > 6);
            switch (choice) {
                case 1 -> engine.addBook(books);
                case 2 -> engine.removeBook(books);
                case 3 -> engine.searchBook(books);
                case 4 -> engine.renewBook(books);
                case 5 -> engine.printAllBooks(books);
                case 6 -> {
                    System.out.println("„Довиждане! До нови срещи!“");
                    System.exit(0);
                }
                default -> System.out.println("В менюто не съществува операция под номер:" + choice + ".");


            }
        }
    }
}
