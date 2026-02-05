public static String ecoFinal(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        return repetido;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el mensaje: ");
        String entrada = sc.nextLine();

        Function<String, String> eco = msg -> ecoFinal(msg);


        
        System.out.println(eco.apply(entrada));
    }