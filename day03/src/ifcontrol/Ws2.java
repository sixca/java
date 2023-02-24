package ifcontrol;

public class Ws2 {
//강사님 공유 초깔끔스 코오드
	public static void main(String[] args) {
		int sumWith3 = 0;
        int sumWith4 = 0;
        int sumWith7 = 0;
        int sumWith3Count = 0;
        int sumWith4Count = 0;
        int sumWith7Count = 0;
        for (int i = 0; i <= 100; i++) {
            if((i % 3) == 0) {
                sumWith3 += i;
                sumWith3Count++;
            }
            if((i % 4) == 0) {
                sumWith4 += i;
                sumWith4Count++;
            }
            if((i % 7) == 0) {
                sumWith7 += i;
                sumWith7Count++;
            }
        }
        System.out.println(sumWith3 +" " + sumWith3Count);
        System.out.println(sumWith4 +" " + sumWith4Count);
        System.out.println(sumWith7 +" " + sumWith7Count);

	}

}
