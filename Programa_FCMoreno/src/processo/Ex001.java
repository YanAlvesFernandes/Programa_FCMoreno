package processo;

public class Ex001 {
	
    public static void main(String[] args){
        double aumento = 1.5, salario = 1000, anoAumento = 2006; //Variáveis
        
        do{
            salario = salario + (salario * aumento / 100); // 1000 + 1.5%
            aumento = aumento * 2; // 1.5% * 2
            anoAumento++; // ano + 1
        }while(anoAumento <= 2012); // enquanto for menor ou igual a 2012, faça

        System.out.println("O salário atual é:" + salario); // imprime o salário
    }
}
