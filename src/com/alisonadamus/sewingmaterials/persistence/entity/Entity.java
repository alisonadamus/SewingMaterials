package com.alisonadamus.sewingmaterials.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {

    protected List<String> errors;

    protected Entity() {
        errors = new ArrayList<>();
    }
}
