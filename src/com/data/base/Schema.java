package com.data.base;

import java.util.List;
import java.util.Set;

/**
 * Created by amit on 3/10/16.
 */
public final class Schema {

    private List<Field> fields;

    public Schema(List<Field> fields) {
        this.fields = fields;
    }

    public List<Field> getFields() {
        return fields;
    }
}
