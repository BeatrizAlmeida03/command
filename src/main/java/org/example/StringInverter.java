package org.example;

public class StringInverter implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuilder tt = new StringBuilder(drink.getText());
        tt.reverse();
        drink.setText(String.valueOf(tt));
    }
}
