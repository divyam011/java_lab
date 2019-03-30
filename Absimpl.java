//3.3 implement abstract class
abstract class Animal{  
  abstract void alive();  
}  
class Absimpl extends Animal{  
void alive(){System.out.println("Alive");}  
public static void main(String args[]){  
 Animal obj = new Absimpl();  
 obj.alive();  
}  
}

//  o/p: Alive