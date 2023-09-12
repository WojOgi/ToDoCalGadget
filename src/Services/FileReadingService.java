package Services;

import Tasks.Task;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReadingService {

    public List<String> extractAllLines() throws IOException {
        Path inputPath = Paths.get("./TaskDatabase.txt");
        return Files.readAllLines(inputPath, StandardCharsets.UTF_8);
    }

    public List<Task> getTasks(List<String> lines) {
        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).equals("----------")) {
                String iD = lines.get(i + 1);
                String taskTitle = lines.get(i + 2);
                String taskDescription = lines.get(i + 3);
                String dueDate = lines.get(i + 4);
                String taskStatus = lines.get(i+5);

                Task task = new Task(iD, taskTitle, taskDescription, dueDate, taskStatus);
                tasks.add(task);
            }
        }
        return tasks;
    }

    public void showTasksInConsole(List<Task> tasks) {
        tasks.forEach(x -> {
            System.out.println(x.getTaskTitle());
            System.out.println(x.getTaskDescription());
            System.out.println(x.getDueDate());
            System.out.println(x.getTaskStatus());
            System.out.println();
        });
    }


}
