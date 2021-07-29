package Javadoc.Stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaDocExamples {
    public static void main(String[] args) throws IOException {

//        Criação de Stream a partir de um Map
        Map<String, String> exMap = new HashMap<>();
        exMap.put("key1", "value1");
        exMap.put("key2", "value2");
        exMap.put("key3", "value3");

        Stream<String> stream = exMap.values().stream();
        stream.forEach(System.out::println);

//        Métodos estáticos Stream.of() e Arrays.stream()
        Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4, 5);
        IntStream numbersFromArray = Arrays.stream(new int[]{1, 2, 3, 4, 5});

//        Criando uma stream de linhas a partir do conteúdo de um arquivo
//        usando Files.line(Path path)
        Stream<String> lines = Files.lines(Paths.get("/home/h4ck1r0n/Documents/santanderFullstackDev/" +
                        "CollectionsStreams/src/Javadoc/Stream/MyFile.txt"),
                Charset.defaultCharset());
        long numbersLines = lines.count();
        System.out.println("MyFile.txt has " + numbersLines + " lines.");


//        Operações intermediárias da Streams API
//        mais usadas: filter(), map(), sorted(), limit(), distinct()

//        filter()
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        Stream<Pessoa> stream1 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        stream1.forEach(System.out::println);

//        map()
        List<Pessoa> pessoas1 = new Pessoa().populaPessoas();
        IntStream stream2 = pessoas1.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);
        stream2.forEach(System.out::println);
//        Como o uso do map() após o filter() retornaria uma outra stream o
//        Stream<Pessoa> não pode ser utilizado, pois espera um retorno do tipo Pessoa.
//        IntStream foi utilizado (não usa generics), em conjunto com o mapToInt()
//        no lugar de Stream<Pessoa> e map().


//        sorted()
        List<Pessoa> pessoas2 = new Pessoa().populaPessoas();
        Stream<Pessoa> stream3 = pessoas2.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome).reversed());
        stream3.forEach(System.out::println);

//        Operações Terminais

//        forEach() já usamos acima
//        avegare()
        List<Pessoa> pessoas3 = new Pessoa().populaPessoas();
        double media = pessoas3.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade)
                .average()
                .getAsDouble();
        System.out.println(media);

//        collect()
        List<Pessoa> pessoasComM = pessoas.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .collect(Collectors.toList());
        pessoasComM.forEach(System.out::println);

    }
}

class Pessoa {
    String id;
    String nome;
    String nacionalidade;
    int idade;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1", "Matheus Henrique", "Brasil", 18);
        Pessoa pessoa2 = new Pessoa("p2", "Hernandez Roja", "Mexico", 21);
        Pessoa pessoa3 = new Pessoa("p3", "Mario Fernandes", "Canada", 22);
        Pessoa pessoa4 = new Pessoa("p4", "Neymar Junior", "Brasil", 22);
        List<Pessoa> list = new ArrayList<>();
        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        list.add(pessoa4);
        return list;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}