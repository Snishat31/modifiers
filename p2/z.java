package modifier.p2;

import modifier.p1.o;
public class z extends o{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new z().zPublic();
	}
	
	public void zPublic(){
		System.out.println("methods of class m,n,o :");
		new o().oPublic();
		System.out.println("variables of class x:");
		new x().xPublic();
	}

}
