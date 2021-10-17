package modifier.p1;

public class n {
	
protected long l1=78945612;
public int i1=20;
double d1=20.45;

protected void nProtected(){
	
	nPrivate();
}

public void npublic(){
	nPrivate();
}

void nDefault(){
	nPrivate();
}

private void nPrivate()
{
	System.out.println("Integer value is "+i1);
	System.out.println("Long value is "+l1+ "l");
	System.out.println("double value is "+d1);
}
}
