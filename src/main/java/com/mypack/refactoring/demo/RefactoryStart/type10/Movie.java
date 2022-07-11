package com.mypack.refactoring.demo.RefactoryStart.type10;
public class Movie {
    public static final int CHILERENDS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    // TODO
    //为什么这里不要这个priceCode也行？因为Price这个类中定义的抽象方法就是返回一个int的值
    //这里的setter/getter方法都不是使用自动生成的了，就是为了消除switch函数，
    //书上说，即使是你的属性，也应该使用函数来调用，间接访问变量的方法是，子类可以覆写一个函数而
    //改变获取数据的途径，(就是setter/getter方法，直接改了里面的逻辑了)，还支持更灵活的数据管理方式
    //例如延迟初始化，就是懒加载
   // private int priceCode;

    private Price price;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getpriceCode();
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
    abstract class Price{
        abstract int getpriceCode();
    }
    class ChildrensPrice extends Price{

        @Override
        int getpriceCode() {
            return Movie.CHILERENDS;
        }
    }
    class NewReleasePrice extends Price{

        @Override
        int getpriceCode() {
            return Movie.NEW_RELEASE;
        }
    }

    class RegularPrice extends Price{

        @Override
        int getpriceCode() {
            return Movie.REGULAR;
        }
    }
}
