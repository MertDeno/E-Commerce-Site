
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertd
 */
@ManagedBean(name = "productBean")
@SessionScoped
public class Products implements Serializable{

    private String name;
    private String price;
    private String[] selectedProd;

    private static ArrayList<Product> proList=new ArrayList<Product>(Arrays.asList
    (new Product("Pasta", "2 TL"),              //In here we added some products to our list 
     new Product("Vinegard", "3 TL"),
     new Product("Rice", "3 TL"),
     new Product("Yoghurt", "7.5 TL"),
     new Product("Meat", "45 TL"),
     new Product("Chicken", "25 TL"),
     new Product("Ayran","3 TL"),
     new Product("Chocolate","5 TL"),
     new Product("Olive","10 TL"),
     new Product("Tea","6 TL"),
     new Product("Cheese","30 TL"),
     new Product("Icetea","5 TL")));

    public ArrayList<Product>getProList() {
        return proList;
    }

    public String Buy(){                         //If our user wants to add items to cart this method will help them
        Product pro = new Product(this.name, this.price);
        proList.add(pro);
       return "bought";
    }
    
    public String Add(){                    //If our user wants to add new items to cart this method will help them
        Product pro = new Product(this.name, this.price);
        proList.add(pro);
       return null;
    }
    
    public String Delete(Product pro){      //If our user wants to delete existing items to cart this method will help them
        proList.remove(pro);
        return null;
    }
    
    public String Delete1(String[] selectedProd, String productName){
        proList.remove(selectedProd);               //If our user wants to delete "added to cart" items to cart this method will help them.(BUT I CANNOT RUN THAT METHOD)
        return null;
    }
    
    public String getBack(){            //If A User wants to back,this method will help
        return "success1";
    }
    
    public String getName() {
        return name;
    }
    
    public String Back(){
        return "success";
    }
   
    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {            //The reason why we defined that as string is,if a user wants to add any currency he/she can write it down
        this.price = price;
    }

    public String[] getSelectedProd() {
        return selectedProd;
    }

    public void setSelectedProd(String[] selectedProd) {
        this.selectedProd = selectedProd;
    }

    public static class Product{                //We used this class to add properties to our items
        private String name;
        private String price;
    
        public Product(String name,String price){
            this.name=name;
            this.price=price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
        
        
    }
}
