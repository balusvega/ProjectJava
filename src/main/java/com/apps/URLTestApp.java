package com.apps;

import com.exceptions.InvalidURLFormatException;
import com.modules.URLParser;

public class URLTestApp {

    public static void main(String[] args) {

        URLParser aURLParser = new URLParser();
        //URLFormatObject

        String result;

        // TC:1 - Validate if URL format is correct with a domain name

        result = URLTestApp.testURLFormat(aURLParser, "http://www.testdomain.com/testpath");

        if(result.equals("INVALID URL Format"))
            System.out.println("Test Case of valid URL domain name is FAILED  "+result);
        else
            System.out.println("Test Case of valid URL domain name is PASSED  "+result);


        // TC:2 - Validate if URL format is correct with an IP Address
        result = URLTestApp.testURLFormat(aURLParser, "http://24.106.206.2:10080/autotools");

        if(result.equals("INVALID URL Format"))
            System.out.println("Test Case of valid URL with IP Address is FAILED  "+result);
        else
            System.out.println("Test Case of valid URL with IP Address is PASSED  "+result);

        // TC:3 - Validate if URL format is correct with a domain name and extended path
        result = URLTestApp.testURLFormat(aURLParser, "http://www.testdomain.com/testpath1/testpath2/testpath3");

        if(result.equals("INVALID URL Format"))
            System.out.println("Test Case of valid URL domain name is FAILED  "+result);
        else
            System.out.println("Test Case of valid URL domain name is PASSED  "+result);

        // TC:4 - Validate if URL format is correct with a domain name and no path
        result = URLTestApp.testURLFormat(aURLParser, "http://www.testdomain.com");

        if(result.equals("INVALID URL Format"))
            System.out.println("Test Case of valid URL domain name is FAILED  "+result);
        else
            System.out.println("Test Case of valid URL domain name is PASSED  "+result);

        // TC:5 - Validate if URL format is incorrect
        result = URLTestApp.testURLFormat(aURLParser, "http://ww.testdomain.com/");

        if(result.equals("INVALID URL Format"))
            System.out.println("Test Case of invalid URL domain name is PASSED  "+result);
        else
            System.out.println("Test Case of invalid URL domain name is FAILED  "+result);

        // TC:6 - Validate if URL format is incorrect
        result = URLTestApp.testURLFormat(aURLParser, "http:www.//testdomain.com/");

        if(result.equals("INVALID URL Format"))
            System.out.println("Test Case of invalid URL domain name is PASSED  "+result);
        else
            System.out.println("Test Case of invalid URL domain name is FAILED  "+result);

        // TC:7 - Validate if URL format is incorrect
        result = URLTestApp.testURLFormat(aURLParser, "www.testdomain.com");

        if(result.equals("INVALID URL Format"))
            System.out.println("Test Case of invalid URL domain name is PASSED  "+result);
        else
            System.out.println("Test Case of invalid URL domain name is FAILED  "+result);

    }

    private static  String testURLFormat(URLParser aURLParser, String URLInput){
        String result;
        try {
            result = aURLParser.parseURL(URLInput);

        } catch (InvalidURLFormatException exp) {
            result = "INVALID URL Format";
        }
        return result;
    }
}
