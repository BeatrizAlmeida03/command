package org.example;

public class FerengiClient extends AlienClient{
    private FerengiClient fer;
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
