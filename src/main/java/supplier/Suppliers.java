package supplier;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {

        String url = getConnectionUrl.get();
        System.out.println(url);
    }

    static Supplier<String> getConnectionUrl = () -> "locahost/33033";
}
