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

<<<<<<< HEAD
    public static void esImpar(List<Integer> numeros){
        int longitudDatos = numeros.size();

        System.out.println((longitudDatos % 2 == 0) ? "no es impar" : "impar");
    }

=======
    public static void NumerosDeDatosPar(List<Integer> numeros){
        int longitudDatos = numeros.size();

        System.out.println((longitudDatos % 2 == 0) ? "es par" : "no es par");

                 
    }
>>>>>>> 57875b0815d9873759582a58201bc6e82523c3c8
}
