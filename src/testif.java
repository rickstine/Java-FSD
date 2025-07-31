public class testif {
    public static void main (String [] args){
        int balance = 10000;
        boolean withdraw;

        if(balance > 0)
            withdraw = true;
        else
            withdraw = false;
        System.out.println("can i withdraw : " + withdraw);
    }
}
