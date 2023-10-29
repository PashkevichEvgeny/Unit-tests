package Seminar2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void isCarInstanceOfVehicle(){
        Car car = new Car("cCar", "mCar", 2000);
        assertInstanceOf(Vehicle.class, car);
    }
    @Test
    void hasCarFourWheels(){
        Car car = new Car("cCar", "mCar", 2000);
        assertEquals(4, car.getNumWheels());
    }
    @Test
    void hasMotorcycleTwoWheels(){
        Motorcycle motorcycle = new Motorcycle("cMotorcycle", "mMotorcycle", 2000);
        assertEquals(2, motorcycle.getNumWheels());
    }
    @Test
    void isCarSpeed60InTestDriveMode(){
        Car car = new Car("cCar", "mCar", 2000);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    @Test
    void isMotorcycleSpeed75InTestDriveMode(){
        Motorcycle motorcycle = new Motorcycle("cMotorcycle", "mMotorcycle", 2000);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
    @Test
    void isCarSpeedZeroWhenParking(){
        Car car = new Car("cCar", "mCar", 2000);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
    @Test
    void isMotorcycleSpeedZeroWhenParking(){
        Motorcycle motorcycle = new Motorcycle("cMotorcycle", "mMotorcycle", 2000);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}