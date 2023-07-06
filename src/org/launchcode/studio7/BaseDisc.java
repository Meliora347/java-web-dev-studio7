package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStorage() {
        return maxStorage;
    }

    public void setMaxStorage(int maxStorage) {
        this.maxStorage = maxStorage;
    }

    public int getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(int storageUsed) {
        this.storageUsed = storageUsed;
    }

    private int maxStorage;
    private int storageUsed;

    public BaseDisc(String name, int maxStorage, int storageUsed) {
        this.name = name;
        this.maxStorage = maxStorage;
        this.storageUsed = storageUsed;
    }
}
