package org.example;

public class RomulanClient extends AlienClient{
    private RomulanClient rom;
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
