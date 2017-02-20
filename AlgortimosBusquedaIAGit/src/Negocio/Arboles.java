package Negocio;

public class Arboles {
	
	public Nodo crearArbolBinario1(){
		Nodo inicial = new NodoBinario("A", new NodoBinario("C"), new NodoBinario("F"));
		
		Nodo Y = new NodoBinario("Y", new NodoBinario("W"), new NodoBinario("V"));
		Nodo O = new NodoBinario("O", Y, new NodoBinario("X"));
		Nodo P = new NodoBinario("P", new NodoBinario("T"),null);
		Nodo G = new NodoBinario("G",O,P);
		
		((NodoBinario)((NodoBinario)inicial).getDer()).setIzq(new NodoBinario("D"));
		((NodoBinario)((NodoBinario)inicial).getDer()).setDer(G);
		
		Nodo I = new NodoBinario("I", new NodoBinario("J"), new NodoBinario("M"));
		Nodo E = new NodoBinario("E", null, I);
		Nodo H = new NodoBinario("H", new NodoBinario("K"), new NodoBinario("L"));
		((NodoBinario)((NodoBinario)inicial).getIzq()).setIzq(H);
		((NodoBinario)((NodoBinario)inicial).getIzq()).setDer(E);
				
		return inicial;
	}
	
	public Nodo crearArbolBinario2(){
		Nodo inicial = new NodoBinario("A", new NodoBinario("C"), new NodoBinario("F"));
		
		Nodo Y = new NodoBinario("Y", new NodoBinario("W"), new NodoBinario("V"));
		Nodo O = new NodoBinario("O", ((NodoBinario)inicial).getDer(), Y);
		Nodo P = new NodoBinario("P", new NodoBinario("T"),null);
		Nodo G = new NodoBinario("G",O,P);
		
		((NodoBinario)((NodoBinario)inicial).getDer()).setIzq(new NodoBinario("D"));
		((NodoBinario)((NodoBinario)inicial).getDer()).setDer(G);
		
		Nodo I = new NodoBinario("I", new NodoBinario("J"), new NodoBinario("M"));
		Nodo E = new NodoBinario("E", null, I);
		Nodo H = new NodoBinario("H", new NodoBinario("K"), new NodoBinario("L"));
		((NodoBinario)((NodoBinario)inicial).getIzq()).setIzq(H);
		((NodoBinario)((NodoBinario)inicial).getIzq()).setDer(E);
		
		return inicial;
	}
	
	
	public Nodo crearArbol1(){
		Nodo inicial = new NodoGrafo("A");
		Nodo B = new NodoGrafo("B");
		Nodo C = new NodoGrafo("C");
		Nodo D = new NodoGrafo("D");
		Nodo E = new NodoGrafo("E");
		Nodo F = new NodoGrafo("F");
		Nodo G = new NodoGrafo("G");
		Nodo H = new NodoGrafo("H");
		Nodo I = new NodoGrafo("I");
		Nodo J = new NodoGrafo("J");
		Nodo K = new NodoGrafo("K");
		Nodo L = new NodoGrafo("L");
		Nodo M = new NodoGrafo("M");
		Nodo N = new NodoGrafo("N");
		Nodo O = new NodoGrafo("O");
		Nodo P = new NodoGrafo("P");
		Nodo Q = new NodoGrafo("Q");
		Nodo R = new NodoGrafo("R");
		Nodo S = new NodoGrafo("S");
		Nodo T = new NodoGrafo("T");
		Nodo U = new NodoGrafo("U");
		Nodo V = new NodoGrafo("V");
		Nodo W = new NodoGrafo("W");
		Nodo X = new NodoGrafo("X");
		Nodo Y = new NodoGrafo("Y");
		Nodo Z = new NodoGrafo("Z");
		
		((NodoGrafo)inicial).addNodo(H);
		((NodoGrafo)inicial).addNodo(I);
		((NodoGrafo)inicial).addNodo(J);
		((NodoGrafo)H).addNodo(B);
		((NodoGrafo)H).addNodo(D);
		((NodoGrafo)H).addNodo(F);
		((NodoGrafo)I).addNodo(G);
		((NodoGrafo)I).addNodo(K);
		((NodoGrafo)J).addNodo(M);
		((NodoGrafo)J).addNodo(O);
		((NodoGrafo)J).addNodo(P);
		((NodoGrafo)J).addNodo(S);
		((NodoGrafo)B).addNodo(Q);
		((NodoGrafo)B).addNodo(W);
		((NodoGrafo)D).addNodo(L);
		((NodoGrafo)F).addNodo(V);
		((NodoGrafo)F).addNodo(X);
		((NodoGrafo)F).addNodo(Y);
		((NodoGrafo)X).addNodo(Z);
		((NodoGrafo)K).addNodo(N);
		((NodoGrafo)K).addNodo(R);
		((NodoGrafo)K).addNodo(T);
		((NodoGrafo)K).addNodo(U);
		((NodoGrafo)R).addNodo(C);
		((NodoGrafo)R).addNodo(E);
		
		
		return inicial;
	}
	
