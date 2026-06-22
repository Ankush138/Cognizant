package com.Document;

public class FactoryMain {
    public static void main(String[] args){
        Document obj=new WordDocument();
        obj.createDocument();
        DocumentFactory obj1=new DocumentFactory();
        Document obj2= obj1.createDocument("WordDocument");
        obj2.createDocument();
    }
}
