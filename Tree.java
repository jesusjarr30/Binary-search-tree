package arbol_binario;

import java.util.ArrayList;

public class Tree {

	private Nodo raiz;
	
	Tree(){
		raiz=null;
	}
	
	public void set_raiz(Nodo raiz) {
		this.raiz=raiz;
	}
	public Nodo get_raiz() {
		return raiz;
	}
	
	public void add(int n) {
		int index=0;
		Nodo aux;
		Nodo child;
		if(raiz==null) {
			raiz=new Nodo(n);
		}
		else {
			
			aux=raiz;
			
			while(aux!=null) {
				//System.out.println("Entrea");
				//System.out.println("El index es "+aux.getIndex());
				//System.out.println("El n es "+n);
				index=aux.getIndex();
				
				if(n>index) {
				//derecha	
					if(aux.getRight()==null) {
						child=new Nodo(aux,n);
						aux.setRight(child);
						aux=null;
					}
					else {
						aux=aux.getRight();
					}
				}
				else {
					//izquierda
					if(aux.getleft()==null) {
						child=new Nodo(aux,n);
						aux.set_left(child);
						aux=null;
					}else {
						aux=aux.getleft();
					}
					
				}				
				
			}
			System.out.println("Termino");	
		}
			
	}
	

	public void deepSeacrh() {
		// TODO Auto-generated method stub
		
		ArrayList<Nodo> l=new ArrayList<Nodo>();
		
		l.add(raiz);
		Nodo aux;
		int top=0;
		if(raiz!=null) {
			while(l.size()!=0) {
				top=l.size()-1;
				aux=l.get(  top);
				l.remove(top);
				if(aux.getRight()!=null) {
					l.add(aux.getRight());
				}
				if(aux.getleft()!=null) {
					l.add(aux.getleft());
				}
				System.out.println("  "+aux.getIndex());
			}
			
		}
		
		
	}

	public void breadthSearch() {
		ArrayList<Nodo> l =new ArrayList<Nodo>();
		Nodo aux;
		int top=0;
		l.add(raiz);
		
		while(l.size()!=0) {
			aux=l.get(0);
			l.remove(0);
			if(aux.getleft()!=null) {
				l.add(aux.getleft());
			}
			if(aux.getRight()!=null) {
				l.add(aux.getRight());
			}
			System.out.println(" "+aux.getIndex());
		}
		
		
	}
	
}
