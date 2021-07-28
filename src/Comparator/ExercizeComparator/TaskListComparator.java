package Comparator.ExercizeComparator;

import java.util.Comparator;

public class TaskListComparator implements Comparator<TaskList> {

    @Override
    public int compare(TaskList o1, TaskList o2) {
        return o2.getTaskId() - o1.getTaskId();
    }
}
