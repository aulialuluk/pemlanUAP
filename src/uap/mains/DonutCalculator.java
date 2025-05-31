
package uap.mains;

import java.util.Scanner;
import uap.models.DonutWithHole;
import uap.models.DonutWithoutHole;

public class DonutCalculator {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double outer = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double inner = input.nextDouble();

        DonutWithHole donutHole = new DonutWithHole(outer, inner);
        System.out.println("=============================================");
        donutHole.printDetails();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();

        DonutWithoutHole donutSolid = new DonutWithoutHole(radius);
        System.out.println("=============================================");
        donutSolid.printDetails();
        System.out.println("=============================================");
    }
}
