package com.anupama.sinha;
//No state change once initialized : private final Variables + No Setter + Only getters
final class Immutable {

    private final String name;

    Immutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ImmutableClass {
    public static void main(String[] args) {
        Immutable i = new Immutable("Anupama");
        System.out.println("String :: "+ i);
        //i.name="Sinha" : No possible as private variable declaration
        //i.setName("Sinha"); Not possible as no Setters
        System.out.println("String after Change :: " + i);
    }
}
