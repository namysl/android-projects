package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CharSequence liczba1_cs;
    String operacja;
    private TextView obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obj = findViewById(R.id.textView);
    }

    public void aktualizuj_pole(String new_text) {
        if (new_text.equals("")) {
            obj.setText(new_text);
        }
        else {
            CharSequence old_text = obj.getText();
            String old_text_s = old_text.toString();

            String text = old_text + new_text;

            if (old_text_s.length() != 0) {
                String last_character = old_text_s.substring(old_text_s.length() - 1);
                System.out.println(last_character);
                if (last_character.equals("+") ||
                    last_character.equals("-") ||
                    last_character.equals("*") ||
                    last_character.equals("/")) {
                    obj.setText(last_character);
                }
                else {
                    obj.setText(text);
                }
            }
            else{
                obj.setText(text);
            }
        }
    }

    public void cyfra0(View view){
        aktualizuj_pole("0");
    }

    public void cyfra1(View view){
        aktualizuj_pole("1");
    }

    public void cyfra2(View view){
        aktualizuj_pole("2");
    }

    public void cyfra3(View view){
        aktualizuj_pole("3");
    }

    public void cyfra4(View view){
        aktualizuj_pole("4");
    }

    public void cyfra5(View view){
        aktualizuj_pole("5");
    }

    public void cyfra6(View view){
        aktualizuj_pole("6");
    }

    public void cyfra7(View view){
        aktualizuj_pole("7");
    }

    public void cyfra8(View view){
        aktualizuj_pole("8");
    }

    public void cyfra9(View view){
        aktualizuj_pole("9");
    }

    public void znak_plus(View view){
        liczba1_cs = obj.getText();
        aktualizuj_pole("+");
        operacja = "+";
    }

    public void znak_minus(View view){
        liczba1_cs = obj.getText();
        aktualizuj_pole("-");
        operacja = "-";
    }

    public void znak_mnozenie(View view){
        liczba1_cs = obj.getText();
        aktualizuj_pole("*");
        operacja = "*";
    }

    public void znak_dzielenie(View view){
        liczba1_cs = obj.getText();
        aktualizuj_pole("/");
        operacja = "/";
    }

    public void usun(View view){
        aktualizuj_pole("");
    }

    public void rowna_sie(View view){
        double wynik = 0;

        double liczba1 = Integer.parseInt(liczba1_cs.toString());
        double liczba2 = 4;

        switch (operacja) {
            case "+":
                wynik = liczba1 + liczba2;
                break;
            case "-":
                wynik = liczba1 - liczba2;
                break;
            case "*":
                wynik = liczba1 * liczba2;
                break;
            case "/":
                wynik = liczba1 / liczba2;
                break;
        }
        obj.setText(String.valueOf(wynik));

    }
    /*
    public void dodaj(View view){
        TextView obj = (TextView)findViewById(R.id.textView);

        CharSequence old_text = obj.getText();
        String text = old_text + "+";

        CharSequence cs = obj.getText();
        String s = cs.toString();
        x = Double.parseDouble(s);

        System.out.println(x);
        obj.setText(text);
    }
    */
}