package com.dk.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.dk.Model.User;

public class UserDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root@dk";
    
    private static final String INSERT_USER = "INSERT INTO user(name, email, password, role) VALUES (?, ?, ?, ?)";
    private static final String GET_BY_ID = "SELECT * FROM user WHERE id = ?";
    private static final String GET_ALL = "SELECT * FROM user";
    private static final String DELETE = "DELETE FROM user WHERE id = ?";
    private static final String UPDATE = "UPDATE user SET name = ?, email = ?, password = ?, role = ? WHERE id = ?";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public int insertUser(User user) {
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(INSERT_USER)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword()); // Hash before storing in real-world apps
            pstmt.setString(4, user.getRole());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateUser(User user) {
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(UPDATE)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getRole());
            pstmt.setInt(5, user.getId());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public User selectUserById(int id) {
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(GET_BY_ID)) {
            pstmt.setInt(1, id);
            ResultSet res = pstmt.executeQuery();
            if (res.next()) {
                return new User(
                        res.getInt("id"),
                        res.getString("name"),
                        res.getString("email"),
                        res.getString("password"),
                        res.getString("role")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet res = stmt.executeQuery(GET_ALL)) {
            while (res.next()) {
                users.add(new User(
                        res.getInt("id"),
                        res.getString("name"),
                        res.getString("email"),
                        res.getString("password"),
                        res.getString("role")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public int deleteById(int id) {
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(DELETE)) {
            pstmt.setInt(1, id);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
