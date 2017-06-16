package database.sql.test.helpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.sql.test.model.*;

public class Helpers {

	private Connection connection = DbConnectionTest.getConnection();
	private User user;

	public void addUser(User user) {
		String sql = "INSERT INTO users (FirstName, City, Phone, Email) VALUES (?, ?, ?, ?);";

		try (PreparedStatement addUser = connection.prepareStatement(sql)) {
			addUser.setString(1, user.getFirstName());
			addUser.setString(2, user.getCity());
			addUser.setString(3, user.getPhone());
			addUser.setString(4, user.getEmail());
			addUser.executeUpdate();
			System.out.println("Completed successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removeUser(int userID) {
		String sql = "DELETE FROM users WHERE UserID = ?;";

		try (PreparedStatement removeUser = connection.prepareStatement(sql)) {
			removeUser.setInt(1, userID);
			removeUser.executeUpdate();
			System.out.println("Completed successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateUserFirstName(int userID, String firstName) {
		String sql = "UPDATE users SET FirstName = ? WHERE UserID = ?;";

		try (PreparedStatement updateUserFirstName = connection.prepareStatement(sql)) {
			updateUserFirstName.setString(1, firstName);
			updateUserFirstName.setInt(2, userID);
			updateUserFirstName.executeUpdate();
			System.out.println("Completed successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateUserCity(int userID, String city) {
		String sql = "UPDATE users SET City = ? WHERE UserID = ?;";
		
		try (PreparedStatement updateCity = connection.prepareStatement(sql)) {
			updateCity.setString(1, city);
			updateCity.setInt(2, userID);
			updateCity.executeUpdate();
			System.out.println("Completed successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateUserPhone(int userID, String phone) {
		String sql = "UPDATE users SET Phone = ? WHERE UserID = ?;";

		try (PreparedStatement updateUserPhone = connection.prepareStatement(sql)) {
			updateUserPhone.setString(1, phone);
			updateUserPhone.setInt(2, userID);
			updateUserPhone.executeUpdate();
			System.out.println("Completed successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateUserEmail(int userID, String email) {
		String sql = "UPDATE users SET Email = ? WHERE UserID = ?;";

		try (PreparedStatement updateUserEmail = connection.prepareStatement(sql)) {
			updateUserEmail.setString(1, email);
			updateUserEmail.setInt(2, userID);
			updateUserEmail.executeUpdate();
			System.out.println("Completed successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User searchUser(int userID) {
		String sql = "SELECT * FROM users WHERE UserID = ?;";

		try (PreparedStatement searchUser = connection.prepareStatement(sql)) {
			searchUser.setInt(1, userID);
			ResultSet result = searchUser.executeQuery();

			while (result.next()) {
				user = new User();
				user.setUserId(result.getInt("UserID"));
				user.setFirstName(result.getString("FirstName"));
				user.setCity(result.getString("City"));
				user.setPhone(result.getString("Phone"));
				user.setEmail(result.getString("Email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<User> getAllUsers() {
		List<User> usersList = new ArrayList<>();
		String sql = "SELECT * FROM users;";

		try (PreparedStatement getAllUsers = connection.prepareStatement(sql)) {
			ResultSet result = getAllUsers.executeQuery();

			while (result.next()) {
				user = new User();
				user.setUserId(result.getInt("UserID"));
				user.setFirstName(result.getString("FirstName"));
				user.setCity(result.getString("City"));
				user.setPhone(result.getString("Phone"));
				user.setEmail(result.getString("Email"));
				usersList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usersList;
	}

	public List<User> getAllUsersFromCity(String city) {
		List<User> usersList = new ArrayList<>();
		String sql = "SELECT * FROM users WHERE City = ?;";

		try (PreparedStatement getAllUsersFromCity = connection.prepareStatement(sql)) {
			getAllUsersFromCity.setString(1, city);
			ResultSet result = getAllUsersFromCity.executeQuery();

			while (result.next()) {
				user = new User();
				user.setUserId(result.getInt("UserID"));
				user.setFirstName(result.getString("FirstName"));
				user.setCity(result.getString("City"));
				user.setPhone(result.getString("Phone"));
				user.setEmail(result.getString("Email"));
				usersList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usersList;
	}

}
