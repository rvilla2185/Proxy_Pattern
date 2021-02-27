public class PlaneProxy extends Plane{
    private Driver pilot;
    private Vehicle plane;

    public PlaneProxy(Driver pilot, Vehicle plane){
        this.pilot = pilot;
        this.plane = plane;
    }
    public void operate(){
        if ((pilot.getAge() >= 17) && pilot.getCert()){
            System.out.print(pilot.getName()+" ");
            plane.operate();
        }
        else {
            System.out.println(String.format("%s is not qualified to drive a %s.", pilot.getName(), plane));
        }

    }
}
