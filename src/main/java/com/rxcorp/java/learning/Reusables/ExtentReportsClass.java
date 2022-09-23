package com.rxcorp.java.learning.Reusables;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsClass {
    public ExtentReports reportMethod(ExtentReports extent) {
        ExtentHtmlReporter hmtlpReport = new ExtentHtmlReporter("C:\\D Drive\\Vinod\\JavaTesting\\JavaProject\\reports\\QA_Report.html");
        extent = new ExtentReports();
        extent.attachReporter(hmtlpReport);
        return extent;
    }

    public ExtentTest logInfo(ExtentTest test, ExtentReports extent, String status, String testNm, String testDesc, String logMsg) {
        test = extent.createTest(testNm);
        switch (status) {
            case "info":
                test.log(Status.INFO, logMsg);
                break;

            case "fail":
                test.log(Status.INFO, logMsg);
                break;
            case "pass":
                test.log(Status.INFO, logMsg);
                break;

        }
        return test;
    }
}
