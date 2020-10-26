package com.example.calculadorapdm20202;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Optional;

public class MainActivity extends AppCompatActivity {

    private void updateTxtResult(Button button) {
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        String btText = (String) button.getText();
        System.out.println(txtResult.getText());
        if (txtResult.getText().toString().equals("0")) {
            txtResult.setText("");
        }

        if ("1".equals(btText)) {
            txtResult.append("1");
        } else if ("2".equals(btText)) {
            txtResult.append("2");
        } else if ("3".equals(btText)) {
            txtResult.append("3");
        } else if ("4".equals(btText)) {
            txtResult.append("4");
        } else if ("5".equals(btText)) {
            txtResult.append("5");
        } else if ("6".equals(btText)) {
            txtResult.append("6");
        } else if ("7".equals(btText)) {
            txtResult.append("7");
        } else if ("8".equals(btText)) {
            txtResult.append("8");
        } else if ("9".equals(btText)) {
            txtResult.append("9");
        } else if ("0".equals(btText)) {
            txtResult.append("0");
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

        btOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btOne);
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btTwo);
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btThree);
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btFour);
            }
        });

        btFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btFive);
            }
        });

        btSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btSix);
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btSeven);
            }
        });

        btEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btEight);
            }
        });

        btNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btNine);
            }
        });

        btZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btZero);
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btClear);
            }
        });

        btDel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateTxtResult(btDel);
            }
        });
    }
}