package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDiscs {
    private String name;
    private double storageCapacityGB;
    private String contents;
    private String discType;

    public BaseDisc(String name, double storageCapacity, String contents, String discType) {
        this.name = name;
        this.storageCapacityGB = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageCapacity() {
        return storageCapacityGB;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacityGB = storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = this.contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

}
