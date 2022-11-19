package org.example;

public class HumanClient implements Client{
    private OrderingStrategy strategy;
    private  SmartStrategy stra;

    public HumanClient(ImpatientStrategy strategy) {
        this.strategy = strategy;
    }

    public HumanClient(SmartStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar)bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        strategy.happyHourEnded((StringBar)bar);
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }
}
