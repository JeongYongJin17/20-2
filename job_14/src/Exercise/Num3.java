package Exercise;

public class Num3 extends Thread{
	private int Io, hi;
	private int[] arr;
	private int ans =0;
	
	public Num3(int[] arr, int Io, int hi) {
		this.Io =Io;
		this.hi =hi;
		this.arr = arr;
	}
	
	public void run() {
		ans = arr[Io];
		for (int i = Io; i<hi;i++) {
			if(ans<arr[i])
				ans =arr[i];
		}
	}
	
	public static int max(int[] arr) throws InterruptedException{
		int len =arr.length;
		int ans =0;
		
		Num3[] ts = new Num3[4];
		for ( int i =0; i <4; i++) {
			ts[i] =new Num3(arr, (i*len)/ 4, ((i+1)*len/4));
			ts[i].start();
		}
		ans = -1;
		
		for(int i =0; i < 4; i++) {
			ts[i].join();
			if(ans < ts[i].ans)
				ans = ts[i].ans;
		}
		return ans;
	}

	public static void main(String[] args) throws InterruptedException{
		int[] arr = new int[100];
		for(int i =0; i<arr.length; i++) {
			arr[i]=i;
		}
		int m = max(arr);
		System.out.println("최댓값:" + m);
		

	}

}
