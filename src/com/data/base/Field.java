package com.data.base;

/**
 * Created by amit on 3/10/16.
 */
public final class Field {

    private String fieldName;

    private String fieldType;

    private Boolean nullable = true;

    public Field(String fieldName, String fieldType, Boolean nullable) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.nullable = nullable;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public Boolean getNullable() {
        return nullable;
    }
}
