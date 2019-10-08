import java.util.Scanner;

public class Cover {
    public static void main(String[] args) {
        Cover act=new Cover();
        act.Action();
    }

    private void Action(){
    Scanner w = new Scanner(System.in);
    float a,b,c,d;
        float[] arr = new float[4];
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] <= 0) {
                System.out.print("Input positive number: ");

                while (!w.hasNextFloat()) {
                    System.out.println("Incorrect value. Input value more than 0 ");
                    w.next();
                    System.out.print("Input the number: ");
                }

                arr[i] = w.nextFloat();

            }
        }
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];

        double diag1= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double diag2=Math.sqrt(Math.pow(c,2)+Math.pow(d,2));


        if (a > c && b > d) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(a,2)+Math.pow(b-2*Math.sqrt(Math.pow((diag1-c)/2,2)+Math.pow(d/2,2)),2))) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(a,2)+Math.pow(b-2*Math.sqrt(Math.pow((diag1-d)/2,2)+Math.pow(c/2,2)),2))) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(b,2)+Math.pow(a-2*Math.sqrt(Math.pow((diag1-c)/2,2)+Math.pow(d/2,2)),2))) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(b,2)+Math.pow(a-2*Math.sqrt(Math.pow((diag1-d)/2,2)+Math.pow(c/2,2)),2))) System.out.println(" Yes");
        else if (a > d && b > c) System.out.println(" Yes");
        else if (a < d && b < c) System.out.println(" Yes");
        else if (a < c && b < d) System.out.println(" Yes");
        else System.out.println(" No");
        repeat();
    }
    private void repeat(){

        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to exit or continue: ");
        String exit = in.next();
        if (exit.equals("y") || exit.equals("yes")){
            Action();
        }
        else System.exit(0);
    }

}


