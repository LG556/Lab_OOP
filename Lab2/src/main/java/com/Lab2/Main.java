package com.Lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створюємо список іграшок
        List<Toys> toys = new ArrayList<>();
        BudgetManager budgetManager = new BudgetManager(); // Створюємо BudgetManager

        // Додаємо іграшки
        addToyIfBudgetAllows(toys, new Cars("Маленька машинка", "А - Малий", 100), budgetManager);
        addToyIfBudgetAllows(toys, new Dolls("Лялька Барбі", "Б - Середній", 120), budgetManager);
        addToyIfBudgetAllows(toys, new Balls("Футбольний м'яч", "Б - Середній", 80), budgetManager);
        addToyIfBudgetAllows(toys, new Cubes("Кубики LEGO", "А - Малий", 50), budgetManager);
        addToyIfBudgetAllows(toys, new Cars("Велика машинка", "В - Старший", 200), budgetManager);
        addToyIfBudgetAllows(toys, new Cars("Хентай фігурка", "Г - Дорослі", 80), budgetManager);

        System.out.println("\nСписок іграшок:");
        toys.forEach(System.out::println);

        System.out.println("Залишок бюджету: " + budgetManager.getRemainingBudget());

        System.out.println("\nСортування за віковою категорією (за зростанням):");
        Sort.sortByAgeGroup(toys, true);
        toys.forEach(System.out::println);

        System.out.println("\nСортування за типом іграшки (за спаданням):");
        Sort.sortByToyType(toys, false);
        toys.forEach(System.out::println);

        System.out.println("\nСортування за назвою іграшки (за зростанням):");
        Sort.sortByName(toys, true);
        toys.forEach(System.out::println);

        System.out.println("\nСортування за ціною (за зростанням):");
        Sort.sortByPrice(toys, true);
        toys.forEach(System.out::println);

        // Пошук іграшки за діапазоном ціни
        double minPrice = 50;
        double maxPrice = 120;
        Toys foundToy = Sort.findToyByPriceRange(toys, minPrice, maxPrice);
        System.out.println("\nЗнайдена іграшка в діапазоні від " + minPrice + " до " + maxPrice + ":");
        if (foundToy != null) {
            System.out.println(foundToy);
        } else {
            System.out.println("Іграшок в цьому діапазоні не знайдено.");
        }
    }

    private static void addToyIfBudgetAllows(List<Toys> toys, Toys toy, BudgetManager budgetManager) {
        if (toy.addToy(budgetManager)) { // Викликаємо метод додавання з BudgetManager
            toys.add(toy); // Додаємо іграшку до списку, якщо додавання успішне
        }
    }
}
