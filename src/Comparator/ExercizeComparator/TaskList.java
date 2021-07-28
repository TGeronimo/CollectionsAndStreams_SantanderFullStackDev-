package Comparator.ExercizeComparator;

public class TaskList implements Comparable<TaskList> {

    private final Integer taskId;
    private final String taskName;

    public TaskList (Integer taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public String getTaskName () {
        return taskName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    @Override
    public String toString() {
        return taskId + " -> " + taskName;
    }

    @Override
    public int compareTo(TaskList o) {
        return this.getTaskId() - o.taskId;
    }
}
