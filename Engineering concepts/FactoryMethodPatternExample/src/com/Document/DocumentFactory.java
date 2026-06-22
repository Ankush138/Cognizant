package com.Document;

import java.util.Objects;

public class DocumentFactory {

    public Document createDocument(String s){
        if(s.equals("WordDocument")) return new WordDocument();
        else if(s.equals("PdfDocument")) return new PdfDocument();
         return new ExcelDocument();
    }

}
