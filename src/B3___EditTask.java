import Services.Communication;
import Services.FileReadingService;
import Services.FileWritingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class B3___EditTask {
    public static void main(String[] args) throws IOException {

        Communication communication = new Communication();
        FileReadingService fileReadingService = new FileReadingService();
        FileWritingService fileWritingService = new FileWritingService();
        Scanner scanner = new Scanner(System.in);

        communication.showTasks();

        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        fileReadingService.showTasksInConsole(tasks);

        communication.queryWhichTaskToEdit();
        String taskTitleToEdit = scanner.nextLine();

        Task identifiedTask =
                tasks.stream()
                        .filter(x -> x.getTaskTitle().equals(taskTitleToEdit))
                        .findFirst().get();

        communication.queryForTaskTitle();
        String taskTitle = scanner.nextLine();
        communication.queryForTaskDescription();
        String taskDescription = scanner.nextLine();
        communication.queryForTaskCompletionDate();
        String dueDate = scanner.nextLine();

        identifiedTask.setTaskTitle(taskTitle);
        identifiedTask.setTaskDescription(taskDescription);
        identifiedTask.setDueDate(dueDate);

        fileWritingService.writeListOfTasksIntoDatabase(tasks);

    }


}
