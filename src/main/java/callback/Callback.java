package callback;

import java.util.function.Consumer;

public class Callback {

    public static void main(String[] args) {

        hello("Sikiru", null, result -> {
            System.out.println("No lastname provided for "+ result);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        if(lastName != null) {
            System.out.println(firstName);
        } else {
            callback.accept(firstName);
        }
    }
}
