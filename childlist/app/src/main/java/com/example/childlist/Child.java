package com.example.childlist;

public class Child {
    private String name;
    private String sex;
    private String age;
    private String anemiaStatus;
    private String malnutritionStatus;
    private String nextCredVisitDate;
    private String homeVisitDue;

    public Child(String name, String sex, String age, String anemiaStatus, String malnutritionStstus, String nextCredVisitDate, String homeVisitDue) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.anemiaStatus = anemiaStatus;
        this.malnutritionStatus = malnutritionStstus;
        this.nextCredVisitDate = nextCredVisitDate;
        this.homeVisitDue = homeVisitDue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public String getAnemiaStatus() {
        return anemiaStatus;
    }

    public String getMalnutritionStatus() {
        return malnutritionStatus;
    }

    public String getNextCredVisitDate() {
        return nextCredVisitDate;
    }

    public String getHomeVisitDue() {
        return homeVisitDue;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAnemiaStatus(String anemiaStatus) {
        this.anemiaStatus = anemiaStatus;
    }

    public void setMalnutritionStatus(String malnutritionStstus) {
        this.malnutritionStatus = malnutritionStstus;
    }

    public void setNextCredVisitDate(String nextCredVisitDate) {
        this.nextCredVisitDate = nextCredVisitDate;
    }

    public void setHomeVisitDue(String homeVisitDue) {
        this.homeVisitDue = homeVisitDue;
    }
}
