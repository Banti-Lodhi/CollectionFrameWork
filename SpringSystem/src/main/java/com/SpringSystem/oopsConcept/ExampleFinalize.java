package com.SpringSystem.oopsConcept;

public class ExampleFinalize {
    private String resource;
    public ExampleFinalize(String resource) {
        this.resource = resource;
    }


    @Override
    protected void finalize() throws Throwable {
        try {
            // Simulating resource cleanup, like closing a file
            System.out.println("Cleaning up resource: " + resource);
        } finally {
            super.finalize();  // It's important to call the parent class's finalize
        }
    }

    public static void main(String[] args) {
        ExampleFinalize x1 = new ExampleFinalize("File 1");
        ExampleFinalize x2 = new ExampleFinalize("File 2");
        //nullify reference to object
        x1=null;
        x2=null;
        System.gc(); //This is a just a hint, gc may run immediately
    }
    }


