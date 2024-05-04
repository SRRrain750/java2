class Box
{
private int length,breadth,height;//instance member variable

public void setDimension(int l,int b,int h)//instance mem vari
{length=l; breadth=b; height=h;}

public void showDimension()//instance mem vari
{

System.out.println("l="+length);
System.out.println("b="+breadth);
System.out.println("H="+height);
}


}


class Compartment
{
public static void main(String args[])
{
Box smallBox=new Box();

smallBox.setDimension(12,23,11);
smallBox.showDimension();
smallBox=new Box();
smallBox.showDimension();
}
}