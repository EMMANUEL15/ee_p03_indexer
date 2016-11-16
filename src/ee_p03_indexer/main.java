package ee_p03_indexer;
public class main
{
 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
              Indexador indx=new Indexador(); 
              indx.setLocationRelativeTo(null);
              indx.setVisible(true);
            }
        }
        );
    }     
}
