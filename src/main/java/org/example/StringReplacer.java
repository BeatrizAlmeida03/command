package org.example;

public class StringReplacer implements StringTransformer {
    private char a;
    private char x;
    public StringReplacer(char a, char x) {
        this.a = a;
        this.x = x;
    }

    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder(drink.getText());
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == a){
                str.setCharAt(i,x);
            }
            drink.setText(String.valueOf(str));
        }
    }

}
