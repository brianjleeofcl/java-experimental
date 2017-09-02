package db;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class ExampleData {
    private int id, zip;
    private String firstName, lastName;
    private Money balance;
    private CurrencyUnit currency;

    public ExampleData(int id, String firstName, String lastName, int zip) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zip = zip;
        this.currency = CurrencyUnit.of("USD");
        this.balance = Money.of(this.currency, 0);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getZip() {
        return zip;
    }

    public Money getBalance() {
        return balance;
    }
}
