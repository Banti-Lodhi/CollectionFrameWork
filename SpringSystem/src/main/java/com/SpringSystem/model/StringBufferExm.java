package com.SpringSystem.model;

class Logger {
   private StringBuffer stringBuffer = new StringBuffer();
   public void log(String message) {
       synchronized (stringBuffer) {
           stringBuffer.append(message).append("\n");
       }
   }
   public String getLogs() {
      return stringBuffer.toString();
   }
}
public class StringBufferExm {
    public static void main(String[] args) {
Logger loggers = new Logger();
Runnable task = () -> {
    for(int i=0; i<5; i++) {
        loggers.log("Log entry form "+ Thread.currentThread().getName());
    }
};
Thread thread1 = new Thread(task);
Thread thread2 = new Thread(task);
thread1.start();
thread2.start();
try {
    thread1.join();
    thread2.join();
}catch (InterruptedException e) {
    e.printStackTrace();
}
        System.out.println(loggers.getLogs());
    }
}
