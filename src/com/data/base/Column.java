package com.data.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 3/10/16.
 */
public class Column {

    private Field field;

    private List<Object> values;

    public Column(Field field, List<Object> values) {
        // Initialize values
        values = new ArrayList<>();

        this.field = field;
        this.values = values;
    }

    public boolean addValue(Object value) {
        return values.add(value);
    }

    public void showColumn() {
        System.out.print(field.getFieldName() + values + " ");
    }
}
