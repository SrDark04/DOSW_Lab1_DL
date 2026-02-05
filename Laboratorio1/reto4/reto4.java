import java.util.*;
import java.util.stream.*;

public class TesoroA {

    public static HashMap<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> datos) {
        HashMap<String, Integer> mapa = new HashMap<>();

        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> combinarMapas(
            HashMap<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        Map<String, Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashTable);
        return combinado;
    }

    public static void imprimirEnMayusculas(Map<String, Integer> mapa) {
        mapa.entrySet()
            .stream()
            .map(e -> "Clave: " + e.getKey().toUpperCase() +
                      " | Valor: " + e.getValue())
            .forEach(System.out::println);
    }
}
