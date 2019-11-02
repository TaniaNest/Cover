package controller;

import model.CoverModel;
import service.CoverService;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;

public class CoverController {

    private Instruction instruction = new Instruction();
    private Input input = new Input();
    private Info info = new Info();
    private Validator validator = new Validator();
    private CoverService coverService = new CoverService();


    public void run() {
        compare();
        repeat();
    }

    public CoverModel createCover(String name) {
        return new CoverModel(createSide(name), createSide(name));
    }

    public float createSide(String name) {
        info.getInfo(name);
        float side = new Input().getNumber();
        while (!validator.isValidNumber(side)) {
            instruction.getInstruction();
            side = new Input().getNumber();
        }
        return side;
    }

    public void compare() {
        CoverModel coverOne = createCover("first");
        CoverModel coverTwo = createCover("second");
        info.getQuestion();
        if (coverService.takenAction(coverOne, coverTwo)) {
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
