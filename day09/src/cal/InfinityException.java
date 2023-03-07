package cal;
//우리 업무에 맞게 예외를 만들어준거지
public class InfinityException extends Exception{
	public InfinityException() {
		
	}
public InfinityException(String msgcode) {
		super(msgcode);
	}
}
