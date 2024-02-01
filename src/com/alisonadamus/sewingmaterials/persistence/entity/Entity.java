package com.alisonadamus.sewingmaterials.persistence.entity;

import com.alisonadamus.sewingmaterials.persistence.entityservise.UniqueIDForEntity;

/**
 * Абстрактний базовий клас для сутностей.
 */
public abstract class Entity {

    /**
     * Унікальний генератор ідентифікаторів для всіх сутностей.
     */
    protected static final UniqueIDForEntity uniqueIDForEntity = new UniqueIDForEntity();
    /**
     * Унікальний ідентифікатор сутності.
     */
    protected String id;

    /**
     * Конструктор класу Entity, генерує новий унікальний ідентифікатор.
     */
    protected Entity() {
        this.id = uniqueIDForEntity.generateNewID();
    }
}
