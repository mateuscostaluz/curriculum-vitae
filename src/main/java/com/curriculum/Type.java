package com.curriculum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Type {
    TECHNICAL,
    BACHELOR,
    TECHNOLOGIST;

    public String getType() {
        switch (this) {
            case TECHNICAL:
                return "Técnico";
            case BACHELOR:
                return "Bacharel";
            case TECHNOLOGIST:
                return "Tecnólogo";
            default:
                return "";
        }
    }
}