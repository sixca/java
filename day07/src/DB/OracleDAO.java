package DB;

public class OracleDAO implements DAO{

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted Oracle Database");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted Oracle Database");		
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("updated Oracle Database");
	}
	
}
