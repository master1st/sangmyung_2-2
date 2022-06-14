public class Die{
	private final int MAX =6;
	private int faceValue;
	
	public Die()
	{
		this.faceValue = 1;
	}
	public int roll()
	{
		this.faceValue = (int)(Math.random() * MAX);
		
		return faceValue;
	}
	public void setFaceValue(int value)
	{
		this.faceValue = value;
	}
	public int getValue()
	{
		return this.faceValue;
	}
	public String toString()
	{
		String result = Integer.toString(this.faceValue);
		return result;
	}
}


