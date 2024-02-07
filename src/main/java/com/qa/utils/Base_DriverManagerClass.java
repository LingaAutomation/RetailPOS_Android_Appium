//package com.qa.utils;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import com.relevantcodes.extentreports.ExtentTest;
//
//public class Base_DriverManagerClass
//{
//
//    private static Base_DriverManagerClass helperClass;
//
//    private static AndroidDriver driver;
//    private static ExtentTest test;
//    public final static int TIMEOUT = 10;
//
//     private Base_DriverManagerClass() {
//
//
//
//
//     }
//
//    public static void openPage(String url) {
//        driver.get(url);
//    }
//
//    public static AndroidDriver getDriver() {
//        return driver;
//
//    }
//
//    public static ExtentTest getTest() {
//        return test;
//
//    }
//
//    public static void setUpDriver() {
//
//        if (helperClass==null) {
//
//            helperClass = new Base_DriverManagerClass();
//        }
//    }
//
//     public static void tearDown() {
//
//         if(driver!=null) {
//             driver.close();
//             driver.quit();
//         }
//
//         helperClass = null;
//
//     }
//
//}