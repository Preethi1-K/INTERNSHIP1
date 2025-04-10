package com.xworkz.basic.tea;
import com.xworkz.basic.tea.greenTea.GreenTea;

public class TeaRunner {

        public static void main(String args[]) {

            Tea tea = new Tea();
            tea.ingredients();
            tea.benefits();

            GreenTea greenTea = new GreenTea();
            greenTea.ingredients();
            greenTea.benefits();
        }
    }



