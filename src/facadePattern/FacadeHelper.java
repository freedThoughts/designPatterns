package facadePattern;

import java.sql.Connection;

public class FacadeHelper {
	
	public static enum DBTypes{
		MYSQL, ORACLE;
	}
	
	public static enum ReportTypes{
		PDF, HTML;
	}
	
	
	public void generateReport(DBTypes dbTypes, ReportTypes reportTypes, String tableName){
		
		Connection con = null;
		
		switch(dbTypes){
		case MYSQL : 
			con = MySqlHelper.getSqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			switch(reportTypes){
			case PDF :
				mySqlHelper.generateSqlPDFReport(con, tableName);
				break;
			case HTML :
				mySqlHelper.generateSqlHtmlReport(con, tableName);
				break;
			}
			break;
			
		case ORACLE :
			con = MyOracleDBHelper.getOracleConnection();
			MyOracleDBHelper oracle = new MyOracleDBHelper();
			switch(reportTypes){
			case PDF :
				oracle.generateOraclePDFReport(con, tableName);
				break;
			case HTML :
				oracle.generateOracleHTMLReport(con, tableName);
				break;
			}
			break;
		}
	}
	
	

}
