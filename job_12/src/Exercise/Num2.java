package Exercise;

class MyMath<T extends Number>{
	double v=0.0;
	public double getAverage(T[] a) {
		for (int i = 0; i< a.length; i++)
			v=v+a[i].doubleValue();
		return v/a.length;
	}
}

public class Num2 {

	public static void main(String[] args) {
		Integer[] list = { 1,2,3,4,5,6};
		
		MyMath<Integer> m = new MyMath<Integer>();
		System.out.println(m.getAverage(list));
	}
}
