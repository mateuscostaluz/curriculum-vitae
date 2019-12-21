package com.curriculum;

public enum Status {
    COMPLETED,
    CURSING;

    public String getStatus() {
        switch (this) {
            case COMPLETED:
                return "Concluído";
            case CURSING:
                return "Cursando";
            default:
                return "";
        }
    }
}