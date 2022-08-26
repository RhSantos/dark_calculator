package com.rhuan.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AppCompatTextView calcResult = null, operation = null;
    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,divide,
            multiply,minus,sum,clear,backspace,equal,left_paren,right_paren,sin,deg;
    boolean doClear;
    boolean doCatchResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        minus = findViewById(R.id.minus);
        sum = findViewById(R.id.sum);
        clear = findViewById(R.id.clear);
        backspace = findViewById(R.id.backspace);
        equal = findViewById(R.id.equal);
        left_paren = findViewById(R.id.left_parentheses);
        right_paren = findViewById(R.id.right_parentheses);
        sin = findViewById(R.id.sin_operator);
        deg = findViewById(R.id.deg_operator);
        calcResult = findViewById(R.id.result);
        operation = findViewById(R.id.operation);

        List<Character> algorithms = new ArrayList<>();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('1');
                setTextOperationValue("1");
                doCatchResult = false;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('2');
                setTextOperationValue("2");
                doCatchResult = false;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('3');
                setTextOperationValue("3");
                doCatchResult = false;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('4');
                setTextOperationValue("4");
                doCatchResult = false;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('5');
                setTextOperationValue("5");
                doCatchResult = false;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('6');
                setTextOperationValue("6");
                doCatchResult = false;
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('7');
                setTextOperationValue("7");
                doCatchResult = false;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('8');
                setTextOperationValue("8");
                doCatchResult = false;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('9');
                setTextOperationValue("9");
                doCatchResult = false;
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.add('0');
                setTextOperationValue("0");
                doCatchResult = false;
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                if (!calcResult.getText().toString().isEmpty() && doCatchResult){
                    operation.setText(calcResult.getText().toString().substring(1));
                    doCatchResult = false;
                }
                if (operation.getText().toString().isEmpty()) {
                    algorithms.add('0');
                    algorithms.add('.');
                    setTextOperationValue("0.");
                } else{
                    if (operation.getText().toString().charAt(operation.getText().toString().length() - 1) != '.'
                            && operation.getText().toString().charAt(operation.getText().toString().length() - 1) != '('
                            && operation.getText().toString().charAt(operation.getText().toString().length() - 1) != ')'
                            && operation.getText().toString().charAt(operation.getText().toString().length() - 1) != '+'
                            && operation.getText().toString().charAt(operation.getText().toString().length() - 1) != '-'
                            && operation.getText().toString().charAt(operation.getText().toString().length() - 1) != '*'
                            && operation.getText().toString().charAt(operation.getText().toString().length() - 1) != '/') {
                        for (int i = operation.getText().toString().length()-1; i >= 0; i--) {
                            if (operation.getText().toString().charAt(i) == '+'
                                    || operation.getText().toString().charAt(i) == '-'
                                    || operation.getText().toString().charAt(i) == '*'
                                    || operation.getText().toString().charAt(i) == '/'){
                                break;
                            }
                            if(operation.getText().toString().charAt(i) == '.'){
                                return;
                            }
                        }
                        algorithms.add('.');
                        setTextOperationValue(".");
                        doCatchResult = false;
                    }
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                if (!calcResult.getText().toString().isEmpty() && doCatchResult){
                    operation.setText(calcResult.getText().toString().substring(1));
                    doCatchResult = false;
                }
                algorithms.add('/');
                setTextOperationValue("/");
                doCatchResult = false;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                if (!calcResult.getText().toString().isEmpty() && doCatchResult){
                    operation.setText(calcResult.getText().toString().substring(1));
                    doCatchResult = false;
                }
                algorithms.add('*');
                setTextOperationValue("*");
                doCatchResult = false;
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                if (!calcResult.getText().toString().isEmpty() && doCatchResult){
                    operation.setText(calcResult.getText().toString().substring(1));
                    doCatchResult = false;
                }
                algorithms.add('-');
                setTextOperationValue("-");
                doCatchResult = false;
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                if (!calcResult.getText().toString().isEmpty() && doCatchResult){
                    operation.setText(calcResult.getText().toString().substring(1));
                    doCatchResult = false;
                }
                algorithms.add('+');
                setTextOperationValue("+");
                doCatchResult = false;
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.clear();
                clear();
                doCatchResult = false;
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                algorithms.remove(algorithms.size() - 1);
                backspace();
                doCatchResult = false;
            }
        });

        left_paren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                if (!calcResult.getText().toString().isEmpty() && doCatchResult){
                    operation.setText(calcResult.getText().toString().substring(1));
                    doCatchResult = false;
                }
                algorithms.add('(');
                setTextOperationValue("(");
                doCatchResult = false;
            }
        });

        right_paren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (doClear) {
                    operation.setText("");
                    doClear = false;
                }
                if (!calcResult.getText().toString().isEmpty() && doCatchResult){
                    operation.setText(calcResult.getText().toString().substring(1));
                    doCatchResult = false;
                }
                algorithms.add(')');
                setTextOperationValue(")");
                doCatchResult = false;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operation.getText().toString().isEmpty()) {
                    Expression exp = new Expression(operation.getText().toString());
                    double result = exp.calculate();

                    if ((int) result == exp.calculate()) {
                        calcResult.setText(String.format("%s", "=" + (int) result));
                    } else {
                        calcResult.setText(String.format("%s", "=" + result));
                    }
                    doClear = true;
                    doCatchResult = true;
                }
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression exp = new Expression(operation.getText().toString());
                double result = Math.sin(Math.toRadians(exp.calculate()));

                if ((int) result == result) {
                    calcResult.setText(String.format("%s", "=" + (int) result));
                } else {
                    calcResult.setText(String.format("%s", "=" + result));
                }
                doClear = true;
                doCatchResult = false;
            }
        });

        deg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression exp = new Expression(operation.getText().toString());
                double result = Math.toDegrees(exp.calculate());

                calcResult.setText(String.format("%s", "=" + (int) result));

                doClear = true;
                doCatchResult = false;
            }
        });
    }

    public void clear() {
        operation.setText("");
        calcResult.setText("");
    }

    public void backspace() {
        if (!operation.getText().toString().isEmpty()) {
            operation.setText(operation.getText().toString().substring(0, operation.getText().toString().length() - 1));
        }
    }

    public void setTextOperationValue(String operationValue) {
        String operationText = operation.getText().toString() + operationValue;
        operation.setText(operationText);
    }
}