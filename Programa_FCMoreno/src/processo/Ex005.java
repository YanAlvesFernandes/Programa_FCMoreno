package processo;

public class Ex005 {
	
    private int numeroConta;
    private String nome;
    private double saldoConta;
    
    public Ex005(int numeroConta,String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldoConta = 0;
    }
    
    public Ex005(int numeroConta,String nome,double saldo){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldoConta = saldo;
    }
    
    public void alterarNome(String nome){
        this.nome = nome;
    }
    public void deposito(double valor){ 
        this.saldoConta += valor;
    }
    public String saque(double valor){
        if(this.saldoConta >= valor){
            this.saldoConta -= valor;
            return "Saque realizado com sucesso";
        }
        return "Saldo insuficiente na conta";
    }

}
