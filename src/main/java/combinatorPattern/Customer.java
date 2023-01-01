package combinatorPattern;

import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String email;

    private final String phoneNumber;
    private final Gender gender;
    private final LocalDate dob;


    public Customer(String name, String email, String phoneNumber, Gender gender, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    enum Gender {
        Male, Female
    }
}