	public Nodo crearArbol2(){
		Nodo inicial = new NodoGrafo("A");
		Nodo B = new NodoGrafo("B");
		Nodo C = new NodoGrafo("C");
		Nodo D = new NodoGrafo("D");
		Nodo E = new NodoGrafo("E");
		Nodo F = new NodoGrafo("F");
		Nodo G = new NodoGrafo("G");
		Nodo H = new NodoGrafo("H");
		Nodo I = new NodoGrafo("I");
		Nodo J = new NodoGrafo("J");
		Nodo K = new NodoGrafo("K");
		Nodo L = new NodoGrafo("L");
		Nodo M = new NodoGrafo("M");
		Nodo N = new NodoGrafo("N");
		Nodo O = new NodoGrafo("O");
		Nodo P = new NodoGrafo("P");
		Nodo Q = new NodoGrafo("Q");
		Nodo R = new NodoGrafo("R");
		Nodo S = new NodoGrafo("S");
		Nodo T = new NodoGrafo("T");
		Nodo U = new NodoGrafo("U");
		Nodo V = new NodoGrafo("V");
		Nodo W = new NodoGrafo("W");
		Nodo X = new NodoGrafo("X");
		Nodo Y = new NodoGrafo("Y");
		Nodo Z = new NodoGrafo("Z");
		
		((NodoGrafo)inicial).addNodo(H);
		((NodoGrafo)inicial).addNodo(I);
		((NodoGrafo)inicial).addNodo(J);
		((NodoGrafo)H).addNodo(B);
		((NodoGrafo)H).addNodo(D);
		((NodoGrafo)H).addNodo(F);
		((NodoGrafo)I).addNodo(G);
		((NodoGrafo)I).addNodo(K);
		((NodoGrafo)J).addNodo(M);
		((NodoGrafo)J).addNodo(O);
		((NodoGrafo)J).addNodo(P);
		((NodoGrafo)J).addNodo(S);
		((NodoGrafo)N).addNodo(I);
		((NodoGrafo)B).addNodo(Q);
		((NodoGrafo)B).addNodo(W);
		((NodoGrafo)D).addNodo(L);
		((NodoGrafo)F).addNodo(V);
		((NodoGrafo)F).addNodo(X);
		((NodoGrafo)F).addNodo(Y);
		((NodoGrafo)X).addNodo(Z);
		((NodoGrafo)K).addNodo(N);
		((NodoGrafo)K).addNodo(R);
		((NodoGrafo)K).addNodo(T);
		((NodoGrafo)K).addNodo(U);
		((NodoGrafo)R).addNodo(C);
		((NodoGrafo)R).addNodo(E);
		
		
		return inicial;
	}
}
