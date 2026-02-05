import java.util.*;
public class reto6 {
    public static void ejecutarComando(String comando) {

        switch (comando) {
            case "SALUDAR":
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
                break;

            case "DESPEDIR":
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
                break;

            case "CANTAR":
                System.out.println("La máquina canta: 01010101");
                break;

            case "DANZAR":
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
                break;

            default:
                System.out.println("Comando no reconocido.");
        }
    }

    public static void main(String[] args) {
        ejecutarComando("SALUDAR");
        ejecutarComando("CANTAR");
        ejecutarComando("DANZAR");
        ejecutarComando("DESPEDIR");
    }
}
