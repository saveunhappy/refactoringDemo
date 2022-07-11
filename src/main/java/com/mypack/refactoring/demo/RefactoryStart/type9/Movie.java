package com.mypack.refactoring.demo.RefactoryStart.type9;
public class Movie {
    public static final int CHILERENDS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    // TODO 注意，这里把租期长度给传入了
    public double getCharge(int daysRented){
        // TODO
        double result = 0;
        switch (getPriceCode()){
            case Movie.REGULAR:
                result +=2;
                if(daysRented > 2){
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILERENDS:
                result += 1.5;
                if (daysRented > 3){
                    result += (daysRented - 3) - 1.5;
                }
                break;
        }
        return result;
    }
    //TODO 从Rental搬运到了这里,也加了参数
    int getFrequentRenterPoints(int daysRented){
        if(getPriceCode() == Movie.NEW_RELEASE &&  daysRented > 1) {
            return 2;
        }else {
            return 1;
        }
    }
}
