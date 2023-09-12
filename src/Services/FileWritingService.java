package Services;

import Tasks.Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWritingService {
    private final String filePath = "TaskDatabase.txt";

    public void deleteAllTasks() throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(" ");
    }

    public void writeListOfTasksIntoDatabase(List<Task> tasks) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < tasks.size(); i++) {
                Task currentTask = tasks.get(i);
                writer.newLine();
                writer.write("----------");
                writer.newLine();
                writer.write(currentTask.getiD());
                writer.newLine();
                writer.write(currentTask.getTaskTitle());
                writer.newLine();
                writer.write(currentTask.getTaskDescription());
                writer.newLine();
                writer.write(currentTask.getDueDate());
                writer.newLine();
                writer.write(currentTask.getTaskStatus());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
