import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;

public class A1___ViewAllTasks {

    public static void main(String[] args) throws IOException {
        FileReadingService fileReadingService = new FileReadingService();

        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        fileReadingService.showTasksInConsole(tasks);
    }
}

