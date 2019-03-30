class Add{
	int a=10,b=15;
	Add(){
		System.out.println("a+b = "+(a+b));
	}
}
class Defconst{
	public static void main(String[] args) {
		Add a1 = new Add();
	}
}

//output : a+b = 25
