package Reusables;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reusable {

    public void extentReports() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\D Drive\\Vinod\\JavaTesting\\JavaProject\\reports\\QA_Report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

}
