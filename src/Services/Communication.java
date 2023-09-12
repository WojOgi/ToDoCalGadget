package Services;

public class Communication {

    public void currentContentOfDatabase() {
        System.out.println("Your current tasks are: ");
    }


    public void queryToAddTask() {

        System.out.println("Please add a new Task: ");
    }

    public void queryForTaskTitle() {
        System.out.println("What is the Title of the new Task?");
    }

    public void queryForTaskDescription() {
        System.out.println("What is the Description of the new Task");
    }

    public void queryForCompletionDate() {
        System.out.println("When does the Task need to be completed? Please input as: yyyy-MM-dd");
    }

    public void queryForTaskCompletionDate() {
        System.out.println("What is the Date the Task should be completed? yyyy-MM-dd");
    }

    public void queryWhichTaskToEdit() {
        System.out.println("Which Task would you like to Edit? Please input Task Title");
    }

    public void showTasks() {
        System.out.println("Your current list of Tasks is:");
    }

    public void queryWhichTaskToChangeStatus() {
        System.out.println("Which Task would you like to change status of? Please input Task Title");
    }

    public void queryForNewTaskStatus() {
        System.out.println("Please give a new task status. Options are: TO_DO, IN_PROGRESS, DONE");
    }

    public void queryWhichTaskToDelete() {
        System.out.println("Which Task would you like to Delete? Please input Task Title");
    }

    public void queryForDateForTasks() {
        System.out.println("Please give the due date to display corresponding Tasks. yyyy-MM-dd");
    }
}
