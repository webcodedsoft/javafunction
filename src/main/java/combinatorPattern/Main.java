package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.Customer.Gender.*;
import static combinatorPattern.CustomerValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Adedeji",
                "adedejisikiruadesola@gmail.com",
                "+2348138178550",
                Male,
                LocalDate.of(2000, 1, 3));

        ValidatorResult validatorResult = isEmailValid().and(isPhoneValid()).and(isAdult()).apply(customer); //extract to variable shortcut option+command+V

        System.out.println(validatorResult);

        if(validatorResult != ValidatorResult.SUCCESS) {
            throw new IllegalStateException(validatorResult.name());
        }

    }
}
