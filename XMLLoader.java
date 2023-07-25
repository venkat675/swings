package com.raven.form;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Venkat
 */
public class XMLLoader {

    public List<String> allXmls;

    public List<String> getAllXmls() {
        return allXmls;
    }

    public void setAllXmls(List<String> allXmls) {
        this.allXmls = allXmls;
    }

    public List<String> fetchAllXls(String path) {
        List<String> xmls = new ArrayList<>();
        File dir = new File(path);
        for (File file : dir.listFiles()) {
            if (file.getName().endsWith("xml") || file.getName().endsWith("XML")) {
                xmls.add(file.getName());
            }
        }
        return xmls;
    }
}
