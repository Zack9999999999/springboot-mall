package com.zach.springmall.rowmapper;

import com.zach.springmall.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();
        user.setUser_id(rs.getInt("user_id"));
        user.setEmail(rs.getString("user_id"));
        user.setPassword(rs.getString("password"));
        user.setCreated_date(rs.getTimestamp("created_date"));
        user.setLast_modified_date(rs.getTimestamp("last_modified_date"));

        return user;
    }
}
