import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;

public class A1___ViewAllTasks {

    public static void A1(FileReadingService fileReadingService) throws IOException {
        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        fileReadingService.showTasksInConsole(tasks);
        System.out.println("There are "+tasks.size()+" tasks in the Database.");
    }
}

