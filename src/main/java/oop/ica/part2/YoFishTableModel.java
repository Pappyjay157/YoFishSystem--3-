/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.part2;

/**
 *
 * @author s3258780
 */
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.AbstractTableModel;

public class YoFishTableModel extends AbstractTableModel {
    //Declare fields
    private final String[] columnNames;
    private final Object[][] data;
    
    public YoFishTableModel(String[] colNames, ArrayList<YoFishItem> dataList){
        //get length paramter array
        int columnNamesLength = colNames.length;
        
        //use static copy if method to popupaulate field array
        columnNames = Arrays.copyOf(colNames, columnNamesLength);

        //get number of rows
        int rowLength = dataList.size();
        
        //instantiate size of 2d array
        data = new Object [rowLength][columnNamesLength];
        
        //loop through array list
        for (int index=0; index<dataList.size(); index++){
            //get fields
            int id = dataList.get(index).getId();
            String item = dataList.get(index).getItem();
            String price = dataList.get(index).getFormattedPrice();
            int stock = dataList.get(index).getStock();
            double maxsize = dataList.get(index).getMaxsize();
            int lowtemp = dataList.get(index).getLowtemp();
            int hightemp = dataList.get(index).getHightemp();
//System.out.println(price);
            //use fields to create object array
            Object [] dataRow = new Object[] {id, item, price, stock, maxsize, lowtemp, hightemp};
            
            //copy row data array into current data row
            data[index] = Arrays.copyOf(dataRow, columnNamesLength);
        }
    };
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex){
        data[rowIndex][columnIndex] = value;
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
