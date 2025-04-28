package enumtest;

public enum E {
    ONE("1"), TWO("1"), THREE("1");

    private String value;

    E(String value) {
        this.value = value;
    }

    public String getValue() {return value;}
}
