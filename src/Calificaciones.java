import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String calificaciones = teclado.nextLine();

        switch (calificaciones) {
            case "I":
                System.out.println(4);
                break;

            case "F":
                System.out.println(5);
                break;

            case "B":
                System.out.println(6);
                break;

            case "N":
                System.out.println(7);
                break;

            case "S":
                System.out.println(9);
                break;

            default:
                System.out.println("Nota no válida");
        }
    }
}

