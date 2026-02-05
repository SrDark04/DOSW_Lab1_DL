import java.util.*;
import java.util.stream.*;

public class reto5 {

    // Método A: HashSet eliminando múltiplos de 3
    public static HashSet<Integer> crearHashSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // Método B: TreeSet eliminando múltiplos de 5
    public static TreeSet<Integer> crearTreeSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    // Método combinado: unir, ordenar y eliminar duplicados
    public static TreeSet<Integer> unirConjuntos(HashSet<Integer> hashSet, TreeSet<Integer> treeSet) {
        return Stream.concat(hashSet.stream(), treeSet.stream())
                .collect(Collectors.toCollection(TreeSet::new)); // TreeSet ordena y elimina duplicados
    }

    public static void main(String[] args) {

        List<Integer> datosHash = Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5);
        List<Integer> datosTree = Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4);

        HashSet<Integer> hashSet = crearHashSet(datosHash);
        TreeSet<Integer> treeSet = crearTreeSet(datosTree);

        TreeSet<Integer> union = unirConjuntos(hashSet, treeSet);

        // Imprimir con lambda
        union.forEach(n -> System.out.println("Número en arena: " + n));
    }
}
