package org.example.solid;

//Client should not implement un used methods

//NO
/*

interface LaptopService{
    public void getLaptop();
    void saveLaptop();
    void getPrinters();
    void savePrinter();
}
class LapTopDao implements LaptopService{

    @Override
    public void getLaptop() {
    }

    @Override
    public void saveLaptop() {
    }

    // Un used method
    @Override
    public void getPrinters() {
    }
    //Un used mthod
    @Override
    public void savePrinter() {
    }
}
*/

interface LaptopService{
    public void getLaptop();
    void saveLaptop();
}
interface PrinterService{
    void getPrinters();
    void savePrinter();
}
class LapTopDao implements LaptopService{

    @Override
    public void getLaptop() {
    }

    @Override
    public void saveLaptop() {
    }
}
class PrinterDao implements PrinterService{

    @Override
    public void getPrinters() {

    }

    @Override
    public void savePrinter() {

    }
}


public class InterfaceSegmentPrinciple {
}
