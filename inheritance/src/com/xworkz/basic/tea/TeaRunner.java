package com.xworkz.basic.tea;
import com.xworkz.basic.tea.greenTea.GreenTea;

public class TeaRunner {

        public static void main(String args[]) {

            Tea tea = new GreenTea();
            GreenTea greenTea = (GreenTea)tea;
            tea.ingredients();
            tea.benefits();
            greenTea.ingredients();
            greenTea.benefits();
        }
    }



