package com.hashmap.tempus.models;

public class SparkActionType {
    private String className;
    private String name;
    private String descriptor;
    private SparkActionConfigurationType configuration;
    private SparkActionRequestType request;
    private String packageName;
    private String applicationKey;

    /**
     * The name of the Spark Application
     * @return The name of the Spark Application
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description of the spark application
     * @return a description of the spark application
     */
    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    /**
     * The class name of the application
     *  @return the class name of the applciation
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * The application configuration type
     * @return the application configuration type.]
     */
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

    /**
     * The application key or name
     * @return the application key to identify application.]
     */
    public String getApplicationKey() {
        return applicationKey;
    }

    public void setApplicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SparkActionType)) return false;

        SparkActionType that = (SparkActionType) o;

        if (!getClassName().equals(that.getClassName())) return false;
        if (!getName().equals(that.getName())) return false;
        if (!getDescriptor().equals(that.getDescriptor())) return false;
        if (!getConfiguration().equals(that.getConfiguration())) return false;
        if (!getRequest().equals(that.getRequest())) return false;
        if (!getPackageName().equals(that.getPackageName())) return false;
        return getApplicationKey().equals(that.getApplicationKey());
    }

    @Override
    public int hashCode() {
        int result = getClassName().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getDescriptor().hashCode();
        result = 31 * result + getConfiguration().hashCode();
        result = 31 * result + getRequest().hashCode();
        result = 31 * result + getPackageName().hashCode();
        result = 31 * result + getApplicationKey().hashCode();
        return result;
    }
}
