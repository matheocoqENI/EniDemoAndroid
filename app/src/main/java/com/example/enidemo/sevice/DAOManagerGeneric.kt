package com.example.enidemo.sevice

import kotlin.reflect.KClass

class DAOManagerGeneric {

    var daoList : ArrayList<Any> = ArrayList<Any>();

    inline fun<reified T : Any> getDAOByClass(className:KClass<T>):T ?{
        for (daoBase in daoList){
            if (daoBase.javaClass.kotlin===className){
                return daoBase as T;
            }
        }

        var myObject = T::class.java.newInstance();

        daoList.add(myObject);

        return myObject;
    }


}