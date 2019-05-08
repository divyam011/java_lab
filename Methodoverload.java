class Areas{
	void Area(int r){
		System.out.println("area of circle = "+(3.142*r*r));
	}
	void Area(int b, int h){
		System.out.println("area of tringle = "+(0.5*b*h));
	}
	void Area(double r,double h){
		System.out.println("area of cylinder = "+(3.142*r*r*h));
	}
}
class Methodoverload{
	public static void main(String[] args) {
		Areas a = new Areas();
		a.Area(5);
		a.Area(5,7);
		a.Area(5.0,7.0);
	}
}

/*area of circle = 78.55
area of tringle = 17.5
area of cylinder = 549.85
*/