package ch.bbw.Do.cluedo;

public class HelloWorld {

	private int i;

	private String text;

	public static void main(String[] args)
	{
		HelloWorld main = new HelloWorld();
		main.setI(1);
		main.getI();
		main.setText("Text");
		main.getText();
	}

	public HelloWorld()
	{
		this.i = 0;
		this.text = "Hallo";
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

	public void setText(String text)
	{
		this.text = text;
	}

	public String getText()
	{
		return this.text;
	}

}
