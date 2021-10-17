package modifier.p1;

import modifier.p1.m;
import modifier.p1.n;

public class o {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m mo1 =new m();
		n no1=new n();
		
		mo1.mDefault();
		mo1.mProtected();
		mo1.mPublic();
		System.out.println("default long variable of class m "+mo1.l);
		
		no1.nDefault();
		no1.nProtected();
		no1.npublic();
		System.out.println("default double variable of class n "+no1.d1);
		System.out.println("public int variable of class n "+no1.i1);
	}
	
	
	public void oPublic(){
		new m().mPublic();
		new n().npublic();
		oPrivate();
		//System.out.println("Class o public");
	}
	
	protected void oProtected(){
		new m().mProtected();
		new n().nProtected();
		oPrivate();
		System.out.println("Class o protected");
	}
	
	void oDefault(){
		new m().mDefault();
		new n().nDefault();
		oPrivate();
		System.out.println("Class o default");
	}
	
	private void oPrivate(){
		
		System.out.println("Class o private");
	}
	
}
