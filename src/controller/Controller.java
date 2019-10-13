package controller;

import model.Cover;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;

public class Controller {

    private Instruction instruction;
    private Input input;
    private Info info;
    private Validator validator;

    Cover cover=new Cover();

    public void run(float a, float b, float c, float d) {
        float number;
        float[] arr = new float[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(new Info().getInfo(i));
            while (arr[i] <= 0) {
                arr[i] = new Input().getNumber();
            while (!new Validator().isPositiveNumber(arr[i])) {
                instruction.getInstruction();
                arr[i] = new Input().getNumber();
            }

            }
        }
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];
        cover.setA(a);
        cover.setB(b);
        cover.setC(c);
        cover.setD(d);
    }

    public void repeat(){
        String exit;
        System.out.print(new Info().getRequest());
        exit = new Input().getAnswer();
        if (exit.equals("y") || exit.equals("yes")){
            takenAction();
        }
        else System.exit(0);
    }

    public void takenAction(){
        run(cover.getA(),cover.getB(),cover.getC(),cover.getD());
        double diag1= Math.sqrt(Math.pow(cover.getA(),2)+Math.pow(cover.getB(),2));
        double diag2=Math.sqrt(Math.pow(cover.getC(),2)+Math.pow(cover.getD(),2));

        if (cover.getA() > cover.getC() && cover.getB() > cover.getD()) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(cover.getA(),2)+Math.pow(cover.getB()-2*Math.sqrt(Math.pow((diag1-cover.getC())/2,2)+Math.pow(cover.getD()/2,2)),2))) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(cover.getA(),2)+Math.pow(cover.getB()-2*Math.sqrt(Math.pow((diag1-cover.getD())/2,2)+Math.pow(cover.getC()/2,2)),2))) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(cover.getB(),2)+Math.pow(cover.getA()-2*Math.sqrt(Math.pow((diag1-cover.getC())/2,2)+Math.pow(cover.getD()/2,2)),2))) System.out.println(" Yes");
        else if(diag2==Math.sqrt(Math.pow(cover.getB(),2)+Math.pow(cover.getA()-2*Math.sqrt(Math.pow((diag1-cover.getD())/2,2)+Math.pow(cover.getC()/2,2)),2))) System.out.println(" Yes");
        else if (cover.getA() > cover.getD() && cover.getB() > cover.getC()) System.out.println(" Yes");
        else if (cover.getA()< cover.getD() && cover.getB() < cover.getC()) System.out.println(" Yes");
        else if (cover.getA() < cover.getC() && cover.getB() < cover.getD()) System.out.println(" Yes");
        else System.out.println(" No");
        repeat();
    }
}
