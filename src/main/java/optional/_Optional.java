package optional;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {

        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("Email sent"), () -> {
            System.out.println("Email can not be sent");
        });
    }

}
