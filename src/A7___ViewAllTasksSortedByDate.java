import Services.Communication;
import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class A7___ViewAllTasksSortedByDate {

    public static void main(String[] args) throws IOException {
        FileReadingService fileReadingService = new FileReadingService();
        Communication communication = new Communication();
        Scanner scanner = new Scanner(System.in);

        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        List<Task> tasksDateSorted =
                tasks.stream()
                        .sorted(Comparator.comparing(Task::getDueDate)).toList();

            fileReadingService.showTasksInConsole(tasksDateSorted);
    }
}
