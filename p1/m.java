package modifier.p1;

public class m {
	
	
private int i=10;
long l=145879;
protected float f= 4;//getting error when i set decimal value and says to explicitly convert to double

public void mPublic()
{
	mPrivate();
}

protected void mProtected()
{
	mPrivate();
}

void mDefault()
{
	mPrivate();
}

private void mPrivate()
{
	System.out.println("Integer value is "+i);
	System.out.println("Long value is "+l+ "l");
	System.out.println("Float value is "+f);
}


}
