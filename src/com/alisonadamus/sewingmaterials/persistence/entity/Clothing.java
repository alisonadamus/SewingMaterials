package com.alisonadamus.sewingmaterials.persistence.entity;

/**
 * Клас, що представляє одяг.
 */
public class Clothing extends Entity {

    /**
     * Назва одягу.
     */
    private final String name;
    /**
     * Тканина, з якої складається одяг.
     */
    private final SewingFabric fabric;
    /**
     * Кількість тканини, з якої складається одяг.
     */
    private final Double fabricAmount;

    private final String color;
    /**
     * Фурнітура, з якої складається одяг.
     */
    private final Furniture furniture;
    /**
     * Кількість фурнітури, з якої складається одяг.
     */
    private final Integer furnitureAmount;
    /**
     * Загальна вартість одягу.
     */
    private Double totalcost;

    /**
     * Конструктор класу одяг.
     *
     * @param builder Об'єкт класу {@link ClothingBuilder}, який містить параметри для створення
     *                одягу
     */
    private Clothing(ClothingBuilder builder) {
        super();
        this.name = builder.name;
        this.fabric = builder.fabric;
        this.fabricAmount = builder.fabricAmount;
        this.color = builder.color;
        this.furniture = builder.furniture;
        this.furnitureAmount = builder.furnitureAmount;
        setTotalcost();
    }

    /**
     * Вкладений клас-будівник для класу одяг.
     */
    public static class ClothingBuilder {

        private final String name;
        private final SewingFabric fabric;
        private final Double fabricAmount;
        private final String color;
        private Furniture furniture;
        private Integer furnitureAmount;

        /**
         * Конструктор класу-будівника.
         *
         * @param name         Назва одягу
         * @param fabric       Тканина, з якої виготовлено одяг
         * @param fabricAmount Кількість тканини в одязі
         */

        public ClothingBuilder(String name, SewingFabric fabric, Double fabricAmount) {
            this.name = name;
            this.fabric = fabric;
            this.fabricAmount = fabricAmount;
            this.color = fabric.getColor();
        }

        /**
         * Метод, який додає фурнітуру до одягу.
         *
         * @param furniture       Фурнітура, з якої складається одяг
         * @param furnitureAmount Кількість необхідної фурнітури в одязі
         * @return Побудований об'єкт класу {@link ClothingBuilder}
         */
        public ClothingBuilder furniture(Furniture furniture, Integer furnitureAmount) {
            this.furniture = furniture;
            this.furnitureAmount = furnitureAmount;
            return this;
        }

        /**
         * Метод, який повертає готовий об'єкт класу {@link Clothing}.
         *
         * @return Об'єкт класу одяг
         */
        public Clothing build() {
            return new Clothing(this);
        }
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
     * Метод отримання назви одягу {@link Clothing#name}
     *
     * @return Назва одягу
     */
    public String getName() {
        return name;
    }

    /**
     * Метод отримання кольору одягу {@link Clothing#color}
     *
     * @return Колір одягу
     */
    public String getColor() {
        return color;
    }

    /**
     * Метод отримання вартості одягу {@link Clothing#totalcost}
     *
     * @return Вартість одягу
     */
    public Double getTotalCost() {
        return totalcost;
    }

    /**
     * Метод, який встановлює загальну вартість одягу, враховуючи тканину та фурнітуру.
     */
    public void setTotalcost() {
        if (furniture != null) {
            this.totalcost = fabric.getCostPerMeter() * fabricAmount
                + furniture.getCostPerPiece() * furnitureAmount;
        } else {
            this.totalcost = fabric.getCostPerMeter() * fabricAmount;
        }
    }
    /**
     * Перевизначений метод, який повертає рядкове представлення об'єкту одяг.
     *
     * @return Рядкове представлення об'єкту тканини
     */
    @Override
    public String toString() {
        return "[" + id + "] " + name + " Загальна вартість: " + totalcost;
    }

}
