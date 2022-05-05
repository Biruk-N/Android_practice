package com.example.file_read;

public class temp {
    private String month;
    private Double temp;

    public static void add(com.example.file_read.temp sample) {
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "temp{" +
                "month='" + month + '\'' +
                ", temp=" + temp +
                '}';
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
