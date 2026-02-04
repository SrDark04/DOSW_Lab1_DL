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
    }

    public static void numeroMinimo(List<Integer> numeros){
        int minimo = numeros.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a < b ? a : b);
        System.out.println("El numero minimo es: " + minimo);
    }
}