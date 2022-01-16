package com.telecode.mt.frontend;

import com.telecode.mt.localization.Localization;

import java.util.Scanner;

public class UserInterface {
    public void run() {
        System.out.println("Aplikacja jest uruchomiona.\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Witaj w serwisie pogodowym, co chcesz zrobić?");
            System.out.println("1. Dodać nową lokalizację");
            System.out.println("2. Wyświetlić wszystkie lokalizacje");
            System.out.println("3. Pobrać wartości pogodowe");
            System.out.println("0. Zamknąć aplikację");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createLocalization();
                    break;
                case 2:
                    getAllLocalizations();
                    break;
                case 3:
                    getWeather();
                    break;
                case 0:
                    return;
            }
            System.out.println();
        }
    }

    private void getWeather() {
    }

    private void getAllLocalizations() {
    }

    private void createLocalization() {
    }
}
