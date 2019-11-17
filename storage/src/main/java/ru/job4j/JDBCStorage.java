package ru.job4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Class JDBCStorage implements Storage for Postgres database.
 *
 * @author Evgeny Shpytev (mailto:eshpytev@mail.ru).
 * @version 1.
 * @since 17.11.2019.
 */
@Component
public class JDBCStorage implements Storage {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean add(User user) {
        boolean result = true;
        String sql = "insert into users(name, age, email) values(:name, :age, :email)";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", user.getName());
        params.addValue("age", user.getAge());
        params.addValue("email", user.getEmail());
        try {
            this.jdbcTemplate.update(sql, params);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = true;
        String sql = "delete from users where id = ?";
        try {
            this.jdbcTemplate.update(sql, id);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    @Override
    public User getById(int id) {
        String sql = "select * from users where id = ?";
        return this.jdbcTemplate.queryForObject(sql, new Object[] {id}, new UserRowMapper());
    }

    @Override
    public List<User> getAll() {
        String sql = "select * from users";
        return this.jdbcTemplate.query(sql, new UserRowMapper());
    }

    private static final class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            user.setEmail(rs.getString("email"));
            return user;
        }
    }
}
