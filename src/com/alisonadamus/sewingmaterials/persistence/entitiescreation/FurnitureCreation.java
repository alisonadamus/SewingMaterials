package com.alisonadamus.sewingmaterials.persistence.entity.entitiescreation;

import com.alisonadamus.sewingmaterials.persistence.entity.Furniture;
import java.util.ArrayList;
import java.util.List;

public class FurnitureCreation implements CreateEntities {
    private List<Furniture> furnitureList;
    @Override
    public void createObjects() {
        furnitureList = new ArrayList<>(List.of(
            new Furniture("Нитка біла(200м)", 250, 9.5),
            new Furniture("Нитка чорна(200м)", 250, 9.5),
            new Furniture("Нитка червона(200м)", 250, 9.5),
            new Furniture("Нитка синя(200м)", 250, 9.5),
            new Furniture("Нитка бежева(150м)", 205, 7.25),
            new Furniture("Нитка рожева(150м)", 205, 7.25),
            new Furniture("Нитка фіолетова(150м)", 205, 7.25),
            new Furniture("Нитка зелена(150м)", 205, 7.25),
            new Furniture("Нитка блакитна(150м)", 205, 7.25),
            new Furniture("Замок-блискавка", 130, 67),
            new Furniture("Дрібний гудзик", 400, 5.5),
            new Furniture("Середній гудзик", 400, 6.9),
            new Furniture("Чорна стрічка(1м)", 170, 18),
            new Furniture("Синя стрічка(1м)", 170, 18),
            new Furniture("Червона стрічка(1м)", 170, 18),
            new Furniture("Набір срібних стразів", 125, 35),
            new Furniture("Набір коралових намистин", 125, 35),
            new Furniture("Білий перламутр", 80, 59),
            new Furniture("Рожевий перламутр", 80, 59),
            new Furniture("Бежевий перламутр", 80, 59)));
    }

    @Override
    public List<Furniture> getObjects() {
        return furnitureList;
    }
}
