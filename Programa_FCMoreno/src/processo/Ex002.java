package processo;

import java.util.Scanner;

class Ex002{
    public static void main(String[] args) {
        int primeiroNumero, segundoNumero;
         
        
         Scanner scan = new Scanner(System.in);
         primeiroNumero = 0;
         segundoNumero = 0;
         
         while(primeiroNumero <= 0){
            System.out.print("Digite o primeiro numero a verificar: ");
            primeiroNumero = scan.nextInt();
         }
         while(segundoNumero <= primeiroNumero){
            System.out.print("Digite o segundo numero ");
            segundoNumero = scan.nextInt();
         }
         
         
         for(int i = primeiroNumero;i <= segundoNumero;i++){
             int cont = 0;
             for(int j = 2;j < i;j++){
                 if(i % j == 0){
                     cont++;
                 }
             }
             if(cont == 0 && i > 1){
                 System.out.print(i + " ");
             }
         }       
    }


}