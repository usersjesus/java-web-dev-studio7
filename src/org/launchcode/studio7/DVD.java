package org.launchcode.studio7;

public class DVD extends BaseDisc {
    public DVD(String name, double storageCapacity, String contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {

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

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
