package controller;

import model.Cover;
import service.Service;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;

public class Controller {

    private Instruction instruction = new Instruction();
    private Input input = new Input();
    private Info info = new Info();
    private Validator validator = new Validator();
    private Service service = new Service();


    public void run() {
        compare();
        repeat();
    }

    public Cover createCover() {
        return new Cover(createSide(), createSide());
    }

    public float createSide() {
        boolean flag = false;
        info.getInfo();
        float side = input.getNumber();
        while (!validator.isPositiveNumber(side)) {
            instruction.getInstruction();
            side = new Input().getNumber();
        }

        return side;
    }

    public void compare() {
        Cover coverOne = createCover();
        Cover coverTwo = createCover();
        if (service.takenAction(coverOne, coverTwo)) {
            info.getAnswerYes();
        } else {
            info.getAnswerNo();
        }
    }

    public void repeat() {
        String exit;
        info.getRequest();
        exit = input.getAnswer();
        if (exit.equals("y") || exit.equals("yes")) {
            run();
        } else System.exit(0);
    }

}
