package com.company.model;

public enum ClothingSize {
    S( "Small"), M( "Medium"), L( "Large"), XL( "Xtra Large"), XXL("Double X");
    private String description;

    ClothingSize(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
