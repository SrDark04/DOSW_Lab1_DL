import java.util.*;

public class reto4 {

    // 1️⃣ Crear Hashtable ignorando duplicados (conserva el primero)
    public static Hashtable<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> datos) {
        Hashtable<String, Integer> tabla = new Hashtable<>();

        for (Map.Entry<String, Integer> entry : datos) {
            tabla.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return tabla;
    }

    // 2️⃣ Combinar mapas priorizando Hashtable (MISMO NOMBRE)
    public static Map<String, Integer> combinarMapas(
            HashMap<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        Map<String, Integer> combinado = new Hashtable<>(hashMap);
        combinado.putAll(hashTable); // Hashtable tiene prioridad
        return combinado;
    }

    // 3️⃣ Ordenar claves ascendentemente e imprimir
    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        mapa.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(e ->
                System.out.println("Clave: " + e.getKey() +
                                   " | Valor: " + e.getValue())
            );
    }
}