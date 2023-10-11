

import jssc.SerialPortList;


public class TestSerial {

    public static void main(String[] args) {
        String puertos[]= SerialPortList.getPortNames();
        
        
        for (String n: puertos){
            System.out.println(n);
        }
    }
    
}
