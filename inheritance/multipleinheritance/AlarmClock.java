package inheritance.multipleinheritance;

interface AlarmClock {
    void setAlarm();
    // It is abstract method. It means the method can't have body, can have only method signature.
    // Since java 8, we can also use non-abstract methods in interface.
    // But, the method should be default or static.

    default void deleteAlarm() {
        System.out.println("Delete Alarm..");
    }
}
