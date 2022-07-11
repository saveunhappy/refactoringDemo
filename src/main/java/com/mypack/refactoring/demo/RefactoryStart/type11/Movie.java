package com.mypack.refactoring.demo.RefactoryStart.type11;

public class Movie {
    public static final int CHILERENDS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    //为什么这里不要这个priceCode也行？因为Price这个类中定义的抽象方法就是返回一个int的值
    //这里的setter/getter方法都不是使用自动生成的了，就是为了消除switch函数，
    // TODO 这操作有点骚！！,一时有点反应不过来
    //书上说，即使是你的属性，也应该使用函数来调用，间接访问变量的方法是，子类可以覆写一个函数而
    //改变获取数据的途径，(就是setter/getter方法，直接改了里面的逻辑了)，还支持更灵活的数据管理方式
    //例如延迟初始化，就是懒加载,
   // private int priceCode;

    private Price price;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        //this.priceCode = priceCode;
        switch (arg){
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILERENDS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public Movie(String title, int priceCode) {
        this.title = title;
      //  this.priceCode = priceCode;
        setPriceCode(priceCode);
    }
    public double getCharge(int daysRented){
        return price.getCharge(daysRented);
    }
    int getFrequentRenterPoints(int daysRented){
        if(getPriceCode() == Movie.NEW_RELEASE &&  daysRented > 1) {
            return 2;
        }else {
            return 1;
        }
    }
    abstract class Price{
        abstract int getPriceCode();
        abstract double getCharge(int daysRented);
    }
    class RegularPrice extends Price{
        double getCharge(int daysRented){
            double result = 2;
            if(daysRented > 2) result += (daysRented - 2) * 1.5;
            return result;

        }
        @Override
        int getPriceCode() {
            return Movie.REGULAR;
        }
    }
    class ChildrensPrice extends Price{
        double getCharge(int daysRented){
            double result = 1.5;
            if (daysRented > 3){
               result += (daysRented - 3) - 1.5;
            }
            return result;
        }
        @Override
        int getPriceCode() {
            return Movie.CHILERENDS;
        }
    }
    class NewReleasePrice extends Price{
        double getCharge(int daysRented){
            return daysRented * 3;
        }
        @Override
        int getPriceCode() {
            return Movie.NEW_RELEASE;
        }
    }



}
