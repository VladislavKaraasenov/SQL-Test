package database.sql.test.controller;

import java.util.List;

import database.sql.test.helpers.Helpers;
import database.sql.test.model.User;

public class DBTest {

	public static void main(String[] args) {

		// DbConnectionTest.getConnection();

		Helpers helpers = new Helpers();

		// User user = new User("Name", "City", "Phone", "Email");
		// helpers.addUser(user);

		// helpers.updateUserFirstName(50, "update_Name");
		// helpers.updateUserCity(50, "update_City");
		// helpers.updateUserPhone50, "update_Phone");
		// helpers.updateUserEmail(50, "update_Email");

		// System.out.println(helpers.getAllUsersFromCity("update_City"));
		// helpers.removeUser(50);

		List<User> users = helpers.getAllUsers();
		for (User u : users) {
			System.out.println(u);
		}
	}
}
