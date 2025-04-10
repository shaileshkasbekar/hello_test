/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
class Vehicle {
    String a;
    int b;

    public Vehicle(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public void showDetails() {
        System.out.println("This is a " + a + " vehicle.");
    }

    public void move() {
        System.out.println(a + " is moving at " + b + " km/h.");
    }
}

class Car extends Vehicle {
    int c;

    public Car(String a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public void showDetails() {
        System.out.println("This is a " + a + " car with " + c + " doors.");
    }

    public void honkHorn() {
        System.out.println(a + " car is honking!");
    }
}

class Truck extends Vehicle {
    int d;

    public Truck(String a, int b, int d) {
        super(a, b);
        this.d = d;
    }

    @Override
    public void showDetails() {
        System.out.println("This is a " + a + " truck with a cargo capacity of " + d + " tons.");
    }

    public void loadCargo() {
        System.out.println(a + " truck is loading cargo.");
    }
}

class Motorcycle extends Vehicle {
    boolean e;

    public Motorcycle(String a, int b, boolean e) {
        super(a, b);
        this.e = e;
    }

    @Override
    public void showDetails() {
        String f = e ? "with a sidecar" : "without a sidecar";
        System.out.println("This is a " + a + " motorcycle " + f + ".");
    }

    public void doStunt() {
        System.out.println(a + " motorcycle is doing a wheelie!");
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle x = new Car("T", 120, 4);
        Vehicle y = new Truck("V", 80, 10);
        Vehicle z = new Motorcycle("H", 150, true);

        x.showDetails();
        y.showDetails();
        z.showDetails();

        x.move();
        y.move();
        z.move();

        Car p = (Car) x;
        Truck q = (Truck) y;
        Motorcycle r = (Motorcycle) z;

        p.honkHorn();
        q.loadCargo();
        r.doStunt();
    }
}
