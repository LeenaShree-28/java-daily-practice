package chatbot;
public enum Level1 {
    OPTION_1("1.English"), OPTION_2("2.Tamil"), OPTION_3("3.Hindi"),OPTION_4("0-Exit");

    private final String text;

    Level1(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}