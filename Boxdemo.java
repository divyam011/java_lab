class Box
	{
		int length, breadth, height;
		void setDim(int l,int b,int h)
		{
			length=l;
			breadth=b;
			height=h;
		}
		double Volume()
		{
			return (length*breadth*height);
		}
	}
class Boxdemo
{
	public static void main(String args[])
	{
		Box b=new Box();
	    b.setDim(10,20,30);
		double v1 = b.Volume();
	    System.out.println("Volume of Box is"+v1);

	}
}
