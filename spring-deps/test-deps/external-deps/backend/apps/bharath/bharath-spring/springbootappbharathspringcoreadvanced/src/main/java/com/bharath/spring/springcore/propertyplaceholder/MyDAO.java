package com.bharath.spring.springcore.propertyplaceholder;

public class MyDAO {

	private String dbServer;
	private String dbPort;
	private String dbUsername;
	private String dbPassword;

	public MyDAO(String dbServer, String dbPort, String dbUsername, String dbPassword) {
		super();
		this.dbServer = dbServer;
		this.dbPort = dbPort;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort=" + dbPort + ", dbUsername=" + dbUsername + ", dbPassword="
				+ dbPassword + "]";
	}

}
