package com.curriculum;

public enum State {
    ACRE,
    ALAGOAS,
    AMAPA,
    AMAZONAS,
    BAHIA,
    CEARA,
    DISTRITOFEDERAL,
    ESPIRITOSANTO,
    GOIAS,
    MARANHAO,
    MATOGROSSO,
    MATOGROSSODOSUL,
    MINASGERAIS,
    PARA,
    PARAIBA,
    PARANA,
    PERNAMBUCO,
    PIAUI,
    RIODEJANEIRO,
    RIOGRANDEDONORTE,
    RIOGRANDEDOSUL,
    RONDONIA,
    RORAIMA,
    SANTACATARINA,
    SAOPAULO,
    SERGIPE,
    TOCANTINS;

    public String getState() {
        switch (this) {
            case ACRE:
                return "Acre";
            case ALAGOAS:
                return "Alagoas";
            case AMAPA:
                return "Amapá";
            case AMAZONAS:
                return "Amazonas";
            case BAHIA:
                return "Bahia";
            case CEARA:
                return "Ceará";
            case DISTRITOFEDERAL:
                return "Distrito Federal";
            case ESPIRITOSANTO:
                return "Espírito Santo";
            case GOIAS:
                return "Goiás";
            case MARANHAO:
                return "Maranhão";
            case MATOGROSSO:
                return "Mato Grosso";
            case MATOGROSSODOSUL:
                return "Mato Grosso do Sul";
            case MINASGERAIS:
                return "Minas Gerais";
            case PARA:
                return "Pará";
            case PARAIBA:
                return "Paraíba";
            case PARANA:
                return "Paraná";
            case PERNAMBUCO:
                return "Pernambuco";
            case PIAUI:
                return "Piauí";
            case RIODEJANEIRO:
                return "Rio de Janeiro";
            case RIOGRANDEDONORTE:
                return "Rio Grande do Norte";
            case RIOGRANDEDOSUL:
                return "Rio Grande do Sul";
            case RONDONIA:
                return "Rondônia";
            case RORAIMA:
                return "Roraima";
            case SANTACATARINA:
                return "Santa Catarina";
            case SAOPAULO:
                return "São Paulo";
            case SERGIPE:
                return "Sergipe";
            case TOCANTINS:
                return "Tocantins";
            default:
                return "";
        }
    }

    public String getStateInitials() {
        switch (this) {
            case ACRE:
                return "AC";
            case ALAGOAS:
                return "AL";
            case AMAPA:
                return "AP";
            case AMAZONAS:
                return "AM";
            case BAHIA:
                return "BA";
            case CEARA:
                return "CE";
            case DISTRITOFEDERAL:
                return "DF";
            case ESPIRITOSANTO:
                return "ES";
            case GOIAS:
                return "GO";
            case MARANHAO:
                return "MA";
            case MATOGROSSO:
                return "MT";
            case MATOGROSSODOSUL:
                return "MS";
            case MINASGERAIS:
                return "MG";
            case PARA:
                return "PA";
            case PARAIBA:
                return "PB";
            case PARANA:
                return "PR";
            case PERNAMBUCO:
                return "PE";
            case PIAUI:
                return "PI";
            case RIODEJANEIRO:
                return "RJ";
            case RIOGRANDEDONORTE:
                return "RN";
            case RIOGRANDEDOSUL:
                return "RS";
            case RONDONIA:
                return "RO";
            case RORAIMA:
                return "RR";
            case SANTACATARINA:
                return "SC";
            case SAOPAULO:
                return "SP";
            case SERGIPE:
                return "SE";
            case TOCANTINS:
                return "TO";
            default:
                return "";
        }
    }
}