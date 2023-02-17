import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipo de carne (v para vacuno, c para cordero):");
        String tipoCarne = scanner.nextLine();

        System.out.println("Modo de cocción (casi cruda, al punto, bien hecha):");
        String modoCoccion = scanner.nextLine();

        System.out.println("Peso en gramos:");
        int peso = scanner.nextInt();

        int tiempoDeCoccion;

        if (tipoCarne.equals("v")) {
            if (modoCoccion.equals("casi cruda")) {
                tiempoDeCoccion = (int) (peso * (1.2));
            } else if (modoCoccion.equals("al punto")) {
                tiempoDeCoccion = peso * 2;
            } else {
                tiempoDeCoccion = peso * 3;
            }
        } else {
            if (modoCoccion.equals("casi cruda")) {
                tiempoDeCoccion = (int) (peso * 2.25);
            } else if (modoCoccion.equals("al punto")) {
                tiempoDeCoccion = (int) (peso * 3.75);
            } else {
                tiempoDeCoccion = peso * 6;
            }
        }

        System.out.println("Tiempo de cocción en segundos: " + tiempoDeCoccion + "s");
    }
}