class Test
{
	int a;
	Test(int a){

		this.a=a;
	}
	Test(Test t)
	{
	this.a=t.a;
}
 void  m1(){

	System.out.print(a);
	}
}
public class CopyConstructorMethUse{
	public static void main(String [] args){

		Test  t1 = new Test(5);
		Test  t2 = new Test(t1);

		t1.m1();//a=5
		System.out.println("");
		t2.m1();//a=5
		System.out.println("");
		t1.a=10;//a=10;
	System.out.println("");
		t1.m1();   //a=10;
	System.out.println("");
	    t2.m1();  // a=5;
	System.out.println("");
	}
}