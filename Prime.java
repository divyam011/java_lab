class Prime
{
public static void main(String args[])
{
int a=29,i,c=1;
for(i=2;i<a;i++)
{
if(a%i==0)
	c++;
}
if(c>1)
	System.out.println("not prime no");
else
	System.out.println("prime no");
}
}

