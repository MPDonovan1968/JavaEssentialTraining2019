package com.company.model;

public enum ClothingSize {
    S( description: "Small"), M( description: "Medium"), L( description: "Large"), XL( description: "Xtra Large");
    private String description;

    ClothingSize(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
