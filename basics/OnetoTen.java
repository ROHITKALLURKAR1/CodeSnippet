/* write a program to print 1 to 10 using infinity loop */

public class OneToTen {
    public static void main(String[] args) {
        int x=1;
        for( ; ; ){
                System.out.println(x);
                x++;
                if(x>10) break;
        }
    }
}

