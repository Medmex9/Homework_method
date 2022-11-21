import java.time.LocalDate;

public class Main {
            public static void main(String[] args) {
                CalculationOfTheYear();
                Definition();
                Delivery();
            }

            public static void CalculationOfTheYear() {
                int year = 2024;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
            }

            public static void Definition() {
                int clientOS = 0; //0 ios, 1 android
                int clientDeviceYear = 2021;
                int currentYear = LocalDate.now().getYear();
                if (clientOS == 1) {
                    if (currentYear == 2022) {
                        System.out.println("Установите lite-версию для Android приложения");
                    } else {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                } else if (clientOS == 0) {

                    if (currentYear== 2022) {
                        System.out.println("Установите lite-версию для IOS приложения");
                    } else {
                        System.out.println("Установите версию приложения для IOS по ссылке");
                    }
                }

            }

            public static void Delivery() {

                int Distance = 40;
                int DeliveryTime = 1;
                if (Distance<20){
                    System.out.println(DeliveryTime);
                }
                else {
                    DeliveryTime += Math.ceil((Distance - 20)/40+1);
                    System.out.println("Доставка займёт " + DeliveryTime + " дня");

                }

            }

        }














