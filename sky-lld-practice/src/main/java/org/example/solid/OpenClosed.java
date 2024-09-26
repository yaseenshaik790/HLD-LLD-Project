package org.example.solid;

//Open for extension and closed for modification
//Not Open Closed Princeple
/*
class Product{
    public  void getProduct(){
        System.out.println("Pen");
    }
}

class InvoiceRepository{

    public void saveToFile(Product product) {

    }
    public void saveToDB(Product product) {

    }
}
*/

class Product{
    public  void getProduct(){
        System.out.println("Pen");
    }
}

interface InvoiceRepository {
    public void save(Product product);
}
class InvoiceSaveToDB implements InvoiceRepository{

    @Override
    public void save(Product product) {

    }
}


public class OpenClosed {
}
