package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorPattern.CustomerValidator.ValidatorResult.*;

public interface CustomerValidator extends Function<Customer, CustomerValidator.ValidatorResult> {

    static CustomerValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerValidator isPhoneValid() {
        return customer -> customer.getPhoneNumber().startsWith("+234") ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerValidator and (CustomerValidator other) {
        return customer -> {
            ValidatorResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) :  result;
        };
    }

    enum ValidatorResult {
        SUCCESS,
        EMAIL_NOT_VALID,
        PHONE_NUMBER_NOT_VALID,
        IS_NOT_AN_ADULT

    }
}
