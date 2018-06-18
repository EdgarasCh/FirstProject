package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Menu;

public class MenuMapper implements RowMapper<Menu> {
	
	@Override
	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
		Menu menu = new Menu();
		menu.setId(rs.getInt("id"));
		menu.setGroup(rs.getString("group"));
		menu.setName(rs.getString("name"));
		menu.setCalory(rs.getInt("calory"));
		menu.setPrice(rs.getDouble("price"));
		return menu;
	}
}
