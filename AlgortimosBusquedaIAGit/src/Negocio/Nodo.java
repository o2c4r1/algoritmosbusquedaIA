package Negocio;

abstract class Nodo {
	private String valor;

	public Nodo(String valor) {
		this.valor=valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String toString(){
		return this.getValor();
	}
}