package com.data.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by amit on 3/10/16.
 */
public class Table {

    private List<Column> columns;

    public Table(Schema schema, List<Object> values) {
        List<Field> fields = schema.getFields();
        new Table(fields, values);
    }

    private Table(List<Field> fields, List<Object> values) {
        // Initializing columns
        columns = fields.stream().map(field -> new Column(field, null)).collect(Collectors.toList());

        // Add rows to the table if values are not null
        if (values != null) {
            for (int index = 0; index < values.size(); index++) {
                columns.get(index).addValue(values.get(index));
            }
        }
    }

    public static void main(String[] args) {
        Field f1 = new Field("empId", "int", false);
        Field f2 = new Field("empName", "varchar", false);

        Schema s1 = new Schema(Arrays.asList(f1, f2));
        Table t1 = new Table(s1,null);
    }
}
