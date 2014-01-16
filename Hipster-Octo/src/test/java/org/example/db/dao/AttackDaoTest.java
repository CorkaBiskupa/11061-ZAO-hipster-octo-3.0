package org.example.db.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.example.db.HsqlUnitOfWork;
import org.example.db.MockDb;
import org.example.list.Attack;
import org.example.list.Octo;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AttackDaoTest {
	
	AttackDao dao;

	Connection connection = null;
	private Statement drop;
	
	@BeforeClass
	public static void initialize()
	{}

	Attack o = new Attack();
	o.setCity("Kurlandia");
	o.setStreet("Escheira");
	o.setLocalNumber(34);
	o.setPostalCode("1234");
	try {

		HsqlUnitOfWork uow = new HsqlUnitOfWork();
		dao = new HsqlAttackDao(uow);
		dao.save(o);
		uow.commit();
		drop = uow.getConnection().createStatement();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@After
public void teardown()
{
	try{
		if(connection!=null && !connection.isClosed())
		{	
			drop.executeUpdate("Drop table Client");
			connection.close();
			connection = null;
		}}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
}

@Test
public void testGet() {
	
	Attack o1 = dao.get(0);
	Attack o2 = dao.get(2);
	Attack o3 = dao.get(0);
	
	assertNotNull("Zwrócono null mimo ze obiekt jest w bazie",c1);
	assertNull("zwrócono wartosc mimo, że nie ma takiego obiektu w bazie",c2);
	assertTrue(o1.getEmail().equals("a@wp.pl"));
	
	assertEquals(o1.getName(),"Jan");
	assertEquals(o1.getSurname(), "Nowak");
	assertEquals(o1.getNumber(),"1234");
	
	assertNotSame(c1,c3);
	
}}