
package produtorconsumidor;

public class Fabrica {
    public static void main(String [] args){
        BoundedBuffer buffer = new BoundedBuffer();
        
        Thread producer1 = new Thread(new Produtor(buffer, 1));
        Thread producer2 = new Thread(new Produtor(buffer, 2));
        Thread consumer1 = new Thread(new Consumidor(buffer));
        Thread consumer2 = new Thread(new Consumidor(buffer));
        Thread consumer3 = new Thread(new Consumidor(buffer));
        
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
