import Services.Communication;
import Services.FileReadingService;
import Services.FileWritingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class B2___ChangeTaskStatus {

    public static void B2(Communication communication, FileReadingService fileReadingService, FileWritingService fileWritingService, Scanner scanner) throws IOException {
        communication.showTasks();

        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        fileReadingService.showTasksInConsole(tasks);

        communication.queryWhichTaskToChangeStatus();
        String taskTitleToEdit = scanner.nextLine();

        Task identifiedTask =
                tasks.stream().
                        filter(x -> x.getTaskTitle().equals(taskTitleToEdit)).findFirst().get();

        communication.queryForNewTaskStatus();
        String taskStatus = scanner.nextLine();

        identifiedTask.setTaskStatus(taskStatus);

        fileWritingService.writeListOfTasksIntoDatabase(tasks);
    }
}
