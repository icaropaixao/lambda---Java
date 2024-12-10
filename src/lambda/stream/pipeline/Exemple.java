package lambda.stream.pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemple {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 2);
        System.out.println(Arrays.toString(st1.toArray()));

        int soma = list.stream().reduce(0, (x,y) -> x + y);

        System.out.println("Soma da lista = " + soma);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) // filtrando só elementos pares
                .map(x -> x * 10)
                .collect(Collectors.toList()); // operação terminal para tranforma a stream em uma lista

        System.out.println(Arrays.toString(newList.toArray()));


    }
}
