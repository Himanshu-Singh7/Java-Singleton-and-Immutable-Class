package ImmutableClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Object> petname = new ArrayList<>();
        petname.add("SJ");
        petname.add("JG");

        MyImmutableClass immutableClass = new MyImmutableClass("Myname",petname);
        immutableClass.getPetNameList().add("Hello");
        System.out.println(immutableClass.getPetNameList());
    }
}
