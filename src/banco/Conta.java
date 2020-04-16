package banco;

public class Conta {

	private int numero;
	private String holder;
	private double total;
	private double limite_saque;

	public Conta(int numero, String holder, double total, double limite_saque) {

		this.numero = numero;
		this.holder = holder;
		this.total = total;
		this.limite_saque = limite_saque;
	}
	
	
	public void Deposito(double valor) {
		
		this.total += valor;
		System.out.println("Novo Saldo: R$"+ String.format("%.2f", this.total) );
		
		
	}
	
	public void Saque(double valor) throws DominioExecoes {

		if(valor > this.limite_saque ) {
			throw new DominioExecoes ("Limite de saque ULTRAPASSADO!");
		}
		
		else if (this.total < valor ) {
			throw new  DominioExecoes ("Saldo insuficiente!");
		}
		
		else {
		this.total -= valor;
		System.out.println("Novo Saldo: R$"+ String.format("%.2f", this.total) );
		}
	}

}
