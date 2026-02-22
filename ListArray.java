
import java.util.Arrays;
import java.util.List;

public class ListArray {

    public static void main(String[] args) {

        Teste2 t = new Teste2(Arrays.asList("Jefferson", "Nathaly","Gabriella","Manuella","Thamyres"));

        System.out.print("Nomes: " + t.getNomes());

    }

}

class Teste2 {

    List<String> nomes = Arrays.asList();

    public Teste2(List<String> nomes) {

        this.nomes = nomes;

    }

    public List<String> getNomes() {
        return nomes;
    }

}

// List<String> nomes = Arrays.asList("Ana", "Beto");
// for (String nome : nomes) {
// System.out.println(nome);
// }
