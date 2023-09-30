
public class Main {

	public static void main(String[] args) {
		Data data = new Data();
		ContaBancaria conta = new ContaBancaria();
		
		data.setDia(31);
		data.setMes(7);
		data.setAno(2004);
		
		conta.setDataAbertura(data);
		System.out.println(conta.getDataAberturaFormatada());
		
		conta.depositar(10000);
		System.out.println(conta.getSaldoFormatado());
		
		conta.sacar(5976);
		System.out.println(conta.getSaldoFormatado());
		
		for(int i = 0; i < 75; i++) {
			conta.depositar(75 * i + 1);
		}
		System.out.println(conta.getSaldoFormatado());
	}

}
