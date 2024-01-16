package com.joincoded.currencies.data;


public class Dataclass {
    private String currencyName;
    private String currencyCode;
    private Double exchangeRate;

 public Dataclass (String currencyName, String currencyCode, Double exchangeRate){
     this.currencyName=currencyName;
     this.currencyCode=currencyCode;
     this.exchangeRate=exchangeRate;

 }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
