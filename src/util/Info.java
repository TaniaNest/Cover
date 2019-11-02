package util;

public class Info {

    public void getAnswerYes() {
        System.out.println("Yes");
    }

    public void getAnswerNo() {
        System.out.println("No");
    }

    public void getInfo(String name) {
        System.out.print("Input the size of " + name + " cover: ");
    }

    public void getQuestion() {
        System.out.println("Can I put one cover in another?");
    }

    public void getRequest() {
        System.out.print("Do you want to exit or continue: ");
    }
}
