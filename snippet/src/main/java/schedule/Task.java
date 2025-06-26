package schedule;

public class Task {
    private String name;
    private int steps;

    public Task(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }

    public boolean runStep() {
        if (steps <= 0) return false; // Task is done
        System.out.println(name + " is running. Steps left: " + steps);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        steps--;
        return true; // Task has more work
    }
}