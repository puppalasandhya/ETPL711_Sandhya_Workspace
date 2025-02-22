package com.evergnet.corejava.sandhya.application4;

import java.util.Scanner;

abstract class CourseModule {
    protected int itemCost;
    protected int pieces;
    protected int amount;
    protected int amountDisc;

    protected abstract void selectSubModule();

    protected void calculateAmount() {
        amount = itemCost * pieces;
        System.out.println("Amount for courses before discount is Rs" + amount);
        if (amount >= 20000 && amount <= 30000)
            amountDisc = (int) (amount - (amount * 0.02));
        else if (amount >= 30000 && amount <= 50000)
            amountDisc = (int) (amount - (amount * 0.05));
        else if (amount >= 51000 && amount <= 100000)
            amountDisc = (int) ((amount - amount * 0.06));
        else if (amount >= 150000)
            amountDisc = (int) ((amount - amount * 0.08));
    }

    protected void enterStudentCount(Scanner br) {
        System.out.println("Enter the number of students");
        pieces = Integer.parseInt(br.nextLine());
        System.out.println("You selected no of students are " + pieces);
        calculateAmount();
        System.out.println("Amount for courses after Discount for selected pieces is Rs" + amountDisc);
    }
}