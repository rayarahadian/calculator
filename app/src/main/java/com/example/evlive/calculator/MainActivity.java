package com.example.evlive.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button clear, delete, dividedBy, times, number_seven, number_eight, number_nine, minus, number_four;
    Button number_five, number_six, plus, number_one, number_two, number_three, percent, number_zero, koma, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        number_zero = (Button) findViewById(R.id.button_0);
        number_one = (Button) findViewById(R.id.button_1);
        number_two = (Button) findViewById(R.id.button_2);
        number_three = (Button) findViewById(R.id.button_3);
        number_four = (Button) findViewById(R.id.button_4);
        number_five = (Button) findViewById(R.id.button_5);
        number_six = (Button) findViewById(R.id.button_6);
        number_seven = (Button) findViewById(R.id.button_7);
        number_eight = (Button) findViewById(R.id.button_8);
        number_nine = (Button) findViewById(R.id.button_9);
        plus = (Button) findViewById(R.id.button_plus);
        minus = (Button) findViewById(R.id.button_minus);
        times = (Button) findViewById(R.id.button_times);
        dividedBy = (Button) findViewById(R.id.button_divided_by);
        clear = (Button) findViewById(R.id.button_clear);
        percent = (Button) findViewById(R.id.button_percent);
        delete = (Button) findViewById(R.id.button_delete);
        koma = (Button) findViewById(R.id.button_koma);
        equal = (Button) findViewById(R.id.button_equal);
        result = (TextView) findViewById(R.id.result);

        result.setText("0");

        number_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("0");
                } else {
                    result.setText(result_saat_ini+"0");
                }
            }
        });

        number_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("1");
                } else {
                    result.setText(result_saat_ini+"1");
                }
            }
        });

        number_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("2");
                } else {
                    result.setText(result_saat_ini+"2");
                }
            }
        });

        number_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("3");
                } else {
                    result.setText(result_saat_ini+"3");
                }
            }
        });

        number_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("4");
                } else {
                    result.setText(result_saat_ini+"4");
                }
            }
        });

        number_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("5");
                } else {
                    result.setText(result_saat_ini+"5");
                }
            }
        });

        number_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("6");
                } else {
                    result.setText(result_saat_ini+"6");
                }
            }
        });

        number_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("7");
                } else {
                    result.setText(result_saat_ini+"7");
                }
            }
        });

        number_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("8");
                } else {
                    result.setText(result_saat_ini+"8");
                }
            }
        });

        number_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                if (result_saat_ini.charAt(0) == '0') {
                    result.setText("9");
                } else {
                    result.setText(result_saat_ini+"9");
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                String jenis_operation = " ";
                int index_operation = -1;
                boolean operation_found = false;
                for (int i = 0; i < result_saat_ini.length(); i++) {
                    String current_character = Character.toString(result_saat_ini.charAt(i));
                    if ((current_character.equals("+")) || (current_character.equals("-")) || (current_character.equals("*")) || (current_character.equals("/"))) {
                        operation_found = true;
                        jenis_operation = current_character;
                        index_operation = i;
                    }
                }
                if (operation_found == true) {
                    double value_1 = Double.parseDouble(result_saat_ini.substring(0,index_operation));
                    double value_2 = Double.parseDouble(result_saat_ini.substring(index_operation+1, result_saat_ini.length()));
                    double sum = 0;
                    if (jenis_operation.equals("+")) {
                        sum = value_1+value_2;
                    } else if (jenis_operation.equals("-")) {
                        sum = value_1-value_2;
                    } else if (jenis_operation.equals("/")) {
                        sum = value_1/value_2;
                    } else if (jenis_operation.equals("*")) {
                        sum = value_1*value_2;
                    }
                    String result_akhir = Double.toString(sum);
                    result.setText(result_akhir+"+");
                } else {
                    String last_character = result_saat_ini.substring(result_saat_ini.length()-1);
                    if ((!last_character.equals("+")) || (!last_character.equals("-")) || (!last_character.equals("*")) || (!last_character.equals("/"))) {
                        result.setText(result_saat_ini+"+");
                    }
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                String jenis_operation = " ";
                int index_operation = -1;
                boolean operation_found = false;
                for (int i = 0; i < result_saat_ini.length(); i++) {
                    String current_character = Character.toString(result_saat_ini.charAt(i));
                    if ((current_character.equals("+")) || (current_character.equals("-")) || (current_character.equals("*")) || (current_character.equals("/"))) {
                        operation_found = true;
                        jenis_operation = current_character;
                        index_operation = i;
                    }
                }
                if (operation_found == true) {
                    double value_1 = Double.parseDouble(result_saat_ini.substring(0,index_operation));
                    double value_2 = Double.parseDouble(result_saat_ini.substring(index_operation+1, result_saat_ini.length()));
                    double sum = 0;
                    if (jenis_operation.equals("+")) {
                        sum = value_1+value_2;
                    } else if (jenis_operation.equals("-")) {
                        sum = value_1-value_2;
                    } else if (jenis_operation.equals("/")) {
                        sum = value_1/value_2;
                    } else if (jenis_operation.equals("*")) {
                        sum = value_1*value_2;
                    }
                    String result_akhir = Double.toString(sum);
                    result.setText(result_akhir+"-");
                } else {
                    String last_character = result_saat_ini.substring(result_saat_ini.length()-1);
                    if ((!last_character.equals("+")) || (!last_character.equals("-")) || (!last_character.equals("*")) || (!last_character.equals("/"))) {
                        result.setText(result_saat_ini+"-");
                    }
                }
            }
        });

        dividedBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                String jenis_operation = " ";
                int index_operation = -1;
                boolean operation_found = false;
                for (int i = 0; i < result_saat_ini.length(); i++) {
                    String current_character = Character.toString(result_saat_ini.charAt(i));
                    if ((current_character.equals("+")) || (current_character.equals("-")) || (current_character.equals("*")) || (current_character.equals("/"))) {
                        operation_found = true;
                        jenis_operation = current_character;
                        index_operation = i;
                    }
                }
                if (operation_found == true) {
                    double value_1 = Double.parseDouble(result_saat_ini.substring(0,index_operation));
                    double value_2 = Double.parseDouble(result_saat_ini.substring(index_operation+1, result_saat_ini.length()));
                    double sum = 0;
                    if (jenis_operation.equals("+")) {
                        sum = value_1+value_2;
                    } else if (jenis_operation.equals("-")) {
                        sum = value_1-value_2;
                    } else if (jenis_operation.equals("/")) {
                        sum = value_1/value_2;
                    } else if (jenis_operation.equals("*")) {
                        sum = value_1*value_2;
                    }
                    String result_akhir = Double.toString(sum);
                    result.setText(result_akhir+"/");
                } else {
                    String last_character = result_saat_ini.substring(result_saat_ini.length()-1);
                    if ((!last_character.equals("+")) || (!last_character.equals("-")) || (!last_character.equals("*")) || (!last_character.equals("/"))) {
                        result.setText(result_saat_ini+"/");
                    }
                }
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                String jenis_operation = " ";
                int index_operation = -1;
                boolean operation_found = false;
                for (int i = 0; i < result_saat_ini.length(); i++) {
                    String current_character = Character.toString(result_saat_ini.charAt(i));
                    if ((current_character.equals("+")) || (current_character.equals("-")) || (current_character.equals("*")) || (current_character.equals("/"))) {
                        operation_found = true;
                        jenis_operation = current_character;
                        index_operation = i;
                    }
                }
                if (operation_found == true) {
                    double value_1 = Double.parseDouble(result_saat_ini.substring(0,index_operation));
                    double value_2 = Double.parseDouble(result_saat_ini.substring(index_operation+1, result_saat_ini.length()));
                    double sum = 0;
                    if (jenis_operation.equals("+")) {
                        sum = value_1+value_2;
                    } else if (jenis_operation.equals("-")) {
                        sum = value_1-value_2;
                    } else if (jenis_operation.equals("/")) {
                        sum = value_1/value_2;
                    } else if (jenis_operation.equals("*")) {
                        sum = value_1*value_2;
                    }
                    String result_akhir = Double.toString(sum);
                    result.setText(result_akhir+"*");
                } else {
                    String last_character = result_saat_ini.substring(result_saat_ini.length()-1);
                    if ((!last_character.equals("+")) || (!last_character.equals("-")) || (!last_character.equals("*")) || (!last_character.equals("/"))) {
                        result.setText(result_saat_ini+"*");
                    }
                }
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                boolean operation_found = false;
                for (int i = 0; i < result_saat_ini.length(); i++) {
                    String current_character = result_saat_ini.substring(i);
                    if ((current_character.equals("+")) || (current_character.equals("-")) || (current_character.equals("*")) || (current_character.equals("/"))) {
                        operation_found = true;
                    }
                    i++;
                }
                if (!operation_found) {
                    double value = Double.parseDouble(result_saat_ini) / 100;
                    result.setText(Double.toString(value));
                }
            }
        });

        koma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                String last_character = result_saat_ini.substring(result_saat_ini.length()-1);
                if ((!last_character.equals("+")) || (!last_character.equals("-")) || (!last_character.equals("*")) || (!last_character.equals("/"))) {
                    result.setText(result_saat_ini+".");
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                String result_akhir = result_saat_ini.substring(0,result_saat_ini.length()-1);
                result.setText(result_akhir);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_saat_ini = result.getText().toString();
                String jenis_operation = " ";
                int index_operation = -1;
                boolean operation_found = false;
                for (int i = 0; i < result_saat_ini.length(); i++) {
                    String current_character = Character.toString(result_saat_ini.charAt(i));
                    if ((current_character.equals("+")) || (current_character.equals("-")) || (current_character.equals("*")) || (current_character.equals("/"))) {
                        operation_found = true;
                        jenis_operation = current_character;
                        index_operation = i;
                    }
                }
                if (operation_found == true) {
                    double value_1 = Double.parseDouble(result_saat_ini.substring(0,index_operation));
                    double value_2 = Double.parseDouble(result_saat_ini.substring(index_operation+1, result_saat_ini.length()));
                    double sum = 0;
                    if (jenis_operation.equals("+")) {
                        sum = value_1+value_2;
                    } else if (jenis_operation.equals("-")) {
                        sum = value_1-value_2;
                    } else if (jenis_operation.equals("/")) {
                        sum = value_1/value_2;
                    } else if (jenis_operation.equals("*")) {
                        sum = value_1*value_2;
                    }
                    String result_akhir = Double.toString(sum);
                    result.setText(result_akhir);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
            }
        });

    }
}
