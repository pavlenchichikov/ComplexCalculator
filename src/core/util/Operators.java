package core.util;

public enum Operators {
    ADD("+"), SUBSTRACT("-"), MULTIPLY("*"), DIVIDE("/");

    private final String operator;

    Operators(String operator) {
        this.operator = operator;
    }

    public String operator() {
        return operator;
    }
}

