package com.Lab2;

public class BudgetManager {
    private double totalCost = 0; // Вартість доданих іграшок
    private static final double BUDGET = 500; // Максимальний бюджет

    public boolean addToy(double price, String toyName) {
        if (totalCost + price > BUDGET) {
            System.out.println("Не вдалося додати " + toyName + ": перевищено бюджет!");
            return false; // Іграшка не додана
        } else {
            totalCost += price;
            return true; // Іграшка додана успішно
        }
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getRemainingBudget() {
        return BUDGET - totalCost;
    }
}

