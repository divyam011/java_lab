class StudentDetails
{
String name;
int roll;
int marks;
String dept;
void studentdata(String n,int r,int m,String d)
{
name = n;
roll = r;
marks = m;
dept = d;
System.out.println("name="+name);
System.out.println("roll="+roll);
System.out.println("marks="+marks);
System.out.println("dept="+dept);
} 
}
class Student
{

public static void main(String args[])
{
StudentDetails ob1 = new StudentDetails();
StudentDetails ob2 = new StudentDetails();
StudentDetails ob3 = new StudentDetails();
StudentDetails ob4 = new StudentDetails();
ob1.studentdata("abhi",112,56,"ece");
ob2.studentdata("appu",113,57,"ece");
ob3.studentdata("raj",114,76,"ece");
ob4.studentdata("deep",115,36,"ece");

System.out.println("highest scorer...");

if(ob1.marks>ob2.marks && ob1.marks > ob3.marks && ob1.marks > ob4.marks)
{
System.out.println("name="+ob1.name);

System.out.println("marks="+ob1.marks);

}
else if(ob2.marks>ob1.marks && ob2.marks > ob3.marks && ob2.marks > ob4.marks)
{
System.out.println("name="+ob2.name);

System.out.println("marks="+ob2.marks);

}
else if(ob3.marks>ob1.marks && ob3.marks > ob2.marks && ob3.marks > ob4.marks)
{
System.out.println("name="+ob3.name);

System.out.println("marks="+ob3.marks);

}
else
{
System.out.println("name="+ob4.name);

System.out.println("marks="+ob4.marks);

}


}
}