import java.util.ArrayList;
import java.util.Scanner;

public class MenuEngine {
    public Scanner scan = new Scanner(System.in);

    public void createLibrary() {
        Library library = new Library();

        System.out.println("Здравейте, моля въведете информация за библиотеката!");
        System.out.println("Въведете найменование: ");
        library.setName(scan.nextLine());
        while (library.getName().length() > 100) {
            System.out.println("Въведете име не по голямо от 100 символа");
            library.setName(scan.nextLine());
        }
        System.out.println("Въведете адрес: ");
        library.setAddress(scan.nextLine());
        while (library.getAddress().length() > 500) {
            System.out.println("Въведете име не по голямо от 500 символа");
            library.setAddress(scan.nextLine());
        }
        System.out.println("Въведете Брой работници: ");
        library.setWorkers(scan.nextInt());
        while (library.getWorkers() < 0 || library.getWorkers() > 50) {
            System.out.println("Въведете число по малко от 50");
            library.setWorkers(scan.nextInt());
        }
        scan.nextLine();
        System.out.println("Въведете Брой на книги: ");
        library.setNumOfBooks(scan.nextInt());
    }

    public void printMenu() {
        System.out.println("1.Добавяне на книга");
        System.out.println("2.Премахване на книга");
        System.out.println("3.Търсене на книга");
        System.out.println("4.Обновшване на книга");
        System.out.println("5.Пълен списък с книги");
        System.out.println("6.Изход");
    }

    public void addBook(ArrayList<Books> books) {
        Books book = new Books();
        System.out.println("Въведете име на книга");
        scan.nextLine();
        book.setTitle(scan.nextLine());
        while (book.getTitle().length() > 100) {
            System.out.println("Въведете име по малко от 100 букви");
            book.setTitle(scan.nextLine());
        }
        System.out.println("Въведете жанр");
        book.setGenre(scan.nextLine());

        System.out.println("Въведете автор");
        book.setAuthor(scan.nextLine());
        while (book.getAuthor().length() > 50) {
            System.out.println("Въведете име по малко от 50 букви");
            book.setAuthor(scan.nextLine());
        }
        System.out.println("Въведете издателство");
        book.setPublisher(scan.nextLine());
        while (book.getPublisher().length() > 50) {
            System.out.println("Въведете име по малко от 50 букви");
            book.setPublisher(scan.nextLine());
        }

        System.out.println("Въведете година на издаване");
        book.setYearOfPublication(scan.nextInt());
        while (book.getYearOfPublication() > 2022) {
            System.out.println("Въведете година която не е в бъдещето");
            book.setYearOfPublication(scan.nextInt());
        }
        //   scan.nextLine();
        System.out.println("Въведете ISBN номер");
        book.setISBN(scan.next());
        while (book.getISBN().length() > 10) {
            System.out.println("Въведете ISBN номер по маклък от 10 символа");
            book.setISBN(scan.next());
        }
        scan.nextLine();
        System.out.println("Въведете брой страници");
        book.setNumOfPages(scan.nextInt());
        while (book.getNumOfPages() < 0 || book.getNumOfPages() == 0) {
            System.out.println("Въведете положително число което не е 0");
            book.setNumOfPages(scan.nextInt());
        }
        scan.nextLine();
        System.out.println("Въведете език на книгата");
        book.setLanguage(scan.next());
        scan.nextLine();
        System.out.println("Въведете наличност");
        book.setAvailability(scan.nextBoolean());
        scan.nextLine();
        System.out.println("Въведете дата на взимане");
        book.setDateOfRenting(scan.nextLine());

        System.out.println("Въведете дата на връщане");
        book.setDateOfReturning(scan.nextLine());

        System.out.println("Въведете период на взимане");
        book.setPeriodOfRenting(scan.nextLine());

        System.out.println("Въведете колко пъти е взимана книгата");
        book.setTimesTheBookWasTaken(scan.nextInt());

        while (book.getTimesTheBookWasTaken() < 0) {
            System.out.println("Въведете положително число");
            book.setTimesTheBookWasTaken(scan.nextInt());
        }
        books.add(book);

    }

