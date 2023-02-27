package whilecontrol;

public class P99 {
//구구단즈
	//현업에서 이렇게 2번 쓰는 경우는 거의 없다네
	//첫번째 for문이 돌아가고 그 안에서 두번째 for문이 돌아가고
	//
	public static void main(String[] args) {
				
		myfor:
		for(int i=2;i<10;i++) {
			System.out.printf("%d 단 \n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d \t",i,j,(i*j));  // \n은 개행, \t는 옆으로 탭탭
				if((i*j) == 21) {
					break myfor;   //안쪽 for문을 넘어 전체 for문을 멈추게하려면 
				}
			}
			System.out.println("");
		}
	}

	}

	