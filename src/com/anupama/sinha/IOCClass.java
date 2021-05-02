package com.anupama.sinha;

class DependentClass{

}
class VanillaClass {
    private DependentClass d;
    VanillaClass(){
        this.d = new DependentClass();
    }
}

public class IOCClass {
    private DependentClass d;
    IOCClass(DependentClass dc){
        this.d = dc;
    }

    public static void main(String[] args) {
        DependentClass dc = new DependentClass();
        //Tight coupling as incorrectly another DependentClass Object might get assigned through scope and lifetime
        //So, IOC helps in coupling desired Dependent objects
        IOCClass ioc = new IOCClass(dc);
    }
}
