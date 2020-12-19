package Strategy;

import java.time.Clock;

public interface CarMoveBehavior {

    public void action();

    class UpBehavior implements CarMoveBehavior{
        @Override
        public void action() {
            System.out.printf("Up \n");
        }
    }

    class DownBehavior implements CarMoveBehavior{
        @Override
        public void action() {
            System.out.printf("Down \n");
        }
    }

    class LeftBehavior implements CarMoveBehavior{
        @Override
        public void action() {
            System.out.printf("Left \n");
        }
    }

    class RightBehavior implements CarMoveBehavior{
        @Override
        public void action() {
            System.out.printf("Right \n");
        }
    }
}
