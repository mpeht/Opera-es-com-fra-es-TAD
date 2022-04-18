/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppRacional;

import java.text.DecimalFormat;

/**
 *
 * @author mpeht
 */
public class Racional {

    public static final int PRECISION = 10;
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        reducao(numerador, denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int aNumerador) {
        numerador = aNumerador;
    }

    public int getDenominador() {
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new ArithmeticException();
        }
        return denominador;
    }

    public void setDenominador(int aDenominador) {
        denominador = aDenominador;
    }

    private void reducao(int numerador, int denominador) {
        int maior;
        int mdc = 1;
        if (numerador > denominador) {
            maior = numerador;
        } else {
            maior = denominador;
        }

        for (int i = 2; i <= maior; i++) {
            if ((numerador % i == 0) && (denominador % i == 0)) {
                mdc = i;
            }
        }
        setNumerador(numerador / mdc);
        setDenominador(denominador / mdc);
    }

    public Racional adicao(Racional outro) {

        int numerador = this.numerador * outro.denominador + this.denominador * outro.numerador;

        return new Racional(numerador, denominador);
    }

    public Racional subtracao(Racional outro) {
        int numerador = this.numerador * outro.denominador - this.denominador * outro.denominador;

        return new Racional(numerador, denominador);
    }

    public Racional multiplicacao(Racional outro) {
        int numerador = this.numerador * outro.numerador;
        int denominador = this.denominador * outro.denominador;

        return new Racional(numerador, denominador);
    }

    public Racional divisao(Racional outro) {
        int numerador = this.numerador * outro.denominador;
        int denominador = this.denominador * outro.numerador;

        return new Racional(numerador, denominador);
    }

    public String Formatar(int precision) {
        if (precision <= 0) {
            precision = PRECISION;
        }

        String pattern = "0.";

        for (int i = 0; i < precision; i++) {
            pattern = pattern + "0";
        }

        DecimalFormat meuFormato = new DecimalFormat(pattern);

        return meuFormato.format(1.0 * numerador / denominador);
    }

    
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}


