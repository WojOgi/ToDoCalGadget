import Services.Communication;
import Services.FileReadingService;
import Services.FileWritingService;

import java.io.IOException;
import java.util.Scanner;

public class ZZZ___MainApp {

    public static void main(String[] args) throws IOException {

        Communication communication = new Communication();
        FileReadingService fileReadingService = new FileReadingService();
        FileWritingService fileWritingService = new FileWritingService();
        Scanner scanner = new Scanner(System.in);

        boolean endApp = false;

        System.out.println("Start");

        while (!endApp) {

            showMenu();
            String choice = scanner.nextLine();

            if (choice.equals("A1")) {
                A1___ViewAllTasks.A1(fileReadingService);
            }
            if (choice.equals("A2")) {
                A2___ViewTODOTasks.A2(fileReadingService);

            }
            if (choice.equals("A3")) {
                A3___ViewINPROGRESSTasks.A3(fileReadingService);
            }
            if (choice.equals("A4")) {
                A4___ViewDONETasks.A4(fileReadingService);
            }
            if (choice.equals("A5")) {
                A5___ViewTasksDueToday.A5(fileReadingService);
            }
            if (choice.equals("A6")) {
                A6___ViewTasksDueOnDate.A6(fileReadingService, communication, scanner);
            }
            if (choice.equals("A7")) {
                A7___ViewAllTasksSortedByDate.A7(fileReadingService);
            }
            if (choice.equals("B1")) {
                B1___CreateNewTask.B1(communication, scanner);
            }
            if (choice.equals("B2")) {
                B2___ChangeTaskStatus.B2(communication, fileReadingService, fileWritingService, scanner);
            }
            if (choice.equals("B3")) {
                B3___EditTask.B3(communication, fileReadingService, fileWritingService, scanner);
            }
            if (choice.equals("Z1")) {
                Z1___DeleteAllTasks.Z1(fileWritingService);
            }
            if (choice.equals("Z2")) {
                Z2___DeleteTask.Z2(communication, fileReadingService, fileWritingService, scanner);
            }
            if (choice.equals("Z3")) {
                Z3___DeleteAllDONETasks.Z3(fileReadingService, fileWritingService);
            }
            if (choice.equals("E")) {
                endApp = true;
            }
        }
        System.out.println("End of App");
    }

    private static void showMenu() {
        System.out.println("Select action:");
        System.out.print("\t\t\tA1 ---> ViewAllTasks");
        System.out.print("\t\tA2 ---> ViewTODOTasks");
        System.out.print("\t\tA3 ---> ViewINPROGRESSTasks");
        System.out.print("\t\t\tA4 ---> ViewDONETasks");
        System.out.print("\t\t\tA5 ---> ViewTasksDueToday");
        System.out.print("\t\t\tA6 ---> ViewTasksDueOnDate");
        System.out.println("\t\t\tA7 ---> ViewAllTasksSortedByDate");
        System.out.print("\t\t\tB1 ---> CreateNewTask");
        System.out.print("\t\tB2 ---> ChangeTaskStatus");
        System.out.println("\tB3 ---> EditTask");
        System.out.print("\t\t\tZ1 ---> DeleteAllTasks");
        System.out.print("\t\tZ2 ---> DeleteTask");
        System.out.println("\t\t\tZ3 ---> DeleteAllDONETasks");
        System.out.println("\t\t\tE ---> End App");
        System.out.println();
        System.out.println("Input your choice:");
    }
}

