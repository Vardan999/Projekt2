package com.company;

public class Main {

    public static void main(String[] args) {


        class Quarter {
            private int widht;


            Quarter() {
                this.widht = 0;
            }

            public int parr(int withd) {
                this.widht = withd;
                int par = withd;
                return 4 * par;
            }


            public void setWidht(int widht) {
                this.widht = widht;

            }
        }


        class Triangle {
            private int a;
            private int b;
            private int c;


            Triangle() {
                this.a = 0;
                this.b = 0;
                this.c = 0;
            }

            public int perimeter(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;

                int par = a + b + c;
                return par;
            }

            public void setParimetr(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }


        }

        class InfoAbout {
            private int birthNumber;
            private String name;
            private String lastName;

            InfoAbout() {
                this.birthNumber = 0;
                this.name = name;
                this.lastName = lastName;
            }

            public int calculaterAge(int birthNumber) {
                int year = 2022;
                int age = year - birthNumber;
                return age;

            }

            public String names(String name) {
                this.name = name;
                return name;
            }

            public String lastNames(String LastName) {
                this.lastName = lastName;
                return LastName;
            }

        }

        Quarter quarter1 = new Quarter();

        System.out.println(quarter1.parr(20));
        quarter1.setWidht(15);


        Triangle triangle1 = new Triangle();
        System.out.println(triangle1.perimeter(5, 5, 5));

        InfoAbout infoAbout1 = new InfoAbout();
        System.out.println(infoAbout1.calculaterAge(1999));
        System.out.println(infoAbout1.names("Vardan"));
        System.out.println(infoAbout1.lastNames("Khublaryan"));
    }

}

