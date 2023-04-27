package ua.cpu.lw5;

import java.util.Objects;

/**
 * This class represents an integer and provides methods for adding and subtracting values of objects of this class.
 * */
public class Number {

    private final int value;

    public Number(int value) {
        this.value = value;
    }

    public Number() {
        this.value = 0;
    }

    /**
     * This method adds this.value to the value of the argument object and returns a new object with the new value.
     * */
    public final Number add(final Number number) {
        return new Number(this.getValue() + number.getValue());
    }

    /**
     * This method subtracts this.value from the value of the argument object and returns a new object with the new value.
     * */
    public final Number subtract(final Number number) {
        return new Number(this.getValue() - number.getValue());
    }

    public final int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Number number)) return false;
        return value == number.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Number{" +
                "value=" + value +
                '}';
    }
}
