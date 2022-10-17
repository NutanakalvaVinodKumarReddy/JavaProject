package com.rxcorp.java.learning.utils;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
https://www.youtube.com/watch?v=ipjl49Hgsg8&ab_channel=SDET-QAAutomation
 */

import java.io.FileInputStream;
import java.io.IOException;


public class ExcelUtils {

    public static void main(String[] args) throws IOException {

        String srcFile = "C:\\D Drive\\Vinod\\JavaTesting\\JavaProject\\src\\main\\java\\com\\rxcorp\\java\\learning\\data\\TestData.xlsx";
        FileInputStream inputStream = new FileInputStream(srcFile);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int noOfRows = sheet.getLastRowNum();
        System.out.println("No of Rows in  test data: " + noOfRows);
        int noOfCols = sheet.getRow(0).getLastCellNum();
        System.out.println("No of Cols in  test data: " + noOfCols);

        for (int r = 0; r < noOfRows; r++) {
            XSSFRow row = sheet.getRow(r);
            System.out.println("printing row :" + r + " values");
            for (int c = 0; c < noOfCols; c++) {
                XSSFCell cell= row.getCell(c);
                switch (cell.getCellType()){
                    case STRING :System.out.println(cell.getStringCellValue());
                    case NUMERIC:System.out.println(cell.getStringCellValue());
                }

            }

        }

    }

}
