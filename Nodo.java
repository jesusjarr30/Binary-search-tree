package arbol_binario;

public class Nodo {

	private Nodo left;
	private Nodo right;
	private Nodo father;
	private int index;
	private int number;
	
	public Nodo(){
		left=null;
		setRight(null);
		setFather(null);
		setIndex(0);
		setNumber(0);
	}
	public Nodo(Nodo father,int index) {
		
		this.father=father;
		this.index=index;
		this.left=null;
		this.right=null;
		
	}
	public Nodo(int index) {
		this.index=index;
		setRight(null);
		setFather(null);
		set_left(null);
	}
	public void set_left(Nodo a) {
		left=a;
	}
	public Nodo getleft() {
		return left;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Nodo getRight() {
		return right;
	}

	public void setRight(Nodo right) {
		this.right = right;
	}

	public Nodo getFather() {
		return father;
	}

	public void setFather(Nodo father) {
		this.father = father;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
