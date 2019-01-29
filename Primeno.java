class Primeno
{
public static void main(String args[])
{
int j,i;
for(i=1;i<=25;i++)
{
int c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==2)
System.out.println("prime nos="+i);
}
}
} 
