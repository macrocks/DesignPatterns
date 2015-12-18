package com.facade.design.demo;

public class MySqlHelper implements Helper {

	@Override
	public Helper getDBConnection() {
	return null;
	}

	@Override
	public void generateHTMLReport(String table) {
		System.out.println("this will give you HTML report In MYSQL Table");
	}

	@Override
	public void generatePDFReport(String table) {
		System.out.println("this will give you PDF report In MYSQL Table");
	}
	
	
	

}
