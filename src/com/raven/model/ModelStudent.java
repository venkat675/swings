package com.raven.model;

import com.raven.swing.table.EventAction;
import com.raven.swing.table.ModelAction;

public class ModelStudent {   
    private String appId;
    private String testExeName;
    private String time;
    private String environment;
    private String status;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTestExeName() {
        return testExeName;
    }

    public void setTestExeName(String testExeName) {
        this.testExeName = testExeName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public ModelStudent(String appId, String testExeName, String time, String environment, String status) {        
        this.appId = appId;
        this.testExeName = testExeName;
        this.time = time;
        this.environment = environment;
        this.status = status;
    }

    public ModelStudent() {
    }

    public Object[] toRowTable(EventAction event) {       
        return new Object[]{appId, testExeName, time, environment, status, new ModelAction(this, event)};
    }
}
