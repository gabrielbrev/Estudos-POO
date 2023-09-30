
public class ContaBancaria {

	private double saldo = 0.0;
	private Data dataAbertura;

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double newSaldo) {
		this.saldo = newSaldo;
	}
	
	public Data getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(Data newDataAbertura) {
		this.dataAbertura = newDataAbertura;
	}
	
	public String getDataAberturaFormatada() {
		String data;
		if(dataAbertura.getDia() < 10 && dataAbertura.getDia() > 0) {
			data = "0" + String.valueOf(dataAbertura.getDia()) + "/";
		}
		else {
			data = String.valueOf(dataAbertura.getDia()) + "/";			
		}
		if(dataAbertura.getMes() < 10 && dataAbertura.getMes() > 0) {
			data += "0" + String.valueOf(dataAbertura.getMes()) + "/";
		}
		else {
			data += String.valueOf(dataAbertura.getMes()) + "/";			
		}
		data += String.valueOf(dataAbertura.getAno());
		
		return data;
	}
	
	public String getSaldoFormatado() {
		String saldoReais = "R$ ";
		String total = String.format("%.2f", saldo);
		total = total.replace(".", ",");

		StringBuilder stringBuilder = new StringBuilder(total);
		for(int i = total.length() - 6; i > 0; i -= 3) {
			stringBuilder.insert(i, ".");
			total = stringBuilder.toString();
		}

		saldoReais += total;
		
		return saldoReais;
	}
	
	public void depositar(double deposito) {
		if(deposito > 0) {			
			this.saldo += deposito;
		}
		else {
			System.out.println("Valor inválido");
		}
	}
	
	public void sacar(double saque) {
		if(saque > 0) {
			if(saldo <= saque) {
				this.saldo -= saque;
			}
			else {
				System.out.println("Saldo insuficiente");
			}			
		}
		else {
			System.out.println("Valor inválido");
		}
	}
	
}
