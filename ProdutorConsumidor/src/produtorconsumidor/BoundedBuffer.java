package produtorconsumidor;

public class BoundedBuffer {
    
    private int[] buffer; //vetor
    private int contador;
    private int in;
    private int out;
    private int buffer_size;
    
    public BoundedBuffer(){
        buffer_size = 5;
        buffer = new int[buffer_size];
        contador = 0;
        in = 0;
        out = 0;
    }
    
    public synchronized void insert(int dado) {
        //Date().toString() retorna data e hora
        while (contador == buffer_size) {
            try{
                wait();
            }catch (InterruptedException e) {
            }
        }
        buffer[in] = dado;
        System.out.println("Produzido> contador: " + contador);
        in = (in + 1) % buffer_size;
        contador++;
        notify();
    }
    
    public synchronized int remove() {
        while (contador == 0) {
            try{
                wait();
            }catch (InterruptedException e) {
            }
        }
        int dado = buffer[out];
        out = (out + 1) % buffer_size;
        contador--;
        System.out.println("Consumido> contador: " + contador);
        notify();
        return dado;
    }
}
