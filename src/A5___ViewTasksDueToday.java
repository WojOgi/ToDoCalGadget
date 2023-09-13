import Services.FileReadingService;
import Tasks.Task;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class A5___ViewTasksDueToday {


    public static void A5(FileReadingService fileReadingService) throws IOException {
        List<String> lines = fileReadingService.extractAllLines();

        List<Task> tasks = fileReadingService.getTasks(lines);

        LocalDate currentDate = LocalDate.now();

        List<Task> tasksDueToday =
                tasks.stream()
                        .filter(x -> x.getDueDate().equals(currentDate.toString())).toList();

        if (tasksDueToday.isEmpty()) {
            System.out.println();
            System.out.println("There are no Tasks due today!");
        } else {
            fileReadingService.showTasksInConsole(tasksDueToday);
        }
    }
}
