import Services.FileWritingService;

import java.io.IOException;

public class Z1___DeleteAllTasks {
    public static void main(String[] args) throws IOException {

        FileWritingService fileWritingService = new FileWritingService();
        fileWritingService.deleteAllTasks();
    }
}
