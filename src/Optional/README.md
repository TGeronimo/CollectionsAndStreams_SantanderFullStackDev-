# OPTIONAL
___

Interface que oferece tratamento para campos que podem receber null, ou seja, 
cujo conteúdo é opcional.


Tem dois estados internos: Presente ou Vazio (tem null aqui).

## Métodos da interface Optional

### *.of()*
Insere valores do tipo passado como argumento em Optional < T >.
Caso receba um valor nulo, retornará NullPointerException.

_Exemplo_
```java
Optional<String> optionalString = Optional.of("Valor presente");
```

### *.ifPresentOrElse()*
Recebe dois argumentos, sendo o primeiro o que será executado caso
o valor estiver presente. O segundo argumento deve ser uma implementação (Consumer)
da interface Runnable e será executado no caso do estado do Optional
for "não presente".

_Exemplo_
```java
Optional<String> optionalString = Optional.of("Valor presente");

System.out.println("Valor opcional que está presente");
optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));
```

### *.ofNullable()*
Método de inserção que permite nulos. Na prática, ao receber um
valor nulo o método empty() é utilizado na construção retornando
um Optional vazio.
```java
Optional<String> optionalNull = Optional.ofNullable(null);
```
### *.empty()*
Constrói um Optional com elemento vazio.
```java
Optional<String> optionalEmpty = Optional.empty();
```
### *.isPresent()*
Retorna um boolean true, caso o valor esteja presente.
```java
optional.isPresent();
```

### *.isEmpty()*
Retorna um boolean true, caso o valor não esteja presente.
```java
optional.isEmpty();
```

### *.ifPresent()*
Retorna um boolean true, caso o valor esteja presente.
```java
optional.ifPresent(executa o Consumer definido aqui);
```

### *.get()*
Retorna o valor armazenado, ou NoSuchElementException caso seja null.
```java
optional.get();
```

### *.map()*
Transforma o valor armazenado, conforme função definida como parâmetro.
```java
// Concatena o valor existente com ****.
optional.map((valor) -> valor.concat("****"));
```
### *.orElseThrow()*
Se um valor estiver presente retorna o valor, senão retorna um Exception definida.
```java
optional.orElseThrow(IllegalStateException::new);
```
## Optional para tipos primitivos
### *OptionalInt*

```java
OptionalInt.of(99).ifPresent(System.out::println);
```
### *.OptionalDouble*

```java
OptionalDouble.of(99.9D).ifPresent(System.out::println);

```
### *.OptionalLong*

```java
OptionalLong.of(99L).ifPresent(System.out::println);
```
