package com.mypack.refactoring.demo.RefactoryStart.type4;


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
    // TODO  注意，这里把参数去掉了，看看原来的，这就是这个类里面的属性，根本不需要传了。
    public double getCharge(){
        /**
         * 任何一个傻瓜都能写出计算机可以理解的代码，唯有写出人类容易理解的代码，
         * 才是优秀的程序员
         */
        // TODO
        double result = 0;
        switch (getMovie().getPriceCode()){
            case Movie.REGULAR:
                result +=2;
                if(getDayRented() > 2){
                    result += (getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDayRented() * 3;
                break;
            case Movie.CHILERENDS:
                result += 1.5;
                if (getDayRented() > 3){
                    result += (getDayRented() - 3) - 1.5;
                }
                break;
        }
        return result;
    }

}
