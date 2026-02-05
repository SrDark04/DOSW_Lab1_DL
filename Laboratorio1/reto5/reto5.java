import java.util.*;
import java.util.stream.*;

public class reto5 {

    public static TreeSet<Integer> crearTreeSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void imprimir(TreeSet<Integer> set) {
        set.forEach(n -> System.out.println("Número en arena: " + n));
    }

    public static void main(String[] args) {
        List<Integer> datos = Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4);
        TreeSet<Integer> resultado = crearTreeSet(datos);
        imprimir(resultado);
    }
}
