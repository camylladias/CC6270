package EscritorLeitor;

public class Reader implements Runnable {
    
    private Database db;
    private int id;
    
    public  Reader(Database db,int id){
        this.id=id;
        this.db=db;
    }
    public void run(){
        JobUtil.nap();
        db.adquiriTravaLeitura(id);
        JobUtil.nap();
        //Selec * from 
        db.liberaTravaLeitura(id);
    }
    
   
    
    
    
}
