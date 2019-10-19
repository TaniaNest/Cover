package service;

import controller.Controller;
import model.Cover;

public class Service {

    public void takenAction(Cover cover){

        float a=cover.getA();
        float b=cover.getB();
        float c=cover.getC();
        float d=cover.getD();
        double diag1= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double diag2=Math.sqrt(Math.pow(c,2)+Math.pow(d,2));
        double gip1=2*Math.sqrt(Math.pow((diag1-c)/2,2)+Math.pow(d/2,2));
        double gip2=2*Math.sqrt(Math.pow((diag1-d)/2,2)+Math.pow(c/2,2));

        if (a > c && b > d) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(a,2)+Math.pow((b-gip1),2)))System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(a,2)+Math.pow((b-gip2),2))) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(b,2)+Math.pow((a-gip1),2))) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(b,2)+Math.pow((a-gip2),2))) System.out.println(" Yes");
        else if (a > d && b > c) System.out.println(" Yes");
        else if (a< d && b < c) System.out.println(" Yes");
        else if (a < c && b < d) System.out.println(" Yes");
        else System.out.println(" No");

    }
}
