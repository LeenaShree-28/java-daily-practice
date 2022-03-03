package inheritance.multipleinheritance;

public class SmartPhone implements TelePhone, AlarmClock {
    // must override the methods in interfaces.
    @Override
    public void setAlarm() {
        System.out.println("Set alarm...");
    }

    @Override
    public void call() {
        System.out.println("Calling..");
    }

    public void display() {
        AlarmClock.super.deleteAlarm(); // must give interface name before super
    }

    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.setAlarm();
        s.call();
        s.display();
    }
}
