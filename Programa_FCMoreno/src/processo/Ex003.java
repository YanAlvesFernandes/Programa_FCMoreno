package processo;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        double salario, horasTrabalhadas, valorHora, salarioLiquido;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor do salário: ");
        salario = scan.nextDouble();
        
        System.out.print("Quantidade de horas trabalhadas: ");
        horasTrabalhadas = scan.nextDouble();
        
        valorHora = salario * 0.1;
        
        salarioLiquido = valorHora * horasTrabalhadas;    
        salarioLiquido = salarioLiquido - (salarioLiquido * 0.03);     
        System.out.println("A receber: R$ " + salarioLiquido);
    }

}
