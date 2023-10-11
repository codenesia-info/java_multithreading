/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamultithreading;

/**
 *
 * @author coden
 */
public class JavaMultiThreading {

    public static void main(String[] args) {
        
        //for (int i = 0; i < 10; i++){
            CountWorker r = new CountWorker();
            Thread thrCounter = new Thread(r);
            thrCounter.start();
        //}
        
    }
    
}
