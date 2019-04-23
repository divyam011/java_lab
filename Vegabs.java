//3.4 abs class
abstract class Vegetable{  
abstract void color(); 
abstract void wheregrow(); 
}  
class potato extends Vegetable{  
void color(){System.out.println("white");}
void wheregrow(){System.out.println("Under Ground");}  
}  
class spinach extends Vegetable{  
void color(){System.out.println("Green");}
void wheregrow(){System.out.println("Above Ground");}  
}  
class Vegabs{  
public static void main(String args[]){  
potato p=new potato();
p.color();  
p.wheregrow();
spinach s = new spinach();
s.color();
s.wheregrow(); 
}  
} 

/* o/p
white
Under Ground
Green
Above Ground
*/