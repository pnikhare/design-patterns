interface Machine {
    //public model;
    public void startMachine();
}

class WashingMc implements Machine {

    public void startMachine(){
        System.out.println("Washing Machine Started");
    }
}

class Fridge implements Machine {
    public void startMachine(){
        System.out.println("Fridge Started");
    }
}

class AC implements Machine {
    public void startMachine(){
        System.out.println("AC Started");
    }
}

class MachineFactory {
    /*
    * Addition in Machine Doesnt need any change in Client Program
    * Only Factory Method needs to be changed
    */
    public Machine getMachine(String type) {
        Machine mac;
        if (type == "WASHING"){
            mac = new WashingMc();
        }else if (type == "AC") {
            mac = new AC();
        }else if (type == "FRIDGE") {
            mac = new Fridge();
        }else {
            mac = null;
        }
        return mac;
    }
}

public class FactoryPattern {

    /*
    * Client wants to run his machine he needs to create object of Machine Factory and call method
    */
    public static void main(String args[]) {
        MachineFactory m = new MachineFactory();
        Machine mac = m.getMachine("WASHING");
        mac.startMachine();

        mac = m.getMachine("AC");
        mac.startMachine();

        mac = m.getMachine("FRIDGE");
        mac.startMachine();
    }
    
}
