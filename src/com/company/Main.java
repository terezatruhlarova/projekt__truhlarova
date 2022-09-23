package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vítejte v mé aplikaci umím dělat 4 věci, vyber si co chceš dělat:");
        System.out.println("Palindrom - 1");
        System.out.println("Obchod - 2");
        System.out.println("Kalkulačka - 3");
        System.out.println("KVÍZ - 4");

        int categori = Integer.parseInt(sc.nextLine());

        if (categori == 1) {
            System.out.println("Vybral jste si palindrom, napište jakékoliv slovo");
            String word = sc.nextLine();
            String str = word, reverseStr = "";

            int strLength = str.length();

            for (int i = (strLength - 1); i >= 0; --i) {
                reverseStr = reverseStr + str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " ano, toto slovo je Palindrom.");
            } else {
                System.out.println(str + " Ne, toto slovo není palindom.");
            }


        } else if (categori == 2) {
            System.out.println("Výtejte v mém obchodě");
            int cena = 0;
            boolean end = false;
            do {
                System.out.println("Telefony - 1");
                System.out.println("Příslušenství - 2");
                System.out.println("Platit - 3");
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Iphone XR - 1");
                        System.out.println("Iphone 12 - 2");
                        System.out.println("Iphone 12 mini - 3");
                        int knife = sc.nextInt();
                        switch (knife) {
                            case 1:
                                System.out.println("iphone XR byl přídán do tvého košíku +550$");
                                cena += 550;
                                break;
                            case 2:
                                System.out.println("Iphone 12 byl přídán do tvého košíku +900$");
                                cena += 900;
                                break;
                            case 3:
                                System.out.println("Iphone 12 mini byl přídán do tvého košíku +850$");
                                cena += 850;
                                break;
                            default:
                                System.out.println("Položka není na trhu");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Nabíječka - 1");
                        System.out.println("Sluchátka - 2");
                        System.out.println("Obal na telefon - 3");
                        System.out.println("");
                        int ak = sc.nextInt();
                        switch (ak) {
                            case 1:
                                System.out.println("Nabíječka bylo přídáno do tvého košíku +20$");
                                cena += 20;
                                break;
                            case 2:
                                System.out.println("Sluchátka bylo přídáno do tvého košíku +30$");
                                cena += 30;
                                break;
                            case 3:
                                System.out.println("Obal na telefon bylo přídáno do tvého košíku +15$");
                                cena += 15;
                                break;
                            default:
                                System.out.println("Položka není na trhu");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Vyuctovani..");
                        end = true;
                        break;
                    default:
                        System.out.println("Pokožka neexistuje");
                        break;
                }

            } while (!end);
            System.out.println("Celkem jste utratil: " + cena + "$");
        } else if (categori == 3) {
            System.out.println("Vítejte v kalkulačce");
            System.out.println("Zadejte První číslo");
            int num1 = sc.nextInt();
            System.out.println("Zadejte druhé číslo");
            int num2 = sc.nextInt();
            System.out.println("Zadejte početní operaci");
            System.out.println("Sčítání - 1");
            System.out.println("Odčítání - 2");
            System.out.println("Násobení - 3");
            System.out.println("Dělení - 4");
            int cat = sc.nextInt();
            if (cat == 1) {
                System.out.println("Výsledek je:" + (num1 + num2));
            } else if (cat == 2) {
                System.out.println("Výsledek je:" + (num1 - num2));
            } else if (cat == 3) {
                System.out.println("Výsledek je:" + (num1 * num2));
            } else if (cat == 4) {
                System.out.println("Výsledek je: " + (num1 / num2));
            } else {
                System.out.println("ERROR");
            }
        } else if (categori == 4) {
            int Body = 0;

            System.out.println("je Brno hlavní město České republiky?");
            String Town = sc.nextLine();

            if (Town.equalsIgnoreCase("ano")) {
                System.out.println("toto není správná odpověď + 0 bodů");
            } else {
                System.out.println("ano toto je správná odpověď +1 bod");
                Body++;
            }

            System.out.println("patří delfín mezi savce?");
            String Animal = sc.nextLine();

            if (Animal.equalsIgnoreCase("ano")) {
                System.out.println("ano toto je správná odpověď +1 bod");
                Body++;
            } else {
                System.out.println("toto není správná odpověď + 0 bodů");
            }

            System.out.println("vyšel film Titanic v roce 1997? ");
            String Movie = sc.nextLine();

            if (Movie.equalsIgnoreCase("ano")) {
                System.out.println("ano toto je správná odpověď +1 bod");
                Body++;
            } else {
                System.out.println("toto není správná odpověď + 0 bodů");
            }

            System.out.println("je Andrew Tate top g?");
            String Tate = sc.nextLine();

            if (Tate.equalsIgnoreCase("ano")) {
                System.out.println("toto není správná odpověď + 0 bodů");
            } else {
                System.out.println("ano toto je správná odpověď +1 bod");
                Body++;
            }

            System.out.println("je lolko debilní hra?");
            String Game = sc.nextLine();

            if (Game.equalsIgnoreCase("ano")) {
                System.out.println("ano toto je správná odpověď +1 bod");
                Body++;
            } else {
                System.out.println("toto není správná odpověď + 0 bodů");
            }

            System.out.println("váš počet bodů " + " " + Body);
        }

    }}

