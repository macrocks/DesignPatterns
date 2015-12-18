package com.facade.design.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tableName="table";
		 MySqlHelper mySqlHelper = new MySqlHelper();
	        mySqlHelper.generateHTMLReport(tableName);
	         
	        OracleHelper oracleHelper = new OracleHelper();
	        oracleHelper.generatePDFReport(tableName);
	         
	        //generating MySql HTML report and Oracle PDF report using Facade
	        FacadeHelper.generateReport(FacadeHelper.DBTypes.MYSQL, FacadeHelper.ReportTypes.HTML, tableName);
	        FacadeHelper.generateReport(FacadeHelper.DBTypes.ORACLE, FacadeHelper.ReportTypes.PDF, tableName);
	        
	        /*
	         * 
	         * this will give you HTML report In MYSQL Table
				this will generate oracle PDF report  in ORACLE table
				this will give you HTML report In MYSQL Table
				this will generate oracle PDF report  in ORACLE table

	         */
	        
	}

}
