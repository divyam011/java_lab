class Vol{
	int length,breadth,height;
	Vol(int l, int b, int h){
		//System.out.println("volume of room = ")
		int volume;
		length = l;
		breadth = b;
		height = h;

	}
	void display(){
		System.out.println("volume of room = "+(length*breadth*height));
	}
}
class Roomvol{
	public static void main(String[] args) {
		Vol v = new Vol(10,5,8);
		v.display();
	}
}
 
 //output : volume of room = 400
