import Services.Communication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class B1___CreateNewTask {

    public static void B1(Communication communication, Scanner scanner) {
        communication.queryToAddTask();
        communication.queryForTaskTitle();
        String taskTitle = scanner.nextLine();
        communication.queryForTaskDescription();
        String taskDescription = scanner.nextLine();
        communication.queryForTaskCompletionDate();
        String dueDate = scanner.nextLine();
        double randomDouble = Math.random();
        Integer iD = (int) (randomDouble * 10000);
        String iDString = iD.toString();

        System.out.println(iD);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("TaskDatabase.txt", true))) {
            writer.newLine();
            writer.write("----------");
            writer.newLine();
            writer.write(iDString);
            writer.newLine();
            writer.write(taskTitle);
            writer.newLine();
            writer.write(taskDescription);
            writer.newLine();
            writer.write(dueDate);
            writer.newLine();
            writer.write("TO_DO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
