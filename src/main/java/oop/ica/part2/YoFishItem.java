/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.part2;

/**
 *
 * @author s3258780
 */
public class YoFishItem {

    //FIELDS
    private int id;
    private String item;
    private double price;
    private int stock;
    private double maxsize;
    private int lowtemp;
    private int hightemp;

    public YoFishItem(int id, String item, double price, int stock, double maxsize, int lowtemp, int hightemp) {
            
        this.id = id;
        this.item = item;
        this.price = price;
        this.stock = stock;
        this.maxsize = maxsize;
        this.lowtemp = lowtemp;
        this.hightemp = hightemp;
    }   
    //ACCESSORS
    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public double getMaxsize() {
        return maxsize;
    }

    public int getLowtemp() {
        return lowtemp;
    }

    public int getHightemp() {
        return hightemp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setMaxsize(double maxsize) {
        this.maxsize = maxsize;
    }

    public void setLowtemp(int lowtemp) {
        this.lowtemp = lowtemp;
    }

    public void setHightemp(int hightemp) {
        this.hightemp = hightemp;
    }
    
    
    public void setPrice(double p){price = p;}

    
    // service methods 
    public String getFormattedPrice(){
        return String.format("£ %.2f",price);
    }
    
    public String getPicFileName(){
        return this.getId()+ ".jpg";
    }
    
    
}
