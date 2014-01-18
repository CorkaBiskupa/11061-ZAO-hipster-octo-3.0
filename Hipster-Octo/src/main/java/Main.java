import java.sql.Connection;
import java.sql.DriverManager;

import org.example.db.HsqlUnitOfWork;
import org.example.db.dao.AttackDao;
import org.example.db.dao.HsqlAttackDao;
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
			
			c.setEmail("happy.terOrist@octoland.cl");
			c.setName("Octo");
			c.setSurname("Yellow");
			c.setNumber("11061");
			c.setId(0);
			
			Octo c0 = new Octo();
			
			c0.setEmail("happy.massacrist@octoland.cl");
			c0.setName("John");
			c0.setSurname("Red");
			c0.setNumber(":909");
			c0.setId(0);
			
			Octo c1 = new Octo();
			
			c1.setEmail("mad.florist@octoland.cl");
			c1.setName("Knitting");
			c1.setSurname("Schauspielerin");
			c1.setNumber("5830");
			c1.setId(0);
			
			Octo c2 = new Octo();
			
			c2.setEmail("weird.dancer@octoland.cl");
			c2.setName("Octo");
			c2.setSurname("YPink");
			c2.setNumber("73745");
			c2.setId(0);
			
			
			Octo cX = new Octo();
			cX.setId(0);
			dao.delete(cX);
			dao.save(c);
			dao.save(c0);
			dao.save(c1);
			dao.save(c2);
			//dao.save(c);
			uow.commit();
			uow.close();
			
			
			
		System.out.println("koniec");
	}

}
