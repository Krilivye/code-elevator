package elevator.server.security;

import static java.lang.Math.random;

public class RandomPassword implements Password {

    private final String password;

    public RandomPassword() {
        this.password = generate();
    }

    private String generate() {
        final String chars = "" +
                "0123456789" +
                "abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "_-";

        final StringBuilder password = new StringBuilder(16);

        for (Integer i = 0; i < 16; i++) {
            password.append(chars.charAt(new Double(random() * chars.length()).intValue()));
        }

        return password.toString();
    }

    @Override
    public String value() {
        return password;
    }

}
