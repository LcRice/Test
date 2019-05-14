package cn.Test01;

public class User {

    /**
     * 客户ID
     */
     private int userid = 1;


    public static void main(String[] args){
        System.out.println("Hello,User!!");
        //这是单行注释
       String[] str = new String[]{"Tom","Lily"};
        for (int i = 0; i < str.length; i++) {
            System.out.println("str" + i + "=" +str[i]);
        }

    }

    public void method(){
        String i = "Hello,World!";

    }
}
