import java.sql.Connection;
import java.sql.DriverManager;

import org.example.db.HsqlUnitOfWork;
import org.example.db.dao.OctoDao;
import org.example.db.dao.HsqlOctoDao;
import org.example.db.dao.HsqlCharacterDao;
import org.example.list.Attack;
import org.example.list.Octo;
import org.example.list.Character;


public class Main {

	public static void main(String[] args) {
		
		
		
			HsqlUnitOfWork uow = new HsqlUnitOfWork();
			OctoDao dao = new HsqlOctoDao(uow);
			Octo c = new Octo();
			
			c.setEmail("a@wp.pl");
			c.setName("Jan");
			c.setSurname("Nowak");
			c.setNumber("1234");
			c.setId(0);
			
			Attack o = new Attack();
			o.setCity("Kurlandia");
			o.setStreet("Escheira");
			o.setLocalNumber(34);
			o.setPostalCode("1234");
			
			Octo c1 = new Octo();
			c1.setId(0);
			dao.delete(c1);
			dao.save(c);
			uow.commit();
			uow.close();
		System.out.println("koniec");
	}

}
