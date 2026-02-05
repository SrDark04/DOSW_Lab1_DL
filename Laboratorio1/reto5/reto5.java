import java.util.*;
import java.util.stream.*;

public class reto5 {

    public static HashSet<Integer> crearHashSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static void imprimir(HashSet<Integer> set) {
        set.forEach(n -> System.out.println("Número en arena: " + n));
    }

    public static void main(String[] args) {
        List<Integer> datos = Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5);
        HashSet<Integer> resultado = crearHashSet(datos);
        imprimir(resultado);
    }
}