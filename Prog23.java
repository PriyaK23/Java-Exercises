class A1{
void msg()
{
	System.out.println("Hello");
	} 	
}
class B1
{
void msg()
{
	System.out.println("Welcome");
} 	
}

class C1 extends A1,B1 
{
	C1(){}
}


public class Prog23 {

public static void main(String args[]){
C1 obj=new C1();
obj.msg();//Now which msg() method would be invoked?
}
}

