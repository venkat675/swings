package com.raven.model;

import javax.swing.Icon;

public class ModelCard {
    
    public ModelCard() {
    }

    private String title;
    private double values;
    private int percentage;
    private Icon icon;
    private String stringValue;
    private String description;
    
    public ModelCard(Icon icon, String title, String stringValue, String description) {
        this.icon = icon;
        this.title = title;
        this.stringValue = stringValue;
        this.description = description;
    }
    
    public ModelCard(String title, double values, int percentage, Icon icon) {
        this.title = title;
        this.values = values;
        this.percentage = percentage;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String title) {
        this.stringValue = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getValues() {
        return values;
    }

    public void setValues(double values) {
        this.values = values;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
