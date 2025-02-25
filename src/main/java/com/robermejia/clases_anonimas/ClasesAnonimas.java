package com.robermejia.clases_anonimas;

public class ClasesAnonimas {

    
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        // Clase anónima #1
        Animal perro = new Animal(){
            
            @Override
            public void hacerSonido() {
                System.out.println("El perro ladra, guau");
            }
            
        };// Debe terminar en ";"
        
        perro.hacerSonido(); // Declarando la clase anónima
        
        // Clase anónima #2
        new Vehiculo(){

            public void manejar(){
                System.out.println("Estoy manejando");
            }
        }.manejar();;
    }

}
