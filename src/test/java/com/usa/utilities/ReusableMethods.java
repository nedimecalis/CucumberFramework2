package com.usa.utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReusableMethods {

        public static void sleep(int miliseconds){
            try {
                Thread.sleep(miliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public static List<WebElement> getOptions(WebElement dropDown){
            Select select = new Select(dropDown);
            return select.getOptions();
        }
        public static void selectByIndex(WebElement dropDown, int index){
            Select select = new Select(dropDown);
            select.selectByIndex(index);
        }

        public static String getScreenshot(String name) throws IOException {
            String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File source = ts.getScreenshotAs(OutputType.FILE);
            String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
            File finalDestination = new File(target);
            FileUtils.copyFile(source, finalDestination);
            return target;
        }

    }
