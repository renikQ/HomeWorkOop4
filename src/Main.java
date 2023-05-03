import driver.DriverB;
import transport.*;

import java.time.LocalDate;

import static transport.PassengerCapacity.M;
import static transport.PassengerCapacity.S;

public class Main {
    public static void main(String[] args) {
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, 1.34, 320, BodyType.CROSSOVER);
        Car bmvZ8 = new Car("BMW", "Z8", 3.0, 1.48, 300, BodyType.COUPE);
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, 2.30, 210, BodyType.SEDAN);
        Car kiaRio = new Car("Kia", "Rio", 1.6, 2.47, 205, BodyType.HATCHBACK);
        Bus isuzuBogdanA092 = new Bus("Isuzu", "Bogdan A-09202", 5.2, 3.40, 120, S);
        Bus isuzuBogdanА09204 = new Bus("Isuzu", "Bogdan A-09204", 5.2, 3.30, 115, S);
        Bus liaz5292 = new Bus("ЛиАЗ", "5292", 6.6, 3.50, 110, M);
        Bus paz3204 = new Bus("ПАЗ", "3204", 4.34, 3.60, 100, S);
        Truck kamaz5320 = new Truck("Камаз", "5320", 10.8, 3.00, 170, CarriageCapacity.N2);
        Truck manTgs = new Truck("Man", "TGS 19.400 4X2 BLS-WW", 10.5, 2.60, 190, CarriageCapacity.N2);
        Truck volvoFH = new Truck("Volvo", "FH", 16.1, 2.40, 195, CarriageCapacity.N3);
        Truck maz64229 = new Truck("Маз", "64229", 14.86, 3.10, 160, CarriageCapacity.N2);
        DriverB petia = new DriverB("Петя", "B", 3, audiA8);
        bmvZ8.BestLapTime();
        kiaSportage.pitStop();
        petia.refill();
        System.out.println(petia);
        petia.startMove();
        bmvZ8.printType();
        kiaRio.printType();
        isuzuBogdanA092.printType();
        manTgs.printType();
    }
}