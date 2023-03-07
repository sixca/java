package remote;

public class Audio implements Remote {

	@Override
	public void turnOn() {
		System.out.println("Turn On Audio");

	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off Audio");

	}

}
