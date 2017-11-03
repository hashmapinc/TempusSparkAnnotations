package com.hashmap.tempus.models;

import java.util.HashMap;
import java.util.Map;

public class SparkActionConfigurationType {
    private String className;
    private Map<String, String> fields = new HashMap<>();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Map<String, String> getFields() {
        return fields;
    }

    public void addField(String key, String value) {
        this.fields.putIfAbsent(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SparkActionConfigurationType)) return false;

        SparkActionConfigurationType that = (SparkActionConfigurationType) o;

        if (!getClassName().equals(that.getClassName())) return false;
        return getFields().equals(that.getFields());
    }

    @Override
    public int hashCode() {
        int result = getClassName().hashCode();
        result = 31 * result + getFields().hashCode();
        return result;
    }
}
