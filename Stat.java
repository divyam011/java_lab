class Staatic{
	static{
		System.out.println("Static block invoked");
	}
	int principal;
	static double rate = 5.0;
	int time;
	static void change(){
		rate=10.0;
	}
	Staatic(int p,int t){
		principal = p;
		time = t;
	}
	void si(){
		System.out.println("simple interest = "+((principal*rate*time)/100));
	}
}
class Stat{
	public static void main(String[] args) {
		Staatic.change();
		Staatic s = new Staatic(100,1);
		s.si();
	}
}

//output: Static block invoked
//		  simple interest = 10.0