package Exercise;


public class Num4 {

	public static void main(String[] args) {
		Reservation reserve = new Reservation();
		Person thread1 = new Person(reserve,5);
		thread1.start();
		Person thread2 = new Person(reserve,4);
		thread2.start();
		Person thread3 = new Person(reserve,2);
		thread3.start();
	}
}

class Reservation{
	static int availableSeats = 10;
	
	synchronized void reserveSeat (int requestedSeats) {
		System.out.println(Thread.currentThread().getName()+"가 들어왔음.");
		System.out.println("가능한 좌석수 : " + availableSeats + "요청좌석수: "+requestedSeats);
		if(availableSeats >= requestedSeats) {
			System.out.println("좍석이 가능합니다 예약하세요");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
			System.out.println(requestedSeats + " 좌석이 예약되었음.");
			availableSeats = availableSeats - requestedSeats;
		}
		else {
			System.out.println("좌석 예약이 불가능합니다.");
		}
		System.out.println(Thread.currentThread().getName() + "가 나갑니다.");
		System.out.println("-------------------------------------------");
	}
}

class Person extends Thread {
	Reservation reserve;
	int requestedSeats;
	
	public Person(Reservation reserve, int requestedSears) {
		this.reserve = reserve;
		this.requestedSeats = requestedSears;
	}
	
	public void run() {
		reserve.reserveSeat(requestedSeats);
	}
}
