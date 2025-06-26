package schedule;

import java.util.LinkedList;
import java.util.Queue;

public class UserSpaceScheduler {
    private Queue<Task> taskQueue = new LinkedList<>();

    public void addTask(Task task) {
        taskQueue.add(task);
    }

    public void run() {
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            boolean hasMoreWork = task.runStep();
            if (hasMoreWork) {
//                deciding which task runs next
                taskQueue.add(task); // Re-add to the queue if not done
            }
        }
    }

}