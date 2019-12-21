package com.curriculum;

import java.time.LocalDate;

public class DisplayProfile {
    public static void displayProfile(PersonalProfile personalProfile) {
        System.out.println(personalProfile.getName());
        System.out.println(personalProfile.age().toString() + " anos" + " - " + personalProfile.getNationality() + " - " + personalProfile.getCivilStatus());
        System.out.println(personalProfile.getAddress().getCity() + ", " + personalProfile.getAddress().getState().getState() + " - " + personalProfile.getAddress().getCountry());
        System.out.println("Tel.:" + personalProfile.getPhoneNumber() + " - " + personalProfile.getEmail());

        System.out.println("\nObjetivo");
        System.out.println(personalProfile.getProfessionalProfile().getObjective());

        System.out.println("\nPerfil Profissional");
        for (String ability : personalProfile.getProfessionalProfile().getAbilities()) {
            System.out.println(ability);
        }

        System.out.println("\nPrincipais Competências");
        for (String mainSkill : personalProfile.getProfessionalProfile().getMainSkills()) {
            if (mainSkill.equals(personalProfile.getProfessionalProfile().getMainSkills().get(personalProfile.getProfessionalProfile().getMainSkills().size() - 1))) {
                System.out.println("- " + mainSkill + ".\n");
            } else if ((mainSkill.equals(personalProfile.getProfessionalProfile().getMainSkills().get(personalProfile.getProfessionalProfile().getMainSkills().size() - 2)))) {
                System.out.println("- " + mainSkill + " e");
            } else {
                System.out.println("- " + mainSkill + ";");
            }
        }

        System.out.println("\nFormação Acadêmica");
        for (AcademicBackground academicBackground : personalProfile.getProfessionalProfile().getAcademicBackgrounds()) {
            System.out.print(academicBackground.getType().getType() + " em " + academicBackground.getCourse().getCourse());
            System.out.print(" - " + academicBackground.getInstitutionName().getInstitution() + " - " + academicBackground.getInstitutionAddress().getCity() + "/" + academicBackground.getInstitutionAddress().getState().getStateInitials() + " - ");
            if (academicBackground.getStatus().equals(Status.COMPLETED)) {
                System.out.print(academicBackground.getStatus().getStatus() + " em " + academicBackground.getConclusionYear() + "\n");
            } else {
                System.out.print(academicBackground.getStatus().getStatus() + " até " + academicBackground.getConclusionYear() + "\n");
            }
        }

        System.out.println("\nIdiomas");
        for (SpokenLanguage spokenLanguage: personalProfile.getProfessionalProfile().getSpeakLanguages()) {
            System.out.println(spokenLanguage.getLanguage() + " - " + spokenLanguage.getFluency());
        }

        System.out.println("\nHistórico Profissional");
        for (ProfessionalExperience professionalExperience : personalProfile.getProfessionalProfile().getProfessionalExperiences()) {
            System.out.print(professionalExperience.getCompany() + " - " + professionalExperience.getCompanyAddress().getCity() + "/" + professionalExperience.getCompanyAddress().getState().getStateInitials() + " - ");
            if (professionalExperience.getDeparture() == null) {
                System.out.print("Atual desde " + brazilianLocalDate(professionalExperience.getEntry()) + "/" + professionalExperience.getEntry().getYear() + ".\n");
            } else {
                System.out.print("De " + brazilianLocalDate(professionalExperience.getEntry()) + "/" + professionalExperience.getEntry().getYear()
                                       + " a "
                                       + brazilianLocalDate(professionalExperience.getDeparture()) + "/" + professionalExperience.getDeparture().getYear() + ".\n");
            }
            System.out.println(professionalExperience.getPosition() + ".");
            if (professionalExperience.getActivities() != null && !professionalExperience.getActivities().isEmpty()) {
                System.out.println("Atividades: ");
                for (String activity : professionalExperience.getActivities()) {
                    if (activity.equals(professionalExperience.getActivities().get(professionalExperience.getActivities().size() - 1))) {
                        System.out.println("- " + activity + ".\n");
                    } else if ((activity.equals(professionalExperience.getActivities().get(professionalExperience.getActivities().size() - 2)))) {
                        System.out.println("- " + activity + " e");
                    } else {
                        System.out.println("- " + activity + ";");
                    }
                }
            }
            else {
                System.out.println();
            }
        }
    }

    public static String brazilianLocalDate(LocalDate localDate) {
        switch (localDate.getMonth()) {
            case JANUARY:
                return "Janeiro";
            case FEBRUARY:
                return "Fevereiro";
            case MARCH:
                return "Março";
            case APRIL:
                return "Abril";
            case MAY:
                return "Maio";
            case JUNE:
                return "Junho";
            case JULY:
                return "Julho";
            case AUGUST:
                return "Agosto";
            case SEPTEMBER:
                return "Setembro";
            case OCTOBER:
                return "Outubro";
            case NOVEMBER:
                return "Novembro";
            case DECEMBER:
                return "Dezembro";
            default:
                return "";
        }
    }
}