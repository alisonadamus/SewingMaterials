package com.alisonadamus.sewingmaterials.persistence.entity;

/**
 * Клас, що представляє фурнітуру для шиття.
 */
public class Furniture extends Entity {

    /**
     * Назва фурнітури.
     */
    private final String name;
    /**
     * Кількість фурнітури.
     */
    private int amount;
    /**
     * Вартість за одиницю фурнітури.
     */
    private final double costPerPiece;
    /**
     * Загальна вартість фурнітури.
     */
    private double totalCost;

    /**
     * Конструктор класу фурнітури для шиття.
     *
     * @param name         Назва фурнітури
     * @param amount       Кількість фурнітури
     * @param costPerPiece Вартість за одиницю фурнітури
     */
    public Furniture(String name, int amount, double costPerPiece) {
        super();
        this.name = name;
        this.amount = amount;
        this.costPerPiece = costPerPiece;
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
     * Метод отримання назви фурнітури {@link Furniture#name}
     *
     * @return Назва фурнітури
     */
    public String getName() {
        return name;
    }

    /**
     * Метод отримання кількості фурнітури {@link Furniture#amount}
     *
     * @return Кількість фурнітури
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Метод, який встановлює кількість фурнітури та перераховує загальну вартість.
     *
     * @param amount Нова кількість фурнітури
     */
    public void setAmount(int amount) {
        this.amount = amount;
        setTotalCost();
    }

    /**
     * Метод отримання вартості за одиницю фурнітури {@link Furniture#costPerPiece}
     *
     * @return Вартість за одиницю фурнітури
     */
    public double getCostPerPiece() {
        return costPerPiece;
    }

    /**
     * Метод отримання загальної вартості фурнітури {@link Furniture#totalCost}
     *
     * @return Загальна вартість фурнітури
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Метод, який встановлює загальну вартість фурнітури.
     */
    public void setTotalCost() {
        this.totalCost = amount * costPerPiece;
    }

}
