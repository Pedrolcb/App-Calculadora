package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Stack;
public class MainActivity extends AppCompatActivity {

    Stack<Integer> pilha = new Stack<Integer>();
    Integer valorA;
    Integer valorB;
    Button emp;
    Button desempilhar;
    Button soma;
    Button sub;
    Button mult;
    Button div;
    EditText inserir;
    TextView stack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emp = (Button) findViewById(R.id.emp);
        desempilhar = (Button) findViewById(R.id.desempilhar);
        soma = (Button) findViewById(R.id.soma);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mult);
        div =(Button) findViewById(R.id.div);
        inserir = (EditText) findViewById(R.id.inserir);
        stack = (TextView) findViewById(R.id.stack);
    }

    public void mostrar(){
        stack.setText(pilha.toString());
    }

    public void inserir(View a){
        Integer valor = Integer.parseInt(String.valueOf(inserir.getText()));
        pilha.push(valor);
        mostrar();
    }

    public void deletar(View x){
        try {
            pilha.pop();
            mostrar();
        }
        catch (Exception e) {
            stack.setText("Nenhum número na pilha! ");
        }
    }


    public void somar(View x) {
        try {
            valorA = pilha.lastElement();
            pilha.pop();
            valorB = pilha.lastElement();
            pilha.pop();
            pilha.push(valorA + valorB);
            mostrar();
        }
        catch (Exception e) {
            stack.setText("Exceção \n"+ pilha.toString());
        }

    }

    public void subtrair(View x) {
        try {
            valorA = pilha.lastElement();
            pilha.pop();
            valorB = pilha.lastElement();
            pilha.pop();
            pilha.push(valorA - valorB);
            mostrar();
        }
        catch (Exception e) {
            stack.setText("Exceção");
        }
    }

    public void multiplicar(View x) {
        try {
            valorA = pilha.lastElement();
            pilha.pop();
            valorB = pilha.lastElement();
            pilha.pop();
            pilha.push(valorA * valorB);
            mostrar();
        }
        catch (Exception e) {
            stack.setText("Exceção ");
        }
    }

    public void dividir(View x) {
        try {
            valorA = pilha.lastElement();
            pilha.pop();
            valorB = pilha.lastElement();
            pilha.pop();
            pilha.push(valorA  / valorB);
            mostrar();
        }
        catch (Exception e) {
            stack.setText("Exceção ");
        }
    }
}