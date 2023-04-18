package org.launchcode.studio7;

public class CD extends BaseDisc {
    static private Double maxStorage = 1000.00;
    public CD(String name, double storageCapacity, String contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public void write(String data) {

    }

    @Override
    public void turnLaserOn() {
        System.out.println("Laser has been turned on and ready to read or store data.");
    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
