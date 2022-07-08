package models;

public class JavaClass {

    private int myInt = 0;
//    private string myString = "Hello World";

    public JavaClass() {

    }

    public int getMyInt() {
        return myInt;
    }

    public void  setMyInt(int arg){
        this.myInt = myInt;
    }

    @Override
    public String toString() {
        return "JavaClass{" +
                "myInt=" + myInt +
                '}';
    }
}
