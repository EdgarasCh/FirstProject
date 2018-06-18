package dao;

import java.util.List;

import entity.Menu;

public interface MenuDao {
	
List<Menu> getAll();
	
	void save(Menu menu);
	
	Menu getById(int id);
	
	void update(Menu menu);
	
	void delete (int id);

}
