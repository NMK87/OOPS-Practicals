package org.example.Polymorphism;

import org.example.Polymorphism.*;

public class Main {
    public static void main(String[] args) {

//        EncapsulationEx2 enscpn = new EncapsulationEx2();
//
//        enscpn.setEmpId(65763);
//        enscpn.setManager("Shiva");
//        enscpn.setEmp("neha");
//        enscpn.setSalary(900000);
//
//        System.out.println("Employee details are " + enscpn.getEmpId()+ " "+enscpn.getEmp()+ " "+enscpn.getManager()+ " "+enscpn.getSalary());
//

        ShapeOverride sh = new Circle();
        sh.draw();
        sh=new Rectangle();
        sh.draw();
        sh = new ShapeOverride();
        sh.draw();

        AdditionOverriding summing = new AdditionOverriding();
        summing = new Sum();
        summing.add(1,2);
        summing = new Adding();
        summing.add(5,6);

    }
}