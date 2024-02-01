package com.alisonadamus.sewingmaterials.persistence.entity;

/**
 * Клас, що представляє тканину для шиття.
 */
public class SewingFabric extends Entity {

    /**
     * Матеріал тканини.
     */
    private final String material;
    /**
     * Колір тканини.
     */
    private final String color;
    /**
     * Кількість тканини.
     */
    private double amount;
    /**
     * Вартість за метр тканини.
     */
    private final double costPerMeter;
    /**
     * Загальна вартість тканини.
     */
    private double totalCost;

    /**
     * Конструктор класу тканини для шиття.
     *
     * @param material     Матеріал тканини
     * @param color        Колір тканини
     * @param amount       Кількість тканини
     * @param costPerMeter Вартість за метр тканини
     */
    public SewingFabric(String material, String color, double amount, double costPerMeter) {
        super();
        this.material = material;
        this.color = color;
        this.amount = amount;
        this.costPerMeter = costPerMeter;
        setTotalCost();
    }

    /**
     * Метод отримання унікального ідентифікатора {@link Entity#id}
     *
     * @return Унікальний ідентифікатор
     */
    public String getId() {
        return id;
    }

    /**
     * Метод отримання матеріалу тканини {@link SewingFabric#material}
     *
     * @return Матеріал тканини
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Метод отримання кольору тканини {@link SewingFabric#color}
     *
     * @return Колір тканини
     */
    public String getColor() {
        return color;
    }

    /**
     * Метод отримання кількості тканини {@link SewingFabric#amount}
     *
     * @return Кількість тканини
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Метод, який встановлює кількість тканини та перераховує загальну вартість.
     *
     * @param amount Нова кількість тканини
     */
    public void setAmount(double amount) {
        this.amount = amount;
        setTotalCost();
    }

    /**
     * Метод отримання вартості за метр тканини {@link SewingFabric#costPerMeter}
     *
     * @return Вартість за метр тканини
     */
    public double getCostPerMeter() {
        return costPerMeter;
    }

    /**
     * Метод отримання загальної вартість тканини {@link SewingFabric#totalCost}
     *
     * @return Загальна вартість тканини
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Метод, який встановлює загальну вартість тканини.
     */
    public void setTotalCost() {
        this.totalCost = amount * costPerMeter;
    }

    /**
     * Перевизначений метод, який повертає рядкове представлення об'єкту тканини.
     *
     * @return Рядкове представлення об'єкту тканини
     */
    @Override
    public String toString() {
        return "[" + id + "] " + material + " Колір: " + color + '\'' +
            "Кількість: " + amount + '\'' + " Ціна за метр: " + costPerMeter + '\''
            + " Загальна вартість: " + totalCost;
    }

}
