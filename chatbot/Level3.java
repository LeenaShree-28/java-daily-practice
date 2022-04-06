package chatbot;
public enum Level3 {
    OPTION_1("1.Basic Plan"), OPTION_2("2.Ultimate Plan"), OPTION_3("3.Premium Plan"), OPTION_4("4.Super Premium Plan"), OPTION_5("9.Go back"), OPTION_6("0.Exit");

    private final String text;

    Level3(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}