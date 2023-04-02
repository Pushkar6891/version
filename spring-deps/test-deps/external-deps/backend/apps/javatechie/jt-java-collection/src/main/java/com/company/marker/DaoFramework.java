package com.company.marker;


public class DaoFramework {

    public void delete(Object object){

        if (object instanceof Deletable){
            //write DB logic
        }
    }
}
