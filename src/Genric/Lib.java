package Genric;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Lib extends BaseTest {

	public static String getPropertyValue(String propertyName) {
		String propertyValue = "";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(CONFIGFILE_PATH));
			propertyValue = prop.getProperty(propertyName);
		} catch (Exception e) {
		}
		return propertyValue;
	}

	public static Workbook wb;

	public static String getCellValue(String sheetName, int rowNo, int colmnNo) {

		String cellValue = "";
		try {
			wb = WorkbookFactory.create(new FileInputStream(INPUTDATA_PATH));
			cellValue = wb.getSheet(sheetName).getRow(rowNo).getCell(colmnNo).toString();
		} catch (Exception e) {
		}
		return cellValue;
	}

	public static int getRowCount(String sheetName) {
		int rowCount=0;
		try {
			wb= WorkbookFactory.create(new FileInputStream(INPUTDATA_PATH));
			rowCount = wb.getSheet(sheetName).getLastRowNum();
		} catch (Exception e) {
			
		} 
		
		return rowCount;
	}

	public static void captureScreenshot(WebDriver driver, String testMethodName) {

		try {
			
			Date date = new Date();
			String currentDate = date.toString().replaceAll(":", "_");
			TakesScreenshot sh = (TakesScreenshot) driver;
			File srcFile = sh.getScreenshotAs(OutputType.FILE);
			File destFile = new File(SCREENSHOT_PATH+testMethodName+"__"+currentDate+".png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
		}
	}
	
	
	
	
	

}
