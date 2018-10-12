package facadePattern;

import facadePattern.FacadeHelper.DBTypes;
import facadePattern.FacadeHelper.ReportTypes;

public class Client_Facade {

	public static void main(String[] args) {
		FacadeHelper facade = new FacadeHelper();
		facade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, "tableName");
		
		facade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, "tableName12");
	}

}
