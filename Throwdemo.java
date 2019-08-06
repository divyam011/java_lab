class Throwdemo
{
static void throwone() throws IllegalAccessException
{
System.out.println("Inside throwone");
throw new IllegalAccessException();
}
public static void main(String args[])
{
System.out.println("Inside Main Method");
try{
throwone();
}
catch(IllegalAccessException e)
{
System.out.println("catch"+e);
}
}
}
