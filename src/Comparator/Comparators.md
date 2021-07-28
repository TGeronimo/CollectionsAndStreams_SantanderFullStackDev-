# **COMPARATORS**
___
## Interfaces _Comparator_ e _Comparable_

<br>

> Com a finalidade de padronização de objetos que podem ser ordenados, são utilizadas mais comumente com java.util.List.

<br>

> **Comparator** é utilizada para definir uma classe com uma regra de ordenação ou de negócio.
> * Objetos não complexos são tipos **primitivos e strings**.
> * Pode ser aplicada em uma classe externa aos dois objetos a serem comparados (argumentos).
>   * Neste caso, temos regras predefinidas de ordenação como, por exemplo, ordem alfabética e ordem crescente ou decrescente de números.
> * **Objetos complexos** são aqueles que tem tipo definido pelo usuário ou dev, por exemplo, objetos tipo carro, usuário, etc.
>   * As regras de ordenação, ou de negócio, precisam ser definidas na classe.

> **Comparable** deve ser implementada dentro da classe de domínio.
> * A comparação será entre uma instância do objeto da classe de domínio (this) e o objeto passado como argumento para compareTo().
> * A regra de negócio que será utilizada para a ordenação deve ser definida ao sobrescrever o método compareTo().
> * compareTo() deve retornar um int, sendo 1, -1 ou 0.

___

### **Exercício**

Crie uma lista de um objeto complexo e execute as seguintes operações:


1. Adicione elementos na lista;
2. Ordene implementando _java.util.Comparator_;
3. Ordene implementando um novo objeto com a interface _java.util.Comparable_;
4. Ordene usando uma expressão lambda na chamada de suaLista.sort().
5. Ordene usando referências de métodos e os métodos estáticos de Comparator;
6. Ordene coleções TreeSet e TreeMap.

Solução

```java
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
```
```java
import java.util.Comparator;

public class TaskListComparator implements Comparator<TaskList> {

    @Override
    public int compare(TaskList o1, TaskList o2) {
        return o2.getTaskId() - o1.getTaskId();
    }
}
```

```java
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
```



