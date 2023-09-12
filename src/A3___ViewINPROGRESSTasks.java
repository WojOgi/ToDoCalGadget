import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;

public class A3___ViewINPROGRESSTasks {
    public static void main(String[] args) throws IOException {
        FileReadingService fileReadingService = new FileReadingService();

        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        List<Task> tasksTODO =
                tasks.stream()
                        .filter(x->x.getTaskStatus().equals("IN_PROGRESS")).toList();

        fileReadingService.showTasksInConsole(tasksTODO);

    }
}