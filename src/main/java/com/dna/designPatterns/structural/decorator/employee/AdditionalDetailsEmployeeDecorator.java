package com.dna.designPatterns.structural.decorator.employee;

public class AdditionalDetailsEmployeeDecorator extends EmployeeDecorator {

    public AdditionalDetailsEmployeeDecorator(Employee customEmployee) {
        super(customEmployee);
    }

    public String getFullName() {
        return new StringBuilder(customEmployee.getFirstName())
                .append(", ")
                .append(customEmployee.getLastName())
                .toString();
    }

    public String getGreetName() {
        StringBuilder sb = new StringBuilder();
        switch (customEmployee.getGender()){
            case MALE:
                sb.append("Master/ Mr. ");
                break;
            case FEMALE:
                sb.append("Miss/ Mrs. ");
                break;
            default:
                throw new RuntimeException("Invalid gender");
        }

        return sb.append(customEmployee.getFirstName())
                .toString();
    }
}
