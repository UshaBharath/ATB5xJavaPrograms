package src.oops_09.inheritance.hierarchical;

public class Vehicle {

    Vehicle()
    {
        System.out.println("DC Vehicle");
    }

    void VehicleHasToSpeed()
    {
        System.out.println("Yeah From "+ getClass().getSimpleName());
    }
}
