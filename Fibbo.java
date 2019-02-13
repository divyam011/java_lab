class Fibbo
{
public static void main(String args[])
{
int a=0,b=1,i,s=0;
System.out.println(a);
System.out.println(b);
for(i=1;i<=10;i++)
{
s=a+b;
System.out.println(s);
a=b;
b=i;
}
}
}

