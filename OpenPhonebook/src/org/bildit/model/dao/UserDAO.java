package org.bildit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bildit.model.dto.User;

public class UserDAO implements IUserDAO {
	
	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public User getUser(String name) throws SQLException {
		
		User user = null;
		
		String query = "SELECT * FROM imenik.user WHERE user.name = ?";
		
		ResultSet rs = null;
		
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			
			ps.setString(1, name);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				user = new User(rs.getString("name"), rs.getString("password"));
			}
			rs.close();
			
			return user;
		}		
		
	}

	@Override
	public boolean addUser(String name, String password) throws SQLException {		
	
		String query = "INSERT INTO imenik.user (name,password) VALUES (?, ?)";
		
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, name);
			ps.setString(2, password);
			
			ps.executeUpdate();
			
		}
		return true;
		}

	@Override
	public boolean updateUser(User user, String password) throws SQLException {
				
		String query = "UPDATE imenik.user SET password = ? WHERE user.name = ?";

		try (PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, password);
			ps.setString(2, user.getName());
			ps.executeUpdate();
	
			return true;
		}

	}

}
