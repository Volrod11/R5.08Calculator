package com.arricastres.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator Calculatorentest=new Calculator();

    @Test
    void add_doit_renvoyer_la_somme_de_opG_et_opD(){
        //Given
        int opG = 1;
        int opD = 2;


        //WHEN
        int somme = Calculatorentest.add(opG,opD);

        //THEN
        assertThat(somme).isEqualTo(3);
    }

    @Test
    void divide_doit_renvoyer_la_difference_de_opG_et_opD(){
        //Given
        int opG = 3;
        int opD = 2;


        //WHEN
        int somme = Calculatorentest.divide(opG,opD);

        //THEN
        assertThat(somme).isEqualTo(1);
    }
}