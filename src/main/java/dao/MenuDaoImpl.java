package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.Menu;
import mapper.MenuMapper;


public class MenuDaoImpl implements MenuDao {

public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MenuDaoImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Menu> getAll() {
		String sql = "SELECT * FROM menu"; 
		return jdbcTemplate.query(sql, new MenuMapper());
	}

	@Override
	public void save(Menu menu) {
		String sql = "INSERT INTO `menu` (`id`, `group`, `name`, `calory`, `price`) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, menu.getId(), menu.getGroup(), menu.getName(),  menu.getCalory(), menu.getPrice());
		
	}

	@Override
	public Menu getById(int id) {
		String sql = "SELECT * FROM menu WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new MenuMapper(), id);
	}

	@Override
	public void update(Menu menu) {
		String sql = "UPDATE `menu` SET `group` = ?, `name` = ?, `calory` = ?, `price` = ? WHERE id = ?";
		jdbcTemplate.update(sql, menu.getGroup(), menu.getName(),  menu.getCalory(), menu.getPrice(), menu.getId());
		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM menu WHERE id = ?";
		jdbcTemplate.update(sql, id);
		
	}

}
