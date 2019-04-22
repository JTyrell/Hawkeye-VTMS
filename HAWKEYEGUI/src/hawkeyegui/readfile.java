/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hawkeyegui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author God, Giselle Todd, Jodianne Deer, Tai-Vaughn White, Rogerio Jones, Jevoun Tyrell.
 */
public class readfile {
    
    private Scanner x;
    public void openFile(){
        try{
            x = new Scanner(new File("HAWKEYECUSTOMER.txt"));
        }catch (FileNotFoundException e){
            System.out.printf("file not found");
        }
    }
    
    public void readFile(){
        while(x.hasNext()){
            String l_name = x.next();
            String f_name = x.next();
            String d_name = x.next();
            String license = x.next();
            String address1 = x.next();
            String address2 = x.next();
            String address3 = x.next();
            String trn = x.next();
            String cell_number= x.next();
            String home_number = x.next();
            String  em_number = x.next();
            String name_em = x.next();
            String chassis_num = x.next();
            String type = x.next();
            String V_brand = x.next();
            String V_model = x.next();
            String V_col = x.next();
            String V_year = x.next();
            String keyword = x.next();
            
             String[] main_address= new String[]{address1,address2,address3};
             String[] customer_info= new String[]{l_name,f_name,d_name,license,trn,cell_number,home_number,em_number,name_em,chassis_num,type,V_brand,V_model,V_col,V_year,keyword};
             System.out.print(main_address);
              
           
        }
        
    }
    
     public void closeFile(){
        x.close();
    }
    
     
}
