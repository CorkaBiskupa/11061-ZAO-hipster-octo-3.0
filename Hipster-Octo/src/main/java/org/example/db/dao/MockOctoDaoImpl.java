package org.example.db.dao;

import java.util.ArrayList;
import java.util.List;

import org.example.db.EntityBase;
import org.example.db.MockDb;
import org.example.list.Octo;
//koment
public abstract class MockOctoDaoImpl implements OctoDao{

	private MockDb db;
	
	
	
	public MockOctoDaoImpl(MockDb db) {
	
		this.db = db;
	}

	public void save(Octo ent) {
		db.save(ent); 
		
	}

	public void delete( Octo ent) {
		db.getItems().remove(ent);
		
	}

	public List<Octo> getAll() {
		List<Octo> result = new ArrayList<Octo>();
		for(EntityBase ent: db.getItems())
		{
			if(ent instanceof Octo)
				result.add((Octo)ent);
		}
		
		return result;
	}

	public Octo get(int id) {
		for(Octo c: getAll())
		{
			if(c.getId()==id)
			{
				Octo c1 = new Octo();
				c1.setId(c.getId());
				c1.setEmail(c.getEmail());
				c1.setNumber(c.getNumber());
				c1.setSurname(c.getSurname());
				c1.setName(c.getName());
				return c1;
			}
		}
		return null;
	}

	public void setAddresses(Octo c) {
		
		
	}

	public void setOrders(Octo c) {
		
		
	}

	//public void update(Octo ent) {
		// TODO Auto-generated method stub
		
	//}

	//public void update(Octo ent) {
		// TODO Auto-generated method stub
		
	//}

	public void setAttacks(Octo c) {
		// TODO Auto-generated method stub
		
	}

}
