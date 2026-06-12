package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtils {

	public static void captureScreenshot(WebDriver driver, String fileName) throws IOException {

		File folder = new File(System.getProperty("user.dir") + "/reports/" + ReportManager.runFolder);

		folder.mkdirs();

		String timestamp = new SimpleDateFormat("HHmmss_SSS").format(new Date());

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File(folder.getAbsolutePath() + "/" + fileName + "_" + timestamp + ".png");

		FileUtils.copyFile(src, dest);

		System.out.println("Screenshot Saved: " + dest.getAbsolutePath());
	}
}