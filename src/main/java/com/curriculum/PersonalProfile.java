package com.curriculum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class PersonalProfile {
    private String name;
    private LocalDate birthDate;
    private String nationality;
    private String civilStatus;
    private Address address;
    private String phoneNumber;
    private String email;
    private ProfessionalProfile professionalProfile;

    public Integer age() {
        Integer age = 0;
        if (LocalDate.now().getMonthValue() < this.getBirthDate().getMonthValue()) {
            age = LocalDate.now().getYear() - this.getBirthDate().getYear() - 1;
        } else if (LocalDate.now().getMonthValue() == this.getBirthDate().getMonthValue()) {
            if ((LocalDate.now().getDayOfMonth() < this.getBirthDate().getDayOfMonth())) {
                age = LocalDate.now().getYear() - this.getBirthDate().getYear() - 1;
            } else {
                age = LocalDate.now().getYear() - this.getBirthDate().getYear();
            }
        } else {
            age = LocalDate.now().getYear() - this.getBirthDate().getYear();
        }
        return age;
    }
}