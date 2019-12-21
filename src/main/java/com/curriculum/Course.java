package com.curriculum;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Course {
    ACCOUNTING,
    ACCOUNTINGSCIENCES,
    DATABASE;

    public String getCourse() {
        switch (this) {
            case ACCOUNTING:
                return "Contabilidade";
            case ACCOUNTINGSCIENCES:
                return "Ciências Contábeis";
            case DATABASE:
                return "Banco de Dados";
            default:
                return "";
        }
    }
}