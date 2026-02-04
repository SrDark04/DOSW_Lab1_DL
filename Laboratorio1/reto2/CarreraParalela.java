import java.util.*;

public class CarreraParalela{
    public static void main(String [] args){
        Scanner sc = new Scanner(Sytem.in);
        System.out.println("Digite la cantidad de números con la cual quiera trabajar, separadas por comas: ");
        String entrada = sc.nextLine();
        String[] partes = entrada.split(",");
        List<Integer> numeros = new ArrayList<>();

        for (String p : partes) {
            numeros.add(Integer.parseInt(p.trim()));
        }
        hallarElMayorDeUnaLista(numeros);
    }

    private void hallarElMayorDeUnaLista(List<Integer> numeros){
        Int mayor = numeros.stream()
                    .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(mayor); 
    }
}