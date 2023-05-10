/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author ACER
 */
public class NoTaxProduct  extends Product{

    public NoTaxProduct() {
    }

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }

   
   
    @Override
    public double getImportTax() {
        return super.getPrice() * 1; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
  
    public void hienThi() {
        System.out.println("ProductNo{" + "name=" + super.getName() + ", price=" + getImportTax() + '}');
    }

    @Override
    public String toString() {
        return "NoTaxProduct: "   + "name= " + super.getName() + " " + "gia= "  + super.getImportTax() ;
    }

    
    
    
   
    
    
  
    
    
    
}
