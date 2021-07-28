# Queue

> Implements the concept of a queue with the interface Queue (java.util.Queue).

> The queue uses FIFO (First In First Out) concept on adding, reading and removing elements. It's not possible to change an element.

<br>

This method returns the first element of the list, but throws an exception (NotSuchElementException) if it is null.<br>
<br>
It happens because a LinkedList do not reuse positions. So an element occupies a position in the list and this position vanishes with the element when it is removed.

## Final Exercize

Create a list and execute the following operations:

- Add 5 names: Juliana, Pedro, Carlos, Larissa e João;
- Run through the list showing each element on screen;
- Return the first element, without removing it;
- Return the first element and remove it from the list;
- Add a new name and check its the position in the list;
- Return the size of the list;
- Check if the list is empty;
- Check if the name "Carlos" is in the list.

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;


public class Queue.ExercizeQueue {
    public static void main(String[] args) {
//        Add 5 names to the queue and show them to the screen
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("Juliana");
        myQueue.add("Pedro");
        myQueue.add("Carlos");
        myQueue.add("Larissa");
        myQueue.add("João");
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


//        Check if the name Carlos is in the list

//        1) Using Iterator:

        Iterator<String> iteratorMyQueue = myQueue.iterator();

        while (iteratorMyQueue.hasNext()) {
            if (iteratorMyQueue.next().equals("Carlos")) {
                System.out.println("Carlos is here!");
            }

        }

//        2) Using for improved:

        for (String queue:
                myQueue) {
            if (queue.equals("Carlos")) {
                System.out.println("Carlos is here!");
            }
        }
    } // main
}
```
