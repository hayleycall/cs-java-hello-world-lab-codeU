package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        Double version = Double.parseDouble(System.getProperty("java.specification.version"));
        return version;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
	    Double version = getVersion();
	    System.out.println(version);
    }
}
