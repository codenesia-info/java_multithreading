/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javamultithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author coden
 */
public class CountWorker implements Runnable  {

    private boolean stop = false;
    
    @Override
    public void run() {
        //. di blok ini lah nantinya kode-kode Thread di jalankan
        while(!stop){
            System.out.println("ThreadId : " + Thread.currentThread().getId());
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(CountWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
