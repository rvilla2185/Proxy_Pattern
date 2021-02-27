public class Driver {
    private String name;
    private int age;
    private boolean cert;
    public Driver (String name, int age, boolean cert){
        this.name = name;
        this.age = age;
        this.cert = cert;
    }
    public String getName(){
        return this.name;
    }
    public boolean getCert(){
        return this.cert;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCert(Boolean cert){
        this.cert = cert;
    }
    public void setAge(){
        this.age = age;
    }
}
