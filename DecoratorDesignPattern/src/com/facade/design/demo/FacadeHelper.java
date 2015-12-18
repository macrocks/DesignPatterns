package com.facade.design.demo;

public class FacadeHelper {
	 public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
	        switch (dbType){
	        case MYSQL: 
	            MySqlHelper mySqlHelper = new MySqlHelper();
	            switch(reportType){
	            case HTML:
	                mySqlHelper.generateHTMLReport(tableName);
	                break;
	            case PDF:
	                mySqlHelper.generatePDFReport(tableName);
	                break;
	            }
	            break;
	        case ORACLE: 
	            OracleHelper oracleHelper = new OracleHelper();
	            switch(reportType){
	            case HTML:
	                oracleHelper.generateHTMLReport(tableName);
	                break;
	            case PDF:
	                oracleHelper.generatePDFReport(tableName);
	                break;
	            }
	            break;
	        }
	         
	    }
	     
	    public static enum DBTypes{
	        MYSQL,ORACLE;
	    }
	     
	    public static enum ReportTypes{
	        HTML,PDF;
	    }
}
