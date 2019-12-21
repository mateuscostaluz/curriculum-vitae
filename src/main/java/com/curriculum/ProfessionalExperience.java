package com.curriculum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class ProfessionalExperience {
    private String company;
    private Address companyAddress;
    private String position;
    private ArrayList<String> activities;
    private LocalDate entry;
    private LocalDate departure;
}