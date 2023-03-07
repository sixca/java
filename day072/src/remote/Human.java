package remote;

public class Human {

	public static void main(String[] args) {
		Remote remote = new Tv();             //여기 뭐가 탑재되냐에 따라서 TV를 킬지, Audio를 킬지 선택할 수 있다
		remote.turnOff();
		remote.turnOn();

	}

}
