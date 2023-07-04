public class App {
    public static void main(String[] args) throws Exception {
        var number = 10;

        if (number > 0) {
            System.out.println("Positivo");
        } else if (number < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }

        var numeroWhile = 0;
        while (numeroWhile < 3) {
        numeroWhile++;
        System.out.println(numeroWhile);
        }

        do {
        numeroWhile++;
        System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        var numeroFor = 0;

        for (numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}
