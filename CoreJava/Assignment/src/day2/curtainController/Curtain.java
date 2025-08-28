package day2.curtainController;

public class Curtain {

    private boolean isOpen;

    public Curtain() {
        this.isOpen = false;
    }

    public void isOpen() {
        if(isOpen) {
            System.out.println("Curtain is Open");
        }
        else{
            System.out.println("curtain is Closed");
        }
    }

    public void setState(boolean open) {
        isOpen = open;
    }

    public boolean getState(){
        return isOpen;
    }
}
