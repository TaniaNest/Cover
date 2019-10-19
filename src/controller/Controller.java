package controller;

import model.Cover;
import service.Service;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;

public class Controller {

    Instruction instruction = new Instruction();
    Input input= new Input();
    Info info=new Info();
    Validator validator=new Validator();
    Cover cover=new Cover();
    Service service=new Service();

    public void run() {
        runCover(cover.getA(),cover.getB(),cover.getC(),cover.getD());
        service.takenAction(cover);
        repeat();
    }

    public void runCover(float a, float b, float c, float d) {
        float number;
        float[] arr = new float[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(info.getInfo(i));
            while (arr[i] <= 0) {
                arr[i] = new Input().getNumber();
                if (!validator.isPositiveNumber(arr[i])) {
                    instruction.getInstruction();
                    arr[i] = input.getNumber();
                }
            }
        }
        cover.setA(arr[0]);
        cover.setB(arr[1]);
        cover.setC(arr[2]);
        cover.setD(arr[3]);
    }

    public void repeat(){
        String exit;
        System.out.print(info.getRequest());
        exit = input.getAnswer();
        if (exit.equals("y") || exit.equals("yes")){
            run();
        }
        else System.exit(0);
    }

}
