
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	private int checkMaxDia() {
		if(mes == 2) {
			return 28;
		}
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		}
		else {
			return 31;
		}	
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int newDia) {
		if(newDia > 0 && newDia <= checkMaxDia()) {		
			this.dia = newDia;
		}
		else {
			System.out.println("Dia inválido");
		}
	}	
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int newMes) {
		if(newMes > 0 && newMes < 13) {
			this.mes = newMes;		
			
			int maxDia = checkMaxDia();
			if(dia > maxDia) {
				int diaOld = dia;
				this.dia = maxDia;
				System.out.println("O dia foi alterado para " + maxDia + " pois " + diaOld + " não pertence a esse mês");
			}
		}
		else {
			System.out.println("Mês inválido");
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int newAno) {
		if(newAno > 0 && newAno < 2024) {
			this.ano = newAno;			
		}
		else {
			System.out.println("Ano inválido");
		}
	}
	
}
