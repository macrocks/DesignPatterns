package com.facade.design.demo;

public interface Helper {

	public Helper getDBConnection();
	
	public void generateHTMLReport(String table);
	
	public void generatePDFReport(String table);
	
}
