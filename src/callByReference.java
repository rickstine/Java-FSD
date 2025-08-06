public class callByReference {
    int d = 20;

    public void functionDemo(callByReference test){
        test.d =test.d *2;

    }
    public static void main(String [] args){
        callByReference c1 = new callByReference();
        System.out.println("before calling the function:  " +c1.d);
        c1.functionDemo(c1);
        System.out.println("After calling the function:  " + c1.d);
    }
}
