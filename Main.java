public class Main {

	public static void main(String[] args) {
		Arbol a = new Arbol();
		a.Insert(8);
		a.Insert(4);
		a.Insert(2);
		a.Insert(9);
		a.Insert(3);
		a.Insert(1);
		a.Insert(7);
		a.Insert(6);
		//metodos del arbol
		a.PreOrder(a);
		System.out.println();
		a.InOrder(a);
		System.out.println();
		a.PosOrder(a);
		
		System.out.println();
		System.out.println("elemento encuentra:"+a.hasElement(2));
		
		
		

	}
	

}
