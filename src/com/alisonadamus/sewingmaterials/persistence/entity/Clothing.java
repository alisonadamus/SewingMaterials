package com.alisonadamus.sewingmaterials.persistence.entity;

import java.util.Map;

public class Clothing {

    private static int counter = 0;
    private final int id;
    private final String name;
    private final Map<SewingFabric, Double> sewingFabrics;
    private final Map<Furniture, Integer> furnitures;
    private Double totalcost;

    public Clothing(String name, Map<SewingFabric, Double> sewingFabrics,
        Map<Furniture, Integer> furnitures) {
        this.id = ++counter;
        this.name = name;
        this.sewingFabrics = sewingFabrics;
        this.furnitures = furnitures;
        setTotalcost();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<SewingFabric, Double> getSewingFabrics() {
        return sewingFabrics;
    }

    public Map<Furniture, Integer> getFurnitures() {
        return furnitures;
    }

    public Double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost() {
        this.totalcost = sewingFabrics.entrySet().stream()
            .mapToDouble(entry -> entry.getKey().getCostPerMeter() * entry.getValue())
            .sum() + furnitures.entrySet().stream()
            .mapToDouble(entry -> entry.getKey().getCostPerPiece() * entry.getValue())
            .sum();
    }
}
