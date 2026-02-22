import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {

    public static void main(String[] args) {

        List<Integer> valoresPares = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> pares = valoresPares
                .stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Resultado: " + pares);
    }

}

// import java.util.Arrays;
// import java.util.List;

 class Filtro2 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6);

        // Filtro: pega apenas números maiores que 5
        numeros.stream()
                .filter(n -> n > 5)
                .forEach(System.out::println);
    }
}