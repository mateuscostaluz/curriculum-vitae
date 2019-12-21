package com.curriculum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@AllArgsConstructor
@Getter
@Setter
public class ProfessionalProfile {
    private String objective;
    private LinkedList<String> abilities;
    private LinkedList<String> mainSkills;
    private LinkedList<AcademicBackground> academicBackgrounds;
    private LinkedList<ProfessionalExperience> professionalExperiences;
    private LinkedList<SpokenLanguage> speakLanguages;
}