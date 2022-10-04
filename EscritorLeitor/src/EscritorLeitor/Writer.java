package EscritorLeitor;

public class Writer implements Runnable{
    
    private Database db;
    private int id;
    
    public Writer(Database db,int id){
        this.id=id;
        this.db=db;
    }
    public void run(){
        JobUtil.nap();
        db.adquiriTravaEscrita(id);
        JobUtil.nap();
        //Selec * from 
        db.liberaTravaEscrita(id);
    }
    
    
}
