import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;

public class A4___ViewDONETasks {


    public static void A4(FileReadingService fileReadingService) throws IOException {
        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        List<Task> tasksTODO =
                tasks.stream()
                        .filter(x->x.getTaskStatus().equals("DONE")).toList();

        fileReadingService.showTasksInConsole(tasksTODO);
    }
}
