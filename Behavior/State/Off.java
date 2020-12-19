package State;

public class Off implements PowerState{
    @Override
    public void PowerPush() {
        System.out.println("전원 Off \n");
    }
}
