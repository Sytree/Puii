package com.puii.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table pastyearplan.
 */
public class PastYearPlanBean {

    private String id;
    private String content;
    private String complete_date;

    public PastYearPlanBean() {
    }

    public PastYearPlanBean(String id) {
        this.id = id;
    }

    public PastYearPlanBean(String id, String content, String complete_date) {
        this.id = id;
        this.content = content;
        this.complete_date = complete_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComplete_date() {
        return complete_date;
    }

    public void setComplete_date(String complete_date) {
        this.complete_date = complete_date;
    }

}
