package modifier.p2;

public class x {

	private int xi=30;
	long xl=4546546;
	protected float xf= (float) 5.9;
	public char xc='a';
	
	public void xPublic()
	{
		
		xPrivate();
	}

	protected void xProtected()
	{
		xPrivate();
	}

	void xDefault()
	{
		xPrivate();
	}

	private void xPrivate()
	{
		System.out.println("Integer value is "+xi);
		System.out.println("Long value is "+xl+ "l");
		System.out.println("Float value is "+xf);
		System.out.println("char value is "+xc);
	}
	
}
