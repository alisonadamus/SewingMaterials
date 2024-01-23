package com.alisonadamus.sewingmaterials.persistence.entity;

public class Furniture {
    private static int counter = 0;
    private final int id;
    private final String name;
    private int amount;
    private final double costPerPiece;
    private double totalCost;

    public Furniture(String name, int amount, double costPerPiece) {
        this.id = ++counter;
        this.name = name;
        this.amount = amount;
        this.costPerPiece = costPerPiece;
        setTotalCost();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCostPerPiece() {
        return costPerPiece;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost() {
        this.totalCost = amount*costPerPiece;
    }
}
