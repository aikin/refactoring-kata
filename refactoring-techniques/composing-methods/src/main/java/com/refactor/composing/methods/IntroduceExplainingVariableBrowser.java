package com.refactor.composing.methods;

public class IntroduceExplainingVariableBrowser {
    public boolean isResizableIEInMac(String platform, String browser, int resize) {
        return platform.indexOf("MAC") > -1 && browser.indexOf("IE") > -1 && resize > 0;
    }
}
