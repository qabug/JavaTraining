package OOPConceptPart1;

public class CallbyValAndCallByRef {

	
	int p;
	int q;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallbyValAndCallByRef obj = new CallbyValAndCallByRef();
		
		int x= 10;
		
		int y = 20;
		
		int i = obj.testSum(x, y);//Call or pass by Value
		
		System.out.println(i);
		
		obj.p=50;
		obj.q=60;
				
		
		obj.swap(obj);
		
		System.out.println("AfterSwapping");
		System.out.printf("Value of P %d", obj.p);
		System.out.printf("\nValue of Q %d", obj.q);
		
	}
	
	
	
	public int testSum(int a, int b) {
		
		a=30;
		b=40;
		
		int c= a+b;
		
		return c;
	}

	//Call By referenec
	public void swap(CallbyValAndCallByRef t) {
		
		int tmp;
		
		tmp = t.p;// tmp=50
		t.p=t.q;// t.p=60
		t.q= tmp;//t.q=50
		
		
	}
	
}
