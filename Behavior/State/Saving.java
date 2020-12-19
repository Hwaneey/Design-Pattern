package State;

public class Saving implements PowerState{
    @Override
    public void PowerPush() {
        System.out.println("절전 모드 \n");
    }
}
