/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book_5;

import java.util.ArrayList;

/**
 *
 * @author modip
 */
public class CountDownApp2 {

  public static void main(String[] args)
{
 Thread clock = new CountDownClock();
 ArrayList<Runnable> events
 = new ArrayList<Runnable>();
 events.add(new LaunchEvent(16, "Flood the pad!"));
 events.add(new LaunchEvent(6, "Start engines!"));
 events.add(new LaunchEvent(0, "Liftoff!"));
 clock.start();
 for (Runnable e : events)
 new Thread(e).start();
}

    private static class LaunchEvent implements Runnable {

        public LaunchEvent(int i, String flood_the_pad) {
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
