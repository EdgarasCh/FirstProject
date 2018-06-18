package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.MenuDao;
import entity.Menu;

public class MenuServiceImpl implements MenuService {

	@Autowired
	public MenuDao menuDao;
	
	@Override
	public List<Menu> getAll() {
		return menuDao.getAll();
	}

	@Override
	public void save(Menu menu) {
		menuDao.save(menu);
		
	}

	@Override
	public Menu getById(int id) {
		return menuDao.getById(id);
	}

	@Override
	public void update(Menu menu) {
		menuDao.update(menu);
		
	}

	@Override
	public void delete(int id) {
		menuDao.delete(id);
		
	}

}
