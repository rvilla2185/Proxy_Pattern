public class CarProxy extends Car {
    private Driver driver;
    private Vehicle car;

    public CarProxy(Driver driver, Vehicle car){
        this.driver = driver;
        this.car = car;
    }
    public void operate(){
        if ((driver.getAge() >= 16) && driver.getCert()){
            System.out.print(driver.getName()+" ");
            car.operate();
        }
        else {
            System.out.println(String.format("%s is not qualified to drive a %s.", driver.getName(), car));
        }

    }
}
