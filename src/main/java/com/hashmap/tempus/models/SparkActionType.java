package com.hashmap.tempus.models;

public class SparkActionType {
    private String className;
    private String name;
    private String descriptor;
    private SparkActionConfigurationType configuration;
    private SparkActionRequestType request;
    private String packageName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public SparkActionConfigurationType getConfiguration() {
        return configuration;
    }

    public void setConfiguration(SparkActionConfigurationType configuration) {
        this.configuration = configuration;
    }

    public SparkActionRequestType getRequest() {
        return request;
    }

    public void setRequest(SparkActionRequestType request) {
        this.request = request;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SparkActionType)) return false;

        SparkActionType that = (SparkActionType) o;

        if (!getClassName().equals(that.getClassName())) return false;
        if (!getName().equals(that.getName())) return false;
        if (!getDescriptor().equals(that.getDescriptor())) return false;
        return getConfiguration().equals(that.getConfiguration());
    }

    @Override
    public int hashCode() {
        int result = getClassName().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getDescriptor().hashCode();
        result = 31 * result + getConfiguration().hashCode();
        return result;
    }
}
