package elevator.engine.scan;

import org.junit.Test;

import static elevator.engine.scan.ElevatorDirection.UP;

public class CommandTest {

    @Test(expected = NullPointerException.class)
    public void should_not_create_command_without_floor() throws Exception {
        new Command(null, UP);
    }

    @Test(expected = NullPointerException.class)
    public void should_not_create_command_without_direction() throws Exception {
        new Command(3, null);
    }

}
