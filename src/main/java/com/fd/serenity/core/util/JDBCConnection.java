package com.fd.serenity.core.util;

import java.sql.*;

public class JDBCConnection {

	private static final String URL = "jdbc:oracle:thin:@10.68.47.126:1521/MPSAUAT_HA";
	private static final String userID = "PORTAL_ADM";
	private static final String password = "d3fPWgb_mpw";

	public static String getPasscode(String userName, String sqlQuery) throws ClassNotFoundException, SQLException {

		String passcode = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection Con = DriverManager.getConnection(URL, userID, password);
			// System.out.println("connection Successful");
			if (Con != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Failed to make connection!");
			}

			Statement stmt = Con.createStatement();

			ResultSet rs = stmt.executeQuery(sqlQuery + "'" + userName + "'");
			while (rs.next()) {
				passcode = rs.getString("passcode");
				System.out.println("The Passcode is " + passcode);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return passcode;
	}

	public static String getEncryptedUserName(String userName, String sqlQuery)
			throws ClassNotFoundException, SQLException {

		String encryptedUserName = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection Con = DriverManager.getConnection(URL, userID, password);
			// System.out.println("connection Successful");
			if (Con != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Failed to make connection!");
			}

			Statement stmt = Con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQuery + "'" + userName + "'");
			while (rs.next()) {
				encryptedUserName = rs.getString("HASH_VALUE");
				System.out.println("The Hash Value is " + encryptedUserName);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return encryptedUserName;
	}

	public static String getLoginAttemptCount(String userName, String sqlQuery)
			throws ClassNotFoundException, SQLException {

		String attemptCount = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection Con = DriverManager.getConnection(URL, userID, password);
			// System.out.println("connection Successful");
			if (Con != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Failed to make connection!");
			}

			Statement stmt = Con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQuery + "'" + userName + "'");
			while (rs.next()) {
				attemptCount = rs.getString("INVALID_LOGIN_COUNT");
				System.out.println("The Attempt count is " + attemptCount);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return attemptCount;
	}

	public void resetPasswordExpirationDate(String userName, String sqlQuery)
			throws ClassNotFoundException, SQLException {

		// String attemptCount=null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection Con = DriverManager.getConnection(URL, userID, password);
			// System.out.println("connection Successful");
			if (Con != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Failed to make connection!");
			}

			Statement stmt = Con.createStatement();
			String query = sqlQuery + "'" + userName + "'";
			System.out.println("The sql query is:" + sqlQuery);
			ResultSet rs = stmt.executeQuery(query);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void lockAccount(String userName, String sqlQuery) throws ClassNotFoundException, SQLException {

		// String attemptCount=null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection Con = DriverManager.getConnection(URL, userID, password);
			// System.out.println("connection Successful");
			if (Con != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Failed to make connection!");
			}

			Statement stmt = Con.createStatement();
			String query = sqlQuery + "'" + userName + "'";
			System.out.println("The sql query is:" + sqlQuery);
			ResultSet rs = stmt.executeQuery(query);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String GetTheDbqueryValue(String sqlQuery) throws ClassNotFoundException, SQLException {
		String passcode = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection Con = DriverManager.getConnection(URL, userID, password);
			// System.out.println("connection Successful");
			if (Con != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Failed to make connection!");
			}

			Statement stmt = Con.createStatement();

			ResultSet rs = stmt.executeQuery(sqlQuery);
			// ResultSet rs= stmt.executeQuery("select username,passcode from
			// usr u where u.username='TestAutomationBO';");
			while (rs.next()) {
				passcode = rs.getString("passcode");
				System.out.println("Passcode is : " + passcode);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return passcode;
	}

	public static String getMerchantHierarchyDetails(String merchantId, String sqlQuery)
			throws ClassNotFoundException, SQLException {

		// String attemptCount=null;
		String tradeName = null;
		String city = null;
		String emailId = null;
		String addressLine1 = null;
		String addressLine2 = null;
		String zipCode = null;
		String finalString = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection Con = DriverManager.getConnection(URL, userID, password);
			// System.out.println("connection Successful");
			if (Con != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Failed to make connection!");
			}

			Statement stmt = Con.createStatement();
			String query = sqlQuery + "'" + merchantId + "'";
			System.out.println("The sql query is:" + sqlQuery);
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				// select TRADE_NAME, CITY, EMAIL_ADDRESS, ADDRESS_LINE_1,
				// ADDRESS_LINE_2, ZIP_CODE from merchant where alliance_code =
				// 'EMS' and external_merch_id =

				tradeName = rs.getString("TRADE_NAME");
				city = rs.getString("CITY");
				emailId = rs.getString("EMAIL_ADDRESS");
				addressLine1 = rs.getString("ADDRESS_LINE_1");
				addressLine2 = rs.getString("ADDRESS_LINE_2");
				zipCode = rs.getString("ZIP_CODE");

				finalString = new StringBuilder().append(tradeName).append(":").append(city).append(":").append(emailId)
						.append(":").append(addressLine1).append(":").append(addressLine1).append(":").append(zipCode)
						.toString();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return finalString;

	}

}
