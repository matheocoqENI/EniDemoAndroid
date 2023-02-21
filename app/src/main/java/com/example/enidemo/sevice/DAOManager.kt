package com.example.enidemo.sevice

class DAOManager {

    lateinit var daoPerson : DAOPerson
    lateinit var daoArticle :DAOArticle

    fun getDAOPersonn():DAOPerson{
        if (daoPerson == null){
            daoPerson=DAOPerson();
        }
        return daoPerson;
    }

    fun getDAOArticle():DAOArticle{
        if (daoArticle == null){
            daoArticle =DAOArticle();
        }
        return daoArticle;
    }

}