# java.util.Set

<br>

> - java.util.HashSet
> - java.util.TreeSet
> - java.util.LinkedHashSet

<br>

- Not sorted by standard.
- Don't allow duplicated elements.
- Allows addition and removal of elements.
- Not possible to search by element or updates.
- Allows surfing for reading.
- Do not allow sorting.

<br>
  
|                | When to use                                                    | Sorting                                       | Performance
|:-------------: | :----------------------------------------------------------------- | :---------------------------------------------- | :----------------------------------------------------------------------------------------------------------------|
|   _HashSet_    | When you don't need to keep it sorted.                      | Not sorted. Do not allow duplicated values. | Better performance cause not allow duplicated elements and sorting. |
|_LinkedHashSet_ | When you need to keep the insertion order.      | Keeps the order you insert the elements.       | Slower as need to keep the order of insertion.|
|   _TreeSet_    | When you need to change the order of elements by using a comparator. | Keeps the order and allows re-sorting.             | Good reading performance. Slower then LinkedHashSet when modifying the order.|

<br>

<p>=================================</p>

### _*Exercize*_
<p>Crie um set e execute as seguintes operações:

- Adicione 5 números inteiros: 3, 88, 20, 44, 3;
- Navegue no Set exibindo cada número no console;
- Remova o primeiro item do Set;
- Adicione um novo número no set: 23;
- Verifique o tamanho do Set;
- Verifique se o Set está vazio.

</p>

_Solution:_<br>

```java
import java.util.LinkedHashSet;

public class Set.ExercizeSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numsInts = new LinkedHashSet<>();

//        Add 5 numbers to the Set
        numsInts.add(3);
        numsInts.add(88);
        numsInts.add(20);
        numsInts.add(44);
        numsInts.add(3); // don't return an error but instead don't add a duplicated value, so the set still has only 4 elements.
        System.out.println(numsInts);

//        Show each element of the set on console
        for (Integer i:
                numsInts) {
            System.out.println(i);
        }

//        Remove the first element of the set
        numsInts.remove(3);
        System.out.println(numsInts);

//        Add element 23 to the set
        numsInts.add(23);

//        Check the size of the set
        System.out.println(numsInts.size());

//        Check if the set is empty
        System.out.println(numsInts.isEmpty());
    }
}
```