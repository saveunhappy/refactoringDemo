package com.mypack.refactoring.demo.RefactoryStart.type12;
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
    //重构技术就是以微小的步伐修改程序，如果你犯下错误，很容易便可发现它
    //这里应该也改个名字，像JDK里面的方法看齐！
    // TODO  注意，这里把参数去掉了，看看原来的，这就是这个类里面的属性，根本不需要传了。
    // 现在又多了一点，还要调用getMovie()方法，最好不要在另一个对象的属性上运用switch语句，
    // 如果不得不使用，也应该在对象自己的数据上使用，而不是在别人的数据上使用
    double getCharge(){
        return movie.getCharge(dayRented);
    }

    int getFrequentRenterPoints(){
        return movie.getFrequentRenterPoints(dayRented);
    }

}
