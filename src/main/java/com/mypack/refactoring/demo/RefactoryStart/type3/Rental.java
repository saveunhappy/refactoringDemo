package com.mypack.refactoring.demo.RefactoryStart.type3;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }
    //记住，这里应该返回double，可能因为平时都是用的int，小错误，
    //重构技术就是以微小的步伐修改程序，如果你犯下错误，很容易便可发现它
    //这里应该也改个名字，像JDK里面的方法看齐！
    public double getCharge(Rental aRental){
        double result = 0;
        switch (aRental.getMovie().getPriceCode()){
            case Movie.REGULAR:
                result +=2;
                if(aRental.getDayRented() > 2){
                    result += (aRental.getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += aRental.getDayRented() * 3;
                break;
            case Movie.CHILERENDS:
                result += 1.5;
                if (aRental.getDayRented() > 3){
                    result += (aRental.getDayRented() - 3) - 1.5;
                }
                break;
        }
        return result;
    }

}
