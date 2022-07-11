package com.mypack.refactoring.demo.ReplaceArrayWithObject23.type3;

public class Performance {
    //TODO  然后，它就可以光荣的下岗了
  //  private String[] data = new String[3];
    private String name;
    private String wins;

//    public String[] getData() {
//        return data;
//    }
    public String getName(){
        return name;
    }

//    public void setData(String[] data) {
//        this.data = data;
//    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWins(){
        return wins;
    }
    public void setWins(String wins) {
        this.wins = wins;
    }
}
