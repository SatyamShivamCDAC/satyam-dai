package day2.curtainController;

public class Remote {

    public void pressButton(Curtain c){
        c.setState(!c.getState());
    }


}
