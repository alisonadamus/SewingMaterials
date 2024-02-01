package com.alisonadamus.sewingmaterials.persistence.entitiescreation;

import java.util.List;

/**
 * Інтерфейс для створення об'єктів типу T.
 *
 * @param <T> Тип об'єкта, який слід створити.
 */
public interface CreateEntities<T> {

    /**
     * Створює список об'єктів типу T.
     *
     * @return Список створених об'єктів.
     */
    public List<T> createdObjects();
}
