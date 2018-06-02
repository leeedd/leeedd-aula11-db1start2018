package br.com.db1.classe.Integer;

public class ClasseInteger {

	private Integer valor1;
	private Integer valor2;
	private String par;
	private String impar;

	

	public ClasseInteger() {
		
	}

	public ClasseInteger(Integer valor1) {
		
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public String getPar() {
		return par;
	}

	public void setPar(String par) {
		this.par = par;
	}

	public String getImpar() {
		return impar;
	}

	public void setImpar(String impar) {
		this.impar = impar;
	}

	public Integer Somar(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	public Integer Subtrair(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}

	public Integer Multiplicar(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}

	public Integer Dividir(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

	public ClasseInteger checarParOuImpar() {
		ClasseInteger checar = new ClasseInteger(valor1);
		if (valor1 % 2 == 0) {
			checar.setPar("é par");
			return checar;
		} else {
			checar.setImpar("é impar");
			return checar;
		}

	}

	public String compararValor() {
		@SuppressWarnings("unused")
		int maior;
		if (valor1 > valor2) {
			maior = valor1;
			return "Valor 1 é maior que valor 2.";
		} else {
			maior = valor2;
			return "Valor 2 é maior que valor 1.";
		}
	}
	
}
