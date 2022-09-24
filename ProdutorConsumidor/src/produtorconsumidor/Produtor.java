package produtorconsumidor;

public class Produtor implements Runnable{
    private BoundedBuffer buffer;
    private int id;
    
    public Produtor(BoundedBuffer buffer, int id){
        this.buffer = buffer;
        this.id = id;
    }
    
   @Override
   public void run(){
       while(true){
           JobUtil.nap();
           int dado = 0;
           buffer.insert(dado);
       }
   }
}
