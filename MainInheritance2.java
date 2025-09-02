class Product
{
protected int aSal;
public void ccal(int sal,int bonus)
{
}
}

class Dd extends Product
{
public void ccal(int sal,int bonus)
{
int b=(sal*bonus)/100;
aSal=aSal+b;
System.out.println("The salary of the employee after the  bonus:"+aSal);
}
}

class Ee extends Product
{
public void ccal(int sal,int bonus)
{
int b=(sal*bonus)/100;
aSal=aSal+b;
System.out.println("The salary of the employee after the  bonus:"+aSal);
}
}

class MainInheritance2
{
public static void main(String args[])
{
Dd ob=new Dd();
ob.ccal(50000,10);

Ee obj=new Ee();
obj.ccal(30000,15);
}
}