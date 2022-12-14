package org.example;

public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink strDrink){
        StringBuilder str = new StringBuilder(strDrink.getText());
        for (int i = 0; i < str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))) {
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if (Character.isUpperCase(str.charAt(i))) {
                str.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        strDrink.setText(String.valueOf(str));
    }
}
