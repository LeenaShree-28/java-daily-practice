
public enum Level2 {
    OPTION_1("1.Sports"), OPTION_2("2.Finance"), OPTION_3("3.Technology"), OPTION_4("4.Education"),OPTION_5("9-Back"),OPTION_6("0.Exit");

    private final String text;

    Level2(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}