import java.util.*;
import java.util.function.Function;

public class reto3 {
    public static String ecoFinal(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el mensaje: ");
        String entrada = sc.nextLine();

        Function<String, String> eco = msg -> ecoFinal(msg);

        System.out.println(eco.apply(entrada));
    }
}
