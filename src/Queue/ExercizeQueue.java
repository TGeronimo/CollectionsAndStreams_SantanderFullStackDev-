package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;


public class ExercizeQueue {
    public static void main(String[] args) {
//        Add 5 names to the queue and show them to the screen
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("Zenaide");
        myQueue.add("Tales");
        myQueue.add("Thiago");
        myQueue.add("Christiane");
        myQueue.add("Neusa");
        System.out.println(myQueue);

//        Runs through the queue showing each name to the screen
        for (String queue:
                myQueue) {
            System.out.println(queue);
        }

//        Return the first element without removing it
        System.out.println("The first element of this queue is " + myQueue.peek());

//        Return the first element and remove it from the queue
        String firstName = myQueue.poll(); // In case you need the name
        System.out.println(myQueue);

//        Add a new name and check its position in the list
        myQueue.add("Pipe");
        System.out.println(myQueue);

//        Return the size of the list
        System.out.println(myQueue.size());

//        Check if the list is empty
        System.out.println(myQueue.isEmpty());


//        Check if the name Pipe is in the list

//        1) Using Iterator:

        Iterator<String> iteratorMyQueue = myQueue.iterator();

        while (iteratorMyQueue.hasNext()) {
            if (iteratorMyQueue.next().equals("Pipe")) {
                System.out.println("Pipe is here!");
            }

        }

//        2) Using for improved:

        for (String queue:
                myQueue) {
            if (queue.equals("Pipe")) {
                System.out.println("Pipe is here!");
            }
        }
    } // main
}
