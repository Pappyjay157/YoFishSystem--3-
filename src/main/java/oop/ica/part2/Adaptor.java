/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.part2;
/**
 *
 * @author s3258780
 */
public class Adaptor extends YoFishItem {

    public Adaptor (PondlifeProduct pondlifeProduct) {
        
        
        super(
        pondlifeProduct.getSkuNumber(),
        pondlifeProduct.getProduct(),
        pondlifeProduct.getCost(),
        pondlifeProduct.getStock(),
        pondlifeProduct.getMaxLength(),
        pondlifeProduct.getMinTemp(),
        pondlifeProduct.getMaxTemp()
        
        
        
        );
    }
    
    
    }

