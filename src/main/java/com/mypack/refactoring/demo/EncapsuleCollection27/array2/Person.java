package com.mypack.refactoring.demo.EncapsuleCollection27.array2;

public class Person {
    private String[] skills;
    //TODO 修改取值函数，令它返回一份数组副本
    public String[] getSkills() {
        String[] result = new String[skills.length];
        System.arraycopy(skills,0,result,0,skills.length);
        return result;
    }

//    public void setSkills(String[] skills) {
//        this.skills = skills;
//    }
    //同样的，首先要提供一个修改函数，由于用户有可能修改数组中某一特定位置上的值。
    void setSkill(int index,String newSkill){
        skills[index] = newSkill;
    }
    //如果需要对整个数组赋值
    void setSkills(String[] arg){
        skills = new String[arg.length];
        for (int i = 0; i < skills.length; i++) {
            setSkill(i,arg[i]);
        }
    }
    //如果需要处理从数组中移除元素，就会有些困难，如果作为参数传入的数组和原数组长度不同，情况
    //也会比较复杂，这就是优先选择集合的原因之一。
    public static void main(String[] args) {
        Person kent = new Person();
        kent.getSkills()[1] = "Refactoring";
        //改为
        kent.setSkill(1,"Refactoring");
        
    }
}
