package org.example;

public class StringBar extends Bar{
    private StringBar bar;
    public StringBar() {
        this.bar = bar;
    }

    @Override
    public boolean isHappyHour() {
        if (bar.isHappyHour())
            return true;
        return false;
    }

    @Override
    public void startHappyHour() {
        bar.startHappyHour();
    }

    @Override
    public void endHappyHour() {
        bar.endHappyHour();
    }
}
