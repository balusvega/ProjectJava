package com.modules;

import com.domain.URLFormatObject;
import com.exceptions.InvalidURLFormatException;

public class URLParser {

    URLFormatObject urlContent = new URLFormatObject();

    public String parseURL(String url) throws InvalidURLFormatException {

        String result = "INVALID URL Format";
        String[] urlSplits = url.split("/");
        System.out.println(urlSplits.length);
        if (urlSplits.length == 1) {
            result = "INVALID URL Format";
        }
        else if ((!urlSplits[0].contains("http:")) && (!urlSplits[1].isEmpty())) {
            result = "INVALID URL Format";
        } else if (urlSplits.length < 3) {
            result = "INVALID URL Format";
        } else if ((urlSplits[0].contains("http:")) && (urlSplits[1].isEmpty())) {
            //domainCapture = urlSplits[2].split(".");
            //System.out.println(domainCapture[0]+domainCapture[1]+domainCapture[2]);
            //if (domainCapture[0].equalsIgnoreCase("www")) {
            if (urlSplits[2].substring(0,3).equalsIgnoreCase("www")) {
                urlContent.setProtocol(urlSplits[0]);
                urlContent.setDomainName(urlSplits[2]);
                //System.out.println(urlSplits.length);
                if(urlSplits.length >= 4) {
                    urlContent.setPath(urlSplits[3]);
                    String fullPath = urlSplits[3];
                    for (int counter = 4; counter <= (urlSplits.length-1); counter++) {
                        fullPath = fullPath.concat("/").concat(urlSplits[counter]);
                        urlContent.setPath(fullPath);
                    }
                }
                result = urlContent.toString();
                urlContent.setDomainName(null);
                urlContent.setPath(null);
            } else if (urlSplits[2].contains(":")) {
                String portCapture = urlSplits[2].substring((urlSplits[2].indexOf(":") + 1), urlSplits[2].length());
                String ipAddress = urlSplits[2].substring(0, urlSplits[2].indexOf(":"));
                urlContent.setProtocol(urlSplits[0]);
                urlContent.setIpAddress(ipAddress);
                urlContent.setPort(portCapture);
                if(urlSplits.length >= 4) {
                    urlContent.setPath(urlSplits[3]);
                    String fullPath = urlSplits[3];
                    for (int counter = 4; counter <= (urlSplits.length-1); counter++) {
                        fullPath = fullPath.concat("/").concat(urlSplits[counter]);
                        urlContent.setPath(fullPath);
                    }
                }
                result = urlContent.toString();
                urlContent.setIpAddress(null);
                urlContent.setPath(null);
                urlContent.setPort(null);
            }
        }
        else
            throw new InvalidURLFormatException();
            return result;
    }
}
