package com.facade.design.demo;

public class OracleHelper implements Helper {

	@Override
	public Helper getDBConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateHTMLReport(String table) {
	System.out.println("this will generate oracle HTML report in ORACLE table");
		
	}

	@Override
	public void generatePDFReport(String table) {
		System.out.println("this will generate oracle PDF report  in ORACLE table");
		
	}

}
