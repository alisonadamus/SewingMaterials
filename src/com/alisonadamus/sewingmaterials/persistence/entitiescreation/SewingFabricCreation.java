package com.alisonadamus.sewingmaterials.persistence.entity.entitiescreation;

import com.alisonadamus.sewingmaterials.persistence.entity.SewingFabric;
import java.util.ArrayList;
import java.util.List;

public class SewingFabricCreation implements CreateEntities {
    List<SewingFabric> sewingFabricList;
    @Override
    public void createObjects() {
        sewingFabricList = new ArrayList<>(List.of(
                new SewingFabric("Бавовна", "Червоний", 240, 73.25),
                new SewingFabric("Бавовна", "Зелений", 250, 73.25),
                new SewingFabric("Бавовна", "Фіолетовий", 240, 73.25),
                new SewingFabric("Шовк", "Чорний", 160, 351),
                new SewingFabric("Шовк", "Білий", 165, 351),
                new SewingFabric("Шовк", "Бежевий", 160, 351),
                new SewingFabric("Шовк", "Червоний", 160, 351),
                new SewingFabric("Трикотаж", "Чорний", 240, 98.5),
                new SewingFabric("Трикотаж", "Фіолетовий", 235, 98.5),
                new SewingFabric("Трикотаж", "Блакитний", 235, 98.5),
                new SewingFabric("Денім", "Чорний", 280, 64),
                new SewingFabric("Денім", "Синій", 280, 64),
                new SewingFabric("Денім", "Блакитний", 280, 64),
                new SewingFabric("Атлас", "Синій", 200, 210.45),
                new SewingFabric("Атлас", "Білий", 200, 210.45),
                new SewingFabric("Атлас", "Рожевий", 200, 210.45),
                new SewingFabric("Гіпюр", "Білий", 230, 188.8),
                new SewingFabric("Гіпюр", "Чорний", 230, 188.8),
                new SewingFabric("Гіпюр", "Червоний", 200, 188.8),
                new SewingFabric("Гіпюр", "Синій", 200, 188.8),
                new SewingFabric("Шифон", "Білий", 270, 119.9),
                new SewingFabric("Шифон", "Чорний", 270, 119.9)));
    }

    @Override
    public List<SewingFabric> getObjects() {
        return sewingFabricList;
    }
}
