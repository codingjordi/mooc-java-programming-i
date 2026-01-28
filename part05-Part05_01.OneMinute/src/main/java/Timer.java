/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josaca
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand miliseconds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.miliseconds = new ClockHand(100);
    }
    
    public void advance(){
        this.miliseconds.advance();
        
        if(this.miliseconds.value() == 0){
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return seconds + ":" + miliseconds;
    }
}