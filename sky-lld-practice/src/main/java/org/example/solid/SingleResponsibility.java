package org.example.solid;

//A class should have single responsibility. THere should have only one reason to change.

//Not a Single Responsiblity
/*
class Printer{
    private Long id;
    private String name;
}
class Invoice {
    private Long id;
    private Printer printer;

    public double calculatePrice(int price){
        return price*10;
    }

    public void saveInvoiceToDatabase(Invoice invoice){
        // Business Logic
    }

    public void printInvoice(Invoice invoice){
        // Business Logic
    }
}
*/

// WIth Single Responsibility
class Printer{
    private Long id;
    private String name;
}
class Invoice {
    private Long id;
    private Printer printer;

    public double calculatePrice(int price){
        return price*10;
    }
}

class InvoiceDao{

    public void saveInvoiceToDatabase(Invoice invoice){
        // Business Logic
    }
}

public class SingleResponsibility {
    public static void main(String[] args) {
        InvoiceDao invoiceDao = new InvoiceDao();
        invoiceDao.saveInvoiceToDatabase(new Invoice());
    }
}
