// 3.1 overridding

class animal{
	void alive(){System.out.println("animal is alive");}
}
class Lion extends animal{
	void alive(){System.out.println("lion also is alive");}
	public static void main(String[] args) {
		Lion a = new Lion();
		a.alive();
	}
}

//  o/p: lion also is alive