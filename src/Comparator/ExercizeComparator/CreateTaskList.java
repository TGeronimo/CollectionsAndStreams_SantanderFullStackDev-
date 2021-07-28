package Comparator.ExercizeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CreateTaskList {
    public static void main(String[] args) {

        List<TaskList> taskLists = new ArrayList<>();

        taskLists.add(new TaskList(1, "Wash the dishes"));
        taskLists.add(new TaskList(6, "Iron the clothes"));
        taskLists.add(new TaskList(5, "Sweep the floor"));
        taskLists.add(new TaskList(2, "Feed the dog"));
        taskLists.add(new TaskList(4, "Wash the clothes"));
        taskLists.add(new TaskList(3, "Study Java"));

        System.out.println(taskLists);

        taskLists.sort((first, second) -> first.getTaskId() - second.getTaskId());
        System.out.println(taskLists);

        taskLists.sort((first, second) -> second.getTaskId() - first.getTaskId());
        System.out.println(taskLists);

        taskLists.sort((Comparator.comparingInt(TaskList::getTaskId)));
        System.out.println(taskLists);

        taskLists.sort((Comparator.comparingInt(TaskList::getTaskId)).reversed());
        System.out.println(taskLists);

        Collections.sort(taskLists, new TaskListComparator());
        System.out.println(taskLists);

    }
}
