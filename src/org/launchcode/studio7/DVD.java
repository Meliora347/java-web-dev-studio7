package org.launchcode.studio7;

    public class DVD extends BaseDisc implements OpticalDisc {

        public DVD(String name, int maxStorage, int storageUsed) {
            super(name, maxStorage, storageUsed);
        }

        @Override
        public void spinDisc() {
            System.out.println("This DVD spins FAST!");

        }
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


