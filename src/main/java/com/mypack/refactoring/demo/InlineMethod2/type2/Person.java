package com.mypack.refactoring.demo.InlineMethod2.type2;

public class Person {
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    private Integer number;

    /**  虽然说这本书经常以简短的函数表现动作意图，会使得代码更加容易读
     *   但是你这俩函数明显都很好懂，如果你重构了之后可读性还是很好，那么，你就
     *   应该去了那个函数，间接性可能带来帮助，但是非必要的间接性总是让人不舒服
     *   不必非得像jdk源码那样，非得用上这技巧，我称之为炫技，哈哈哈啊哈哈
     */
    int getRating(){
        return number > 5 ? 2 : 1;
    }

}
