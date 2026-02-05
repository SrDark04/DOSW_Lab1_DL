public class reto6 {
    public static void ejecutarComando(String comando) {

        switch (comando) {
            case "BROMEAR":
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…");
                break;

            case "GRITAR":
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;

            case "SUSURRAR":
                System.out.println("La máquina susurra: Shhh… los bugs están dormidos");
                break;

            case "ANALIZAR":
                System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!");
                break;

            default:
                System.out.println("Comando no reconocido.");
        }
    }

    public static void main(String[] args) {
        ejecutarComando("BROMEAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("ANALIZAR");
    }
}
