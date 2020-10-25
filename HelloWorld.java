package ch.bbw.Do.cluedo;

public class HelloWorld {

	private int i;

	private String text;

	public HelloWorld()
	{
		this.i = 0;
	}

	public HelloWorld(String text)
	{
		this.text = text;
		System.out.println(text);
	}

	public int getI()
	{
		return this.i;
	}

	public void setI(int i)
	{
		this.i = i;
	}
}
