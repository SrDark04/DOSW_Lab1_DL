import java.util.*;

public class CarreraParalela {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine();
        
        String[] partes = linea.split(",");

        List<Integer> numeros = new ArrayList<>();

        for(String parte : partes){
            numeros.add(Integer.parseInt(parte));
        }
        numeroMinimo(numeros);
        hallarElMayorDeUnaLista(numeros);
        String esParLista1 = esPar(numeros);
        String esParLista2 = esPar(numeros);
        int elementosLista1 = cantidadDeElementosPorLista(numeros);
        int elementosLista2 = cantidadDeElementosPorLista(numeros);
        boolean esMultiploMayor1 = esmultiploPar(mayor);
        boolean esMultiploMayor2 = esmultiploPar(mayor);

    }

    public static void numeroMinimo(List<Integer> numeros){
        int minimo = numeros.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println("El numero minimo es: " + minimo);
    }

    public static void hallarElMayorDeUnaLista(List<Integer> numeros){
        int mayor = numeros.stream()
                    .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("El numero mayor es: " + mayor);
    }


    public static String esPar(List<Integer> numeros){
        int longitudDatos = numeros.size();

        return((longitudDatos % 2 == 0) ? "es par" : "es impar");
    }

    public static int cantidadDeElementosPorLista(List<Integer> numeros){
        int cantidadElementos = numeros.size();
        return cantidadElementos;
    }
}
