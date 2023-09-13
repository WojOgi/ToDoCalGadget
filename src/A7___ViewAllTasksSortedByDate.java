import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class A7___ViewAllTasksSortedByDate {
    public static void A7(FileReadingService fileReadingService) throws IOException {
        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        List<Task> tasksDateSorted =
                tasks.stream()
                        .sorted(Comparator.comparing(Task::getDueDate)).toList();

        fileReadingService.showTasksInConsole(tasksDateSorted);
    }
}
