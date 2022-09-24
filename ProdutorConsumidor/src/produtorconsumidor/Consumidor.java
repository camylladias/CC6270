package produtorconsumidor;

public class Consumidor implements Runnable{
    
    private BoundedBuffer buffer;
    
    public Consumidor(BoundedBuffer buffer){
        this.buffer = buffer;
    }
    
   @Override
   public void run(){
       while(true){
           JobUtil.nap();
           int dado = buffer.remove();
       }
   }
}
