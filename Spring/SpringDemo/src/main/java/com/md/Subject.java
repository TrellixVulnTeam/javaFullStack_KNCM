package com.md;

public class Subject {

    private int subId;
    private String subject;


    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId=" + subId +
                ", subject='" + subject + '\'' +
                '}';
    }
}
