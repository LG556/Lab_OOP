package com.Lab2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Sort {
    // Сортування за віковою категорією
    public static void sortByAgeGroup(List<Toys> toys, boolean ascending) {
        toys.sort(Comparator.comparing(Toys::getAgeGroup));
        if (!ascending) {
            Collections.reverse(toys);
        }
    }

    // Сортування за типом іграшки
    public static void sortByToyType(List<Toys> toys, boolean ascending) {
        toys.sort(Comparator.comparing(Toys::getType));
        if (!ascending) {
            Collections.reverse(toys);
        }
    }

    // Сортування за назвою іграшки
    public static void sortByName(List<Toys> toys, boolean ascending) {
        toys.sort(Comparator.comparing(Toys::getName));
        if (!ascending) {
            Collections.reverse(toys);
        }
    }

    // Сортування за ціною
    public static void sortByPrice(List<Toys> toys, boolean ascending) {
        toys.sort(Comparator.comparing(Toys::getPrice));
        if (!ascending) {
            Collections.reverse(toys);
        }
    }

    // Пошук іграшки за діапазоном вартості
    public static Toys findToyByPriceRange(List<Toys> toys, double minPrice, double maxPrice) {
        return toys.stream().filter(t -> t.getPrice() >= minPrice && t.getPrice() <= maxPrice).findFirst().orElse(null);
    }
}



