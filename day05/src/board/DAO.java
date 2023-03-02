package board;

public class DAO {
	public void insert(String str) {
		System.out.println("Inserted Oracle Database Row:" + str);
	}

	public void update(int num, String str) {
		System.out.println("Updated Oracle Database Row:" + num + " " + str);
	}

	public void delete(int num) {
		System.out.println("Deleted Oracle Database Row:" + num);
	}

	public String select(int num) {
		return "Hi database ...";
	}
}
