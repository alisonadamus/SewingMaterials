package com.alisonadamus.sewingmaterials.persistence.entity;

public class SewingFabric {

    private static int counter = 0;
    private final int id;
    private final String material;
    private final String color;
    private double amount;
    private final double costPerMeter;
    private double totalCost;

    public SewingFabric(String material, String color, double amount, double costPerMeter) {
        this.id = ++counter;
        this.material = material;
        this.color = color;
        this.amount = amount;
        this.costPerMeter = costPerMeter;
        setTotalCost();

    }

    public int getId() {
        return id;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCostPerMeter() {
        return costPerMeter;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost() {
        this.totalCost = amount * costPerMeter;
    }

    @Override
    public String toString() {
        return '\n' + "[" + id + "] " +  material + " Колір: " + color + '\n' +
            "Кількість: " + amount + " Ціна за метр: " + costPerMeter + " Загальна вартість: " + totalCost;
    }
    //    @Override
//    public String toString(){
//        return "[" + id + "]"
//    }
}
