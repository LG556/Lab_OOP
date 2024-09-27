package com.Lab2;

abstract class Toys {
    protected String name;       // Назва іграшки
    protected String type;       // Тип іграшки
    protected String ageGroup;   // Вікова група
    protected double price;      // Ціна

    public Toys(String name, String type, String ageGroup, double price) {
        this.name = name;
        this.type = type;
        this.ageGroup = ageGroup;
        this.price = price;
    }

    public boolean addToy(BudgetManager budgetManager) {
        return budgetManager.addToy(price, name); // Викликаємо метод додавання з BudgetManager
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " [Тип: " + type + ", Вікова група: " + ageGroup + ", Ціна: " + price + "]";
    }
}


class Cars extends Toys {
    public Cars(String name, String ageGroup, double price) {
        super(name, "Машинка", ageGroup, price);
    }
}

class Dolls extends Toys {
    public Dolls(String name, String ageGroup, double price) {
        super(name, "Лялька", ageGroup, price);
    }
}

class Balls extends Toys {
    public Balls(String name, String ageGroup, double price) {
        super(name, "М'яч", ageGroup, price);
    }
}

class Cubes extends Toys {
    public Cubes(String name, String ageGroup, double price) {
        super(name, "Кубики", ageGroup, price);
    }
}
