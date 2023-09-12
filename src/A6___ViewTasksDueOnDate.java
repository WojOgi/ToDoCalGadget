import Services.Communication;
import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class A6___ViewTasksDueOnDate {

    public static void main(String[] args) throws IOException {
        FileReadingService fileReadingService = new FileReadingService();
        Communication communication = new Communication();
        Scanner scanner = new Scanner(System.in);

        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        communication.queryForDateForTasks();
        String wantedDueDate = scanner.nextLine();

        List<Task> tasksDueOnDate =
                tasks.stream()
                        .filter(x -> x.getDueDate().equals(wantedDueDate)).toList();

        if (tasksDueOnDate.isEmpty()) {
            System.out.println();
            System.out.println("There are no Tasks due on " + wantedDueDate);
        } else {
            fileReadingService.showTasksInConsole(tasksDueOnDate);
        }
    }
}
