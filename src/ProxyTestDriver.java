public class ProxyTestDriver {
    public static void main(String[] args){
        Vehicle bmw = new BMW();
        Vehicle boe = new Boeing();
        Vehicle heli = new Helicopter();
        Vehicle gmc = new GMCTruck();
        Driver operator1 = new Driver("John Smith", 17, true);
        Driver operator2 = new Driver("Jane Smith", 17, false);

        Vehicle test1 = new CarProxy(operator1, bmw);
        test1.operate();
        operator1.setCert(false);
        Vehicle test2 = new PlaneProxy(operator1, boe);
        test2.operate();

        System.out.println();

        Vehicle test3 = new CarProxy(operator2, gmc);
        test3.operate();
        operator2.setCert(true);
        Vehicle test4 = new PlaneProxy(operator2, heli);
        test4.operate();
    }
}
