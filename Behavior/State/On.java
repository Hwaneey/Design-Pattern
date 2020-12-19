package State;

public class On implements PowerState{
    @Override
    public void PowerPush() {
        System.out.println("전원 On \n");
    }
}

