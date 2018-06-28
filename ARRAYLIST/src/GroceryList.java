package  com.company;


import java.util.ArrayList;
import  java.util.ArrayList;
public class GroceryList {


    private ArrayList<String> groceryList=new ArrayList<>();
    public void addItem(String item){


        groceryList.add(item);

    }
    public void printItem(){

        for(int i=0;i<groceryList.size();i++){


            System.out.println( groceryList.get(i));
        }
    }
    public void modifyItem(int positon,String newItem){

        groceryList.set(positon,newItem);
        System.out.println("item"+positon+1+"modified");
    }

    public void removeItem(int position){
        String theItem=groceryList.get(position);


        groceryList.remove(position);
    }

    public  String findItem(String searchItem){


        //boolean exists=groceryList.contains(searchItem);
        int position=groceryList.indexOf(searchItem);
        if(position>=0){

            return groceryList.get(position);
        }
         return null;

    }
}
