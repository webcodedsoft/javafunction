package predicates;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        System.out.println(isPhoneValid.test("08138178550"));

        Boolean isValid = isPhoneValid.and(isContain).test("3");
        System.out.println("isValid " +isValid);
    }

    static Predicate<String> isPhoneValid = phoneNumber -> phoneNumber.startsWith("0") && phoneNumber.length() == 11;
    static Predicate<String> isContain = phoneNumber -> phoneNumber.contains("3");
}
