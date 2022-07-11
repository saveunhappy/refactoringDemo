package com.mypack.refactoring.demo.ExtraMethod1.type2;


public class Test01 {


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("阿彪");
        Movie movie = new Movie("喜羊羊", Movie.CHILERENDS);
        Rental rental = new Rental(movie,2);
        Movie movie2 = new Movie("赘婿", Movie.NEW_RELEASE);
        Rental rental2 = new Rental(movie2,5);
        Movie movie3 = new Movie("大明风华", Movie.REGULAR);
        Rental rental3 = new Rental(movie3,1);
        Movie movie4 = new Movie("老人与海", Movie.REGULAR);
        Rental rental4 = new Rental(movie4,6);
        customer.addRental(rental);
        customer.addRental(rental2);
        customer.addRental(rental3);
        customer.addRental(rental4);
        System.out.println(customer.statement());
    }
}
