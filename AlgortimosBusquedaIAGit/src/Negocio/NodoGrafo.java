package Negocio;

import java.util.ArrayList;
import java.util.List;

public class NodoGrafo extends Nodo {
	private List<Nodo> nodos;
	
	public NodoGrafo(String valor) {
		super(valor);
		
		this.nodos = new ArrayList<Nodo>();
	}
	
	public List<Nodo> getNodos(){
		return nodos;
	}
	
	public void addNodo(Nodo nodo){
		this.nodos.add(nodo);
	}
	
	public String toString(){
		return this.getValor();
	}
}
