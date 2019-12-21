package com.curriculum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@AllArgsConstructor
@Getter
@Setter
public class AcademicBackground {
    private Institution institutionName;
    private Address institutionAddress;
    private Type type;
    private Course course;
    private Status status;
    private Year conclusionYear;
}