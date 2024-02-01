package com.alisonadamus.sewingmaterials.persistence.entitiescreation;

import com.alisonadamus.sewingmaterials.persistence.entity.Furniture;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас для створення об'єктів фурнітури {@link Furniture}. Реалізує інтерфейс
 * {@link CreateEntities}.
 */
public class FurnitureCreation implements CreateEntities<Furniture> {

    /**
     * Створює об'єкти фурнітури з заданими даними.
     *
     * @return Список створених об'єктів фурнітури.
     */
    @Override
    public List<Furniture> createdObjects() {
        return new ArrayList<>(List.of(new Furniture("Замок-блискавка", 130, 67),
            new Furniture("Дрібний металевий гудзик", 400, 5.5),
            new Furniture("Дрібний дерев'яний гудзик", 400, 5.5),
            new Furniture("Середній металевий гудзик", 400, 6.9),
            new Furniture("Середній дерев'яний гудзик", 400, 6.9),
            new Furniture("Золота стрічка(1м)", 170, 18),
            new Furniture("Срібна стрічка(1м)", 170, 28),
            new Furniture("Біла стрічка(1м)", 170, 18), new Furniture("Синя стрічка(1м)", 170, 18),
            new Furniture("Червона стрічка(1м)", 170, 18),
            new Furniture("Срібні намистини (набір)", 125, 35),
            new Furniture("Коралові намистини (набір)", 125, 35),
            new Furniture("Різнокольорові намистини (набір)", 125, 35),
            new Furniture("Різнокольорові стрази (набір)", 125, 35),
            new Furniture("Білий перламутр", 80, 59), new Furniture("Рожевий перламутр", 80, 59),
            new Furniture("Бежевий перламутр", 80, 59)));
    }
}
