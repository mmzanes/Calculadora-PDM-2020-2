package com.example.calculadorapdm20202;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Optional;
import java.util.regex.Pattern;

import util.Utils;
public class MainActivity extends AppCompatActivity {

    private void updateTxtResult(Button button) {
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        String btText = (String) button.getText();
        String regexOperators = "[+-/*//]";
        String regexNumbers = "^[0-9]";

        if (txtResult.getText().toString().equals("0") && !Pattern.matches(regexOperators, btText)) {
            txtResult.setText("");
        }

        if (Pattern.matches(regexNumbers, btText)) {
            txtResult.append(btText);
        } else if (Pattern.matches(regexOperators, btText)) {
            int length = btText.equals("-") ? 1 : 0;
            if (txtResult.getText().toString().length() > 0 && !Pattern.matches(regexOperators, txtResult.getText().toString().substring(txtResult.getText().toString().length() - 1))) {
                txtResult.append(btText);
            } else if (!txtResult.getText().toString().substring(txtResult.getText().toString().length() - 1).equals(btText) ) {
                txtResult.setText(txtResult.getText().toString().substring(0, txtResult.getText().toString().length()-1).concat(btText));
            }
        } else if ("e".equals(btText)) {
            txtResult.append("^");
        } else if ("√".equals(btText)) {
            txtResult.setText(Utils.sqrt(txtResult.getText().toString()));
        } else if ("=".equals(btText)) {
            txtResult.setText(Utils.calculator(txtResult.getText().toString()));
        } else if (",".equals(btText)) {
            txtResult.setText(".");
        } else if ("Limpar".equals(btText)) {
            txtResult.setText("0");
        } else if ("Del".equals(btText)) {
            txtResult.setText(
                    Optional.ofNullable(txtResult.getText().toString())
                            .filter(sStr -> sStr.length() > 1)
                            .map(sStr -> sStr.substring(0, sStr.length() - 1))
                            .orElse("0"));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btOne = findViewById(R.id.btOne);
        final Button btTwo = findViewById(R.id.btTwo);
        final Button btThree = findViewById(R.id.btThree);
        final Button btFour = findViewById(R.id.btFour);
        final Button btFive = findViewById(R.id.btFive);
        final Button btSix = findViewById(R.id.btSix);
        final Button btSeven = findViewById(R.id.btSeven);
        final Button btEight = findViewById(R.id.btEight);
        final Button btNine = findViewById(R.id.btNine);
        final Button btZero = findViewById(R.id.btZero);
        final Button btClear = findViewById(R.id.btClear);
        final Button btDel = findViewById(R.id.btDel);
        final Button btPlus = findViewById(R.id.btPlus);
        final Button btMinus = findViewById(R.id.btMinus);
        final Button btTimes = findViewById(R.id.btTimes);
        final Button btDivide = findViewById(R.id.btDivide);
        final Button btComma = findViewById(R.id.btComma);
        final Button btEquals = findViewById(R.id.btEquals);
        final Button btSqrt = findViewById(R.id.btSqrt);
        final Button btExp = findViewById(R.id.btExp);

        btOne.setOnClickListener(v -> updateTxtResult(btOne));
        btTwo.setOnClickListener(v -> updateTxtResult(btTwo));
        btThree.setOnClickListener(v -> updateTxtResult(btThree));
        btFour.setOnClickListener(v -> updateTxtResult(btFour));
        btFive.setOnClickListener(v -> updateTxtResult(btFive));
        btSix.setOnClickListener(v -> updateTxtResult(btSix));
        btSeven.setOnClickListener(v -> updateTxtResult(btSeven));
        btEight.setOnClickListener(v -> updateTxtResult(btEight));
        btNine.setOnClickListener(v -> updateTxtResult(btNine));
        btZero.setOnClickListener(v -> updateTxtResult(btZero));
        btClear.setOnClickListener(v -> updateTxtResult(btClear));
        btDel.setOnClickListener(v -> updateTxtResult(btDel));
        btPlus.setOnClickListener(v -> updateTxtResult(btPlus));
        btMinus.setOnClickListener(v -> updateTxtResult(btMinus));
        btTimes.setOnClickListener(v -> updateTxtResult(btTimes));
        btDivide.setOnClickListener(v -> updateTxtResult(btDivide));
        btComma.setOnClickListener(v -> updateTxtResult(btComma));
        btEquals.setOnClickListener(v -> updateTxtResult(btEquals));
        btSqrt.setOnClickListener(v -> updateTxtResult(btSqrt));
        btExp.setOnClickListener(v -> updateTxtResult(btExp));

    }



}