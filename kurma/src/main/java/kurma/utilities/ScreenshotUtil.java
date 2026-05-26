package kurma.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver)
            throws IOException {

        // Create screenshots folder
        File folder = new File("screenshots");
        folder.mkdirs();

        // Generate timestamp
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern(
                        "yyyyMMdd_HHmmss"));

        // Screenshot file
        File src = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        // Dynamic filename
        File dest = new File(
                "screenshots/Screenshot_" +
                        timestamp + ".png");

        FileUtils.copyFile(src, dest);

        System.out.println(
                "Screenshot saved successfully: "
                        + dest.getName());
    }
}