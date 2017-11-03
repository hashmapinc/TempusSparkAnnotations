package com.hashmap.tempus.models;

public class SparkActionRequestType {
    private String mainClass;
    private String jar;
    private String[] args;

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String getJar() {
        return jar;
    }

    public void setJar(String jar) {
        this.jar = jar;
    }

    public String[] getArgs() {
        return args;
    }

    public String argsAsElements(){
        StringBuilder builder = new StringBuilder();
        for(String arg: args){
            if(arg.startsWith("--")){
                builder.append("\"");
                builder.append(arg);
                builder.append("\"");
            }else{
                builder.append(arg);
            }
            builder.append(",");
        }
        String argsString = builder.toString();
        return argsString.substring(0, argsString.length() - 1);
    }

    public void setArgs(String[] args) {
        this.args = args;
    }
}
