package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportManager {

	public static String runFolder = "Run_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
}