import java.util.*;
import java.util.function.Function;


public class reto3 {
    

    public static String ecoFinal(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        return new StringBuilder(repetido).reverse().toString();

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa el mensaje: ");
        String entrada = scan.nextLine();

        Function<String, String> eco = msg -> ecoFinal(msg);

        System.out.println(eco.apply(entrada));

    }
}
