package ee_p03_indexer;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
/**
 * @author EMMANUEL
 */
public class Indexador extends javax.swing.JFrame {
    public int idr;boolean sts=false;
    public String datos;
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton B0;
    private javax.swing.JRadioButton B1;
    private javax.swing.JRadioButton B2;
    private javax.swing.JRadioButton B3;
    private javax.swing.JRadioButton B4;
    private javax.swing.JTextField Cbusqueda;
    private javax.swing.JLabel DATO;
    private javax.swing.JButton Examinar;
    private javax.swing.JLabel NArchivo;
    private javax.swing.JTextField Res;
    private javax.swing.JTextField Ruta;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultado; 
    ArbolA a=new ArbolA();
    public Indexador() {
        initComponents();
        grupo1.add(B0);
        grupo1.add(B1);
        grupo1.add(B2);
        grupo1.add(B3);
        grupo1.add(B4);
     }                          
      private void initComponents() {
        grupo1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        Cbusqueda = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        NArchivo = new javax.swing.JLabel();
        Ruta = new javax.swing.JTextField();
        B1 = new javax.swing.JRadioButton();
        B2 = new javax.swing.JRadioButton();
        B3 = new javax.swing.JRadioButton();
        B4 = new javax.swing.JRadioButton();
        B0 = new javax.swing.JRadioButton();
        Examinar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        DATO = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        Res = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        }
        );
        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        NArchivo.setText("Nobre del Archivo:");

        Ruta.setText("/archivo.txt");
        Ruta.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //RutaActionPerformed(evt);
            }
        }
        );
        B1.setBackground(new java.awt.Color(204, 204, 204));
        B1.setText("Firts Name");
        B1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        }
        );
        B2.setText("Last Name");
        B2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        }
        );
        B3.setBackground(new java.awt.Color(204, 204, 204));
        B3.setText("Email");
        B3.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        }
        );
        B4.setText("ip");
        B4.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        }
        );
        B0.setText("id");
        B0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        }
        );
        Examinar.setText("Examinar");
        Examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExaminarActionPerformed(evt);
            }
        }
        );
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        }
        );
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Examinar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Examinar))
                .addGap(18, 18, 18)
                .addComponent(B0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(B4)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        DATO.setText("Dato:");

        resultado.setText("Resultado:");

        Res.setBackground(new java.awt.Color(239, 239, 239));
        Res.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DATO, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DATO)
                            .addComponent(jButton1)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        pack();
    }                       
    private void ExaminarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Ruta.setText("");
        JFileChooser filechooser=new JFileChooser();
        int opcion=filechooser.showOpenDialog(this);
        if(opcion==JFileChooser.APPROVE_OPTION){
        Ruta.setText(filechooser.getSelectedFile().getPath());
        }
      }                                        

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.out.println("Cargando .. . . "+idr);
        try{
         FileReader f=new FileReader(Ruta.getText());
         BufferedReader b=new BufferedReader(f);
         String Contenido;int cont=0;
         while((Contenido=b.readLine())!=null){
             String columna[]=Contenido.split("\\|");
             if(cont==0){
                 a.datos(columna[idr]);cont=2;
                 this.datos=columna[idr];
             }else{
               a.incertar(columna[idr]);
             }
         }
         sts=true;
       }catch(Exception e){ JOptionPane.showMessageDialog(rootPane,"No se encontro el archivo");}
       Ruta.setText("");
    }     
    
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        this.idr=1;
     } 
    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
       this.idr=0;
    }
    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         this.idr=2;
    }   
    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         this.idr=3;
    }   
    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        this.idr=4;
    }                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     if(sts==true){
         this.Res.setText(a.BuscarDato(this.Cbusqueda.getText()));
     }
     else{JOptionPane.showMessageDialog(rootPane,"Selecione un Archivo archivo");}
    }   
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
