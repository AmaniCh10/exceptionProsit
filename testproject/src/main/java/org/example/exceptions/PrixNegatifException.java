package org.example.exceptions;

public class PrixNegatifException extends Exception{
    public PrixNegatifException(String s){
        super(s);
    }
}
