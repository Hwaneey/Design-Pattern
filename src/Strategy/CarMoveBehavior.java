package Strategy;

import java.time.Clock;

public interface CarMoveBehavior {

    public void action();

    class UpBehavior implements CarMoveBehavior{
        @Override
        public void action() {
            System.out.printf("Up");
        }
    }

    class DownBehavior implements CarMoveBehavior{
        @Override
        public void action() {
            System.out.printf("Down");
        }
    }

    class LeftBehavior implements CarMoveBehavior{
        @Override
        public void action() {
            System.out.printf("Left");
        }
    }

    class RightBehavior implements CarMoveBehavior{
        @Override
        public void action() {
            System.out.printf("Right");
        }
    }
}
