package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        executeTasks();



    }

    public static void executeTasks() {
        // Healthplan nesnesi oluşturma
        Healthplan basicPlan = new Healthplan(1, "Basic Health Plan", Plan.BASIC);
        System.out.println(basicPlan.toString());

        // Employee nesnesi oluşturma
        String[] healthplans = new String[3]; // Maksimum 3 sağlık planı
        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123", healthplans);
        System.out.println(employee.toString());

        // Healthplan ekleme
        employee.addHealthplan(0, "Basic Health Plan");
        employee.addHealthplan(1, "Premium Health Plan");
        employee.addHealthplan(3, "Invalid Index Plan"); // Geçersiz index testi
        employee.addHealthplan(1, "Overwriting Test Plan"); // Doluluk kontrol testi

        // Company nesnesi oluşturma
        String[] developerNames = new String[5]; // Maksimum 5 çalışan
        Company company = new Company(1, "Tech Innovators", 100000, developerNames);
        System.out.println(company.toString());

        // Developer ekleme
        company.addEmployee(0, "Alice");
        company.addEmployee(1, "Bob");
        company.addEmployee(5, "Invalid Index Employee"); // Geçersiz index testi
        company.addEmployee(0, "Charlie"); // Doluluk kontrol testi
    }
}