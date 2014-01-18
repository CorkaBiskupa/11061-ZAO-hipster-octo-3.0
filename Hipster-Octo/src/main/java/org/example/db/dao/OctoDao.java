package org.example.db.dao;

import org.example.db.Dao;
import org.example.list.Octo;

public interface OctoDao extends Dao<Octo>{
	
	public void setAttacks(Octo c);
	
}
