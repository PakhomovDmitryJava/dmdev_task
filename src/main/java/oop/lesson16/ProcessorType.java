package oop.lesson16;

public enum ProcessorType implements Describable {
    BIT_32("BI_32"),
    BIT_64("BI_64");

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return name + " description.";
    }
}
