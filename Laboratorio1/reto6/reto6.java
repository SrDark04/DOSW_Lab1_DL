import java.util.*;

public class reto6 {

    private static Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", () ->
            System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!")
        );

        comandos.put("DESPEDIR", () ->
            System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.")
        );

        comandos.put("CANTAR", () ->
            System.out.println("La máquina canta: 01010101")
        );

        comandos.put("DANZAR", () ->
            System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.")
        );

        // Fragmento B
        comandos.put("BROMEAR", () ->
            System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…")
        );

        comandos.put("GRITAR", () ->
            System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!")
        );

        comandos.put("SUSURRAR", () ->
            System.out.println("La máquina susurra: Shhh… los bugs están dormidos")
        );

        comandos.put("ANALIZAR", () ->
            System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!")
        );
    }

    public static void ejecutarComando(String comando) {

        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                comandos.get(comando).run();
                break;

            default:
                System.out.println("Comando no reconocido.");
        }
    }

    public static void main(String[] args) {

        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("DANZAR");
        ejecutarComando("CANTAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("DESPEDIR");
    }
}
