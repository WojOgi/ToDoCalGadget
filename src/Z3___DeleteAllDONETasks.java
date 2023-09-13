import Services.FileReadingService;
import Services.FileWritingService;
import Tasks.Task;

import java.io.IOException;
import java.util.List;

public class Z3___DeleteAllDONETasks {

    public static void Z3(FileReadingService fileReadingService, FileWritingService fileWritingService) throws IOException {
        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskStatus().equals("DONE")) {
                tasks.remove(tasks.get(i));
            }
        }
        fileWritingService.writeListOfTasksIntoDatabase(tasks);
    }
}
