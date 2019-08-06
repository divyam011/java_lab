
import java.lang.Exception;

class Myexc extends Exception
{
Myexc(String msg)
{
super(msg);
}
}

class Userdef
{
public static void main(String[] args)
{
	double pi=2.14;
                  
          try
          {
              if(pi!=3.14)
              throw new Myexc("not valid");    
          }
          catch(Myexc e)
          {
              System.out.println("caught");
	      System.out.println(e.getMessage());    
          }
    }
}



