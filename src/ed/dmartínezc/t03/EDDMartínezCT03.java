/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.t03;

/**
 *
 * @author danx_
 */
public class EDDMartínezCT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pal = "Anita lava la tina";
        String pal1 = "";
        String pal2 = "";
        
        for (int i = 0; i < pal.length(); i++) {
            if(pal.charAt(i) != ' ') {
                pal1 = pal1 + pal.charAt(i);
            }   
        }
        
        System.out.println("\nStack dinamica");
        Stack myStack = new Stack();
        for (int i = 0; i < pal.length(); i++) {
            if(pal.charAt(i) != ' ') {
               myStack.push(pal.charAt(i));
            }   
        }
        myStack.showStack();
        while (myStack.getSize() != 0) {
            pal2 = pal2 + myStack.getTop().getData();
            myStack.pop();
        }
        
        if (pal1.equalsIgnoreCase(pal2)) {
            System.out.println("La frase es un palindromo");
            System.out.println(pal1 + " == " + pal2);
        } else {
            System.out.println("La frase no es un palindromo");
            System.out.println(pal1 + " != " + pal2);
        }
        
        System.out.println("\nStack estatica");
        SStack stack = new SStack();
        pal2 = "";
        for (int i = 0; i < pal.length(); i++) {
            if(pal.charAt(i) != ' ') {
               stack.push(String.valueOf(pal.charAt(i))); 
            }   
        }
        
        stack.showStack();
        System.out.println(pal1);
        while (stack.getSize() > 0) {
            pal2 = pal2 + stack.getTop();
            stack.pop();
        }
        
        if (pal1.equalsIgnoreCase(pal2)) {
            System.out.println("La frase es un palindromo");
            System.out.println(pal1 + " == " + pal2);
        } else {
            System.out.println("La frase no es un palindromo");
            System.out.println(pal1 + " != " + pal2);
        }
    }
    
}
