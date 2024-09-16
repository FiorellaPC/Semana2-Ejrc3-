import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Ingrese población actual: ");
        double pobActual = scan.nextInt();
        System.out.println("Ingrese tasa de crecimiento anual: "+"%");
        double tasaCrec = scan.nextDouble() / 100;
        System.out.println("Indique años a calcular: ");
        int tiempo = scan.nextInt();

        double pobFut = (pobActual * Math.pow(1+tasaCrec,tiempo));

        System.out.println("Población futura: "+df.format(pobFut)+" personas");
    }
}
