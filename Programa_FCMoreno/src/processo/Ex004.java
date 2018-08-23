package processo;

import java.util.Scanner;

public class Ex004 {
	
    public static void main(String[] args) {
        double areaPintada, litrosTinta, latasTinta;

        
        System.out.print("Quantos metros serão pintados?: ");
        Scanner scan = new Scanner(System.in);
        areaPintada = scan.nextDouble();
        
        litrosTinta = areaPintada / 3;
        latasTinta = Math.ceil(litrosTinta/18);
        
        System.out.println("Serão utilizadas " + latasTinta + " litros de tinta, R$ " + (latasTinta*80));
    }
}


