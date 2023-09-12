import Services.Communication;
import Services.FileReadingService;
import Services.FileWritingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Z2___DeleteTask {

    public static void main(String[] args) throws IOException {

        Communication communication = new Communication();
        FileReadingService fileReadingService = new FileReadingService();
        FileWritingService fileWritingService = new FileWritingService();
        Scanner scanner = new Scanner(System.in);

        communication.showTasks();

        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        fileReadingService.showTasksInConsole(tasks);

        communication.queryWhichTaskToDelete();
        String taskTitleToDelete = scanner.nextLine();

        Task identifiedTask = tasks.stream()
                .filter(x -> x.getTaskTitle().equals(taskTitleToDelete))
                .findFirst().get();

        tasks.remove(identifiedTask);

        fileWritingService.writeListOfTasksIntoDatabase(tasks);
    }
}
