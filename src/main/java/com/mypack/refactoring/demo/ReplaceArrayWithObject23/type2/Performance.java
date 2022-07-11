package com.mypack.refactoring.demo.ReplaceArrayWithObject23.type2;

public class Performance {
    //TODO  测试完之后，就可以把它设置成private的了
    private String[] data = new String[3];


    public String[] getData() {
        return data;
    }
    public String getName(){
        return data[0];
    }

    public void setData(String[] data) {
        this.data = data;
    }
    public void setName(String data) {
        this.data[0] = data;
    }
    public String getWins(){
        return data[1];
    }
    public void setWins(String data) {
        this.data[1] = data;
    }
}
