import java.util.*;

public class CarreraParalela {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String linea1 = sc.nextLine();
        
        String[] partes = linea1.split(",");

        List<Integer> numeros = new ArrayList<>();

        for(String parte : partes){
            numeros.add(Integer.parseInt(parte));
        }

        String linea2 = sc.nextLine();
        String[] partes2 = linea2.split(",");
        List<Integer> numeros2 = new ArrayList<>();
        for(String parte : partes2){
            numeros2.add(Integer.parseInt(parte));
        }

        int mayorDeLista1 = hallarElMayorDeUnaLista(numeros);
        int mayorDeLista2 = hallarElMayorDeUnaLista(numeros2);
        int menorDeLista1 = numeroMinimo(numeros);
        int menorDeLista2 = numeroMinimo(numeros2);
        String esParLista1 = esPar(numeros);
        String esParLista2 = esPar(numeros2);
        int elementosLista1 = cantidadDeElementosPorLista(numeros);
        int elementosLista2 = cantidadDeElementosPorLista(numeros2);
        boolean esMultiploMayor1 = esmultiploPar(mayorDeLista1);
        boolean esMultiploMayor2 = esmultiploPar(mayorDeLista2);

    }

    public static int numeroMinimo(List<Integer> numeros){
        int minimo = numeros.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        return minimo;
    }

    public static int hallarElMayorDeUnaLista(List<Integer> numeros){
        int mayor = numeros.stream()
                    .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        return mayor;
    }
    
    public static String esPar(List<Integer> numeros){
        int longitudDatos = numeros.size();

        return((longitudDatos % 2 == 0) ? "es par" : "es impar");
    }

    public static int cantidadDeElementosPorLista(List<Integer> numeros){
        int cantidadElementos = numeros.size();
        return cantidadElementos;
    }

    public static boolean esmultiploPar(int numero){
        return (numero % 2 == 0);
    }
}
