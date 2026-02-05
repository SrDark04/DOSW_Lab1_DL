import java.util.*;
import java.util.stream.*;

public class reto4 {

    public static HashMap<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> datos) {
        HashMap<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return mapa;
    }

    public static Hashtable<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> datos) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> entry : datos) {
            tabla.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return tabla;
    }

    public static Map<String, Integer> combinarMapas(
            HashMap<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        Map<String, Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashTable); // Hashtable tiene prioridad
        return combinado;
    }

    public static void imprimirTesoroFinal(
            HashMap<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        Stream.concat(hashMap.entrySet().stream(), hashTable.entrySet().stream())
            .collect(Collectors.toMap(
                e -> e.getKey().toUpperCase(), // convertir claves a mayúsculas
                Map.Entry::getValue,
                (valorHashMap, valorHashTable) -> valorHashTable // prioridad Hashtable
            ))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey()) // ordenar ascendente
            .forEach(e ->
                System.out.println("Clave: " + e.getKey() +
                                   " | Valor: " + e.getValue())
            );
    }
}
