package remote;

public class Tv implements Remote{

	@Override
	public void turnOn() {
		System.out.println("Turn On TV");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off TV");
		
	}
	
}
