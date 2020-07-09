package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//disadvantages of array:
		//1. size is fixed; Static Array: to overcome this we use collections-dynamic array-array list
		//2. it stores only similar data types: To overcome this, we use Object array

		
		//1. int array;
		
		int i[] = new int[4];
		
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
	//size of array
		System.out.println("Size of array is:");
		System.out.println(i.length);
		System.out.println("Printing array list:");
		for (int j=0;j<i.length;j++) {
		
			System.out.println(i[j]);
		}
		
		//2. double array
		
		double d[] = new double[3];
		
		d[0]=10.33;
		System.out.println(d[0]);
		
	}

}
