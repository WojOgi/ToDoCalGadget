import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;

public class A2___ViewTODOTasks {

    public static void A2(FileReadingService fileReadingService) throws IOException {
        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        List<Task> tasksTODO =
                tasks.stream()
                        .filter(x->x.getTaskStatus().equals("TO_DO")).toList();

        fileReadingService.showTasksInConsole(tasksTODO);
    }

}
