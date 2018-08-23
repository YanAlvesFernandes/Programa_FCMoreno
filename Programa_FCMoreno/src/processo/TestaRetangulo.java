package processo;

import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        double base;
        double altura;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a base: ");
        base = scan.nextDouble();
        System.out.print("Digite a altura: ");
        altura = scan.nextDouble();
        
        Retangulo ret = new Retangulo(base,altura);
        System.out.println(ret.getBase());
        System.out.println(ret.getAltura());
        System.out.println(ret.calcArea());
        System.out.println(ret.calcPerimetro());
    }

}
