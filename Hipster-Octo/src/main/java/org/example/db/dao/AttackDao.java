package org.example.db.dao;

import java.util.List;

import org.example.db.Dao;
import org.example.list.Attack;

public interface AttackDao extends Dao<Attack> {

	public List<Attack> getAttackByOctoId(int id);
}
