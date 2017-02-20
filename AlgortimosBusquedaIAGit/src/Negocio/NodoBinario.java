package Negocio;

public class NodoBinario extends Nodo {
	private Nodo izq;
	private Nodo der;
	
	public NodoBinario(String valor){
		super(valor);
	}
	
	public NodoBinario(String valor, Nodo izq, Nodo der){
		super(valor);
		this.izq=izq;
		this.der=der;
	}
	
	public Nodo getDer() {
		return der;
	}
	public void setDer(Nodo der) {
		this.der = der;
	}
	
	public Nodo getIzq() {
		return izq;
	}
	public void setIzq(Nodo izq) {
		this.izq = izq;
	}
	
	public String toString(){
		return this.getValor();
	}
}
