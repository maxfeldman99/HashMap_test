import java.util.ArrayList;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Car, Driver> map = new HashMap<>();

        Car a = new Car("red", 99);
        Car b = new Car("blue", 73);
        Car c = new Car("white", 73);
        Car d = new Car("red", 94);
        Car e = new Car("green", 2002);
        Car f = new Car("white", 2018);

        Driver driver1 = new Driver("Max", 3);
        Driver driver2 = new Driver("Michael", 25);
        Driver driver3 = new Driver("Eddie", 5);
        Driver driver4 = new Driver("Nir", 1);
        Driver driver5 = new Driver("Adam", 17);
        Driver driver6 = new Driver("Yossi", 13);

        map.put(a, driver1);
        map.put(b, driver2);
        map.put(f, driver3);
        map.put(e, driver4);
        map.put(d, driver5);
        map.put(c, driver6);

        Collection<Driver> drivers = map.values();
    ArrayList<Driver> driversList = new ArrayList<>(drivers);
        System.out.println("before sort:");

                for (Driver h:driversList){
                System.out.println(h);
                }
                Collections.sort(driversList);   // natural order sort
                System.out.println("after sort:");
                for (Driver h:driversList){
                System.out.println(h);
                }

                Collections.sort(driversList,new DriverNameComparator());   // to sort the name
                System.out.println("after sort using name comparator:");
                for (Driver h:driversList){
                System.out.println(h);
                }


                }
                }



