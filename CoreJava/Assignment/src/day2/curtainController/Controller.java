package day2.curtainController;

public class Controller {
    public static void main(String[] args) {

        Curtain c1 = new Curtain();

        Remote remote = new Remote();

        c1.isOpen();
        remote.pressButton(c1);
        c1.isOpen();
        remote.pressButton(c1);
        c1.isOpen();





    }
}
