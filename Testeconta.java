
public class Testeconta {

	public static void main(String[] args) {
		Conta C1,C2;
        C1 = new Conta();
        C2 = new Conta();
        
        C1.nomeTitular = "Savio Souza";
		C1.agencia = "123-4"; 
		
		C2.nomeTitular = "Nicolle";
		C2.saldo = 1000000;
		
		
		
		
		System.out.println("titular: " + C1.nomeTitular);
		System.out.println("Saldo: " + C1.numeroConta);
		System.out.println("Conta Salario: " + C1.numeroConta);
		System.out.println("Ag: " + C1.agencia);
		
		if (C1.saldo==C2.saldo) {
			 System.out.println("iguais");
			} else {
			 System.out.println("diferentes");
			}
	}

}
