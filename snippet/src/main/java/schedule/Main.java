package schedule;

public class Main {
    public static void main(String[] args) {
        UserSpaceScheduler scheduler = new UserSpaceScheduler();
        scheduler.addTask(new Task("Task A", 3));
        scheduler.addTask(new Task("Task B", 5));
        scheduler.addTask(new Task("Task C", 2));

        scheduler.run();
    }
}