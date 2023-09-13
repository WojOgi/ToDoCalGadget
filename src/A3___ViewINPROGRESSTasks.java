import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;

public class A3___ViewINPROGRESSTasks {


    public static void A3(FileReadingService fileReadingService) throws IOException {
        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        List<Task> tasksTODO =
                tasks.stream()
                        .filter(x->x.getTaskStatus().equals("IN_PROGRESS")).toList();

        fileReadingService.showTasksInConsole(tasksTODO);
    }
}
