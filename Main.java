package arbol_binario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Tree a=new Tree();

		int opc=0;
		int[] val= {10,15,20,2,5,11,6,12,16};
		
		do {
			System.out.println("1. fill the tree with the vector");
			System.out.println("2. deep seasrch");
			System.out.println("3. breadth search");
			System.out.println("4. Exit");

			opc=Integer.parseInt(sc.nextLine());
			
			switch(opc){
			case 1:
				for(int i=0;i<val.length;i++) {
					a.add(val[i]);
				}
				break;
			case 2: 
				a.deepSeacrh();
				break;
			case 3:
				a.breadthSearch();
				break;

				
			}
		}while(opc!=4);
	
	
	}
		
}
