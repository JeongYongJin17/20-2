package Exercise;

public class Num2 extends Thread{
	private int Io,hi;
	private int[] arr;
	private int ans =0;
	
	public Num2(int[] arr, int Io, int hi) {
		this.Io=Io;
		this.hi=hi;
		this.arr=arr;
	}
	
	public void run() {
		for(int i =Io; i< hi; i++) {
			ans += arr[i];
		}
	}
	
	public static int sum(int[] arr) throws InterruptedException{
		int len = arr.length;
		int ans =0;
		
		Num2[] ts = new Num2[4];
		for(int i =0; i <4; i++) {
			ts[i] = new Num2(arr, (i * len)/ 4,((i+1)*len/4));
			ts[i].start();
		}
		
		for(int i =0; i< 4; i++) {
			ts[i].join();
			ans += ts[i].ans;
		}
		return ans;
	}

	public static void main(String[] args) throws InterruptedException{
		int[] arr = new int[100];
		for (int i =0; i< arr.length; i++) {
			arr[i] = i;
		}
		int sum = sum(arr);
		System.out.println("합계: " + sum);
	}

}
