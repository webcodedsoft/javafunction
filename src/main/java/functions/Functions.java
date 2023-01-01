package functions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {


        int increment = increment(3);
        System.out.println(increment);

        int functionIncrement = functionIncremental.apply(4);
        System.out.println(functionIncrement);

       int  functionMultplyAndAdd2 = functionIncremental.andThen(functionMultiplyBy10).apply(3);
        System.out.println("functionMultplyAndAdd: "+ functionMultplyAndAdd2);

        //BiFunction
        int biFunction = biFunctionArithemetic.apply(2, 10);
        System.out.println(biFunction);

        //Consumer

        Customer customer = new Customer("Adesola", "08138178550");
        greetCustomer.accept(customer);

        greetCustomerBi.accept(customer, false);
    }

    static Consumer<Customer> greetCustomer = customer -> System.out.println("Hi, "+customer.customerName+" thanks for registering your phone number "+ customer.customerPhone);
    static BiConsumer<Customer, Boolean> greetCustomerBi = (customer, showNumber) -> System.out.println("Hi, "+customer.customerName+" thanks for registering your phone number "+ (showNumber ? customer.customerPhone : "****************"));


    static Function<Integer, Integer> functionIncremental = number -> number + 1;

    static Function<Integer, Integer> functionMultiplyBy10 = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> biFunctionArithemetic = (increment, multiply) -> (increment + 1) * multiply;

    static int increment(int number) {
        return number + 1;
    }

    static class Customer {
        private final String customerName;
        private final String customerPhone;

        Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