    public void searchByIsbn(ArrayList<Books> books, String input) {
        for (Books book : books) {
            if (input.equals(book.getISBN())) {
                System.out.println(book);
            }
        }
    }

    public void searchByName(ArrayList<Books> books, String input) {
        for (Books book : books) {
            if (input.equals(book.getTitle())) {
                System.out.println(book);

            }
        }
    }

    public void searchByAuthor(ArrayList<Books> books, String input) {
        for (Books book : books) {
            if (input.equals(book.getAuthor())) {
                System.out.println(book);
            }
        }
    }

    public void searchByYearOfPublishing(ArrayList<Books> books, int input) {
        for (Books book : books) {
            if (input == (book.getYearOfPublication())) {
                System.out.println(book);
                if (input != (book.getYearOfPublication())) {
                    System.out.println("Книга с тази година на публикуване не съществува не съществува");
                }
            }
        }
    }


    public void searchBook(ArrayList<Books> books) {
        String input;
        int choice;
        System.out.println("По какво искате да търсите книгата");
        System.out.println("1. Име");
        System.out.println("2. ISBN");
        System.out.println("3. Автор");
        System.out.println("4. Година на издаване");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                scan.nextLine();
                input = scan.nextLine();
                searchByName(books, input);

                break;
            case 2:
                scan.nextLine();
                input = scan.nextLine();
                searchByIsbn(books, input);

                break;
            case 3:
                scan.nextLine();
                input = scan.nextLine();
                searchByAuthor(books, input);
                //scan.nextLine();
                break;
            case 4:
                int inputInt = scan.nextInt();
                searchByYearOfPublishing(books, inputInt);
                break;

        }
    }


    public void removeBook(ArrayList<Books> books) {
        int choice;
        System.out.println("1.Премахване на книга по име");
        System.out.println("2.Премахване на книга по ISBN");
        choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("Име на книга");
            printAllBooks(books);
            String input = scan.next();
            books.removeIf(book -> input.equalsIgnoreCase(book.getTitle()));
            System.out.println("Книгата с име " + input + " е премахната:");
        }
        if (choice == 2) {
            System.out.println("ISBN номер");
            printAllBooks(books);
            String inputISBN = scan.next();
            books.removeIf(book -> inputISBN.equalsIgnoreCase(book.getISBN()));
            System.out.println("Книгата с номер " + inputISBN + " е премахната:");
        }
    }


    public void printAllBooks(ArrayList<Books> books) {
        System.out.println("Списък с налияни в библиотеката: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Индекс" + " " + i + " " + books.get(i));
        }

    }

    public void renewBook(ArrayList<Books> books) {
        String inputISBN;
        System.out.println("Въведете ISBN номер");
        inputISBN = scan.next();
        for (Books book : books) {

            if (inputISBN.equalsIgnoreCase(book.getISBN())) {
                int choice;
                System.out.println("Избрахте да обновите книга с номер: " + inputISBN);
                System.out.println("Моля изберете какво искате да обновите:");
                System.out.println("1. Наличност");
                System.out.println("2. Дата, на която е взета книгата");
                System.out.println("3.дата, на която трябва да се върне книгата");
                System.out.println("4. период на взимане");
                System.out.println("5. колко пъти е взимана книгата");
                choice = scan.nextInt();
                switch (choice) {
                    case 1 -> book.setAvailability(scan.nextBoolean());
                    case 2 -> {
                        book.setDateOfRenting(scan.next());
                        scan.nextLine();
                    }
                    case 3 -> {
                        book.setDateOfReturning(scan.next());
                        scan.nextLine();
                    }
                    case 4 -> {
                        book.setPeriodOfRenting(scan.next());
                        scan.nextLine();
                    }
                    case 5 -> book.setTimesTheBookWasTaken(scan.nextInt());

                }
            }

        }

    }


}




