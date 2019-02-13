class Box
{
int width;
int height;
int depth;
void setdim(int w,int h, int d)
{
width = w;
height = h;
depth = d;
}
double volume()
{
return(width*height*depth);
}
}
class Demo
{
public static void main(String args[])
{
obj1.setdim(10,20,30);
obj2.setdim(4,3,5);
double v1 = obj1.volume();
double v2 = obj2.volume();
}
}
