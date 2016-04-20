package com.jack.javabase;
public class Outer { 
    public static void main(String[] args) { 
        Outer outer = new Outer(); 
        Inner inner = outer.getInner("Inner", "gz"); 
        System.out.println(inner.getName()); 
    } 
 
    public Inner getInner(final String name, String city) { 
        return new Inner() { 
            private String nameStr = name; 
 
            public String getName() { 
                return nameStr; 
            } 
        }; 
    } 
} 
interface Inner { 
    String getName(); 
}