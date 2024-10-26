/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueproj;

/**
 *
 * @author Jc Roy Lopez
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class QueueADT<T> {
    private LinkedList<T> queue;
    private int count = 1;

    public QueueADT() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
        count++;
    }

    public T dequeue() {
        if (!isEmpty()) {
            return queue.removeFirst();
        }
        count--;
        return null; // Queue is empty
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public int getCount(){
        return count;
    }
    
    public String currentTime(){
        Date currentDate = new Date();
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
       return dateFormat.format(currentDate);
    }
    
    public String regularTime(){
        Calendar calendar  = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH,2);
        
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
       return dateFormat.format(calendar.getTime());
    }
    
    public String rushTime(){
        Calendar calendar  = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR_OF_DAY, 3);
        
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
       return dateFormat.format(calendar.getTime());
    }
}

