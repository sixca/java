package ws0228;

public class App {

	public static void main(String[] args) {
		// employee 5명, manager 5명 배열 지정

		Employee[] arrEmp = { 
				new Employee("0001", "Emp1", 1000000), 
				new Employee("0002", "Emp2", 1100000),
				new Employee("0003", "Emp3", 1200000), 
				new Employee("0004", "Emp4", 1300000),
				new Employee("0005", "Emp5", 1400000), };
		Manager[] arrMag = { 
				new Manager("1001", "Mag1", 2000000, 200000), 
				new Manager("1002", "Mag2", 2100000, 210000),
				new Manager("1003", "Mag3", 2200000, 220000), 
				new Manager("1004", "Mag4", 2300000, 230000),
				new Manager("1005", "Mag5", 2400000, 240000), };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0) {
					System.out.println(arrEmp[j].toString());
				} else {
					System.out.println(arrMag[j].toString());
				}
			}
			System.out.println("");

		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0) {
					System.out.println(arrEmp[j].getName() 
							+ "의 연봉은 " 
							+ arrEmp[j].getAnnSalary() 
							+ "원이고, 납부할 세금은 "
							+ Math.round(arrEmp[j].getTax()) 
							+ "원입니다."
							);
				} else {
					System.out.println(arrMag[j].getName() 
							+ "의 연봉은 " 
							+ arrMag[j].getAnnSalary() 
							+ "원이고, 납부할 세금은 "
							+ Math.round(arrMag[j].getTax()) 
							+ "원입니다.");
				}
			}
			System.out.println("");

		}

		for (int i = 0; i < 2; i++) {
			int sum = 0;
			for (int j = 0; j < 5; j++) {
				if (i == 0) {
					sum += arrEmp[j].getAnnSalary();
					if (j == 4) {
						System.out.printf("Employee의 연봉 합계: %s원 \n", sum);
					}
				} else {
					sum += arrMag[j].getAnnSalary();
					if (j == 4) {
						System.out.printf("Manager의 연봉 합계: %s원", sum);
					}
				}
			}

		}

	}
}
