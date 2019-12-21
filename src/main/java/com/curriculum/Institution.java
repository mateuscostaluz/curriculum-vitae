package com.curriculum;

public enum Institution {
    ETEC,
    BILAC,
    FATEC;

    public String getInstitution() {
        switch (this) {
            case ETEC:
                return "Escola Técnica Estadual (ETEC)";
            case BILAC:
                return "Faculdade Bilac";
            case FATEC:
                return "Faculdade de Tecnologia (FATEC)";
            default:
                return "";
        }
    }
}