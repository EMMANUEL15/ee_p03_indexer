package ee_p03_indexer;
/**
 * @author EMMANUEL
 */
public class ArbolA<T extends Comparable<T>>
{
  public String resultado;
  public T Tdato;
  public NodoArbol<T> ArbolA;
  public ArbolA(){}
  public void datos(T td){
      this.Tdato=td;
  }
  /**
   * Recorre todo el abol de forma preordenada. primero los nodo de lado izaquierdo y despues el lado derecho
   */
  public void RecorrerArbolA(NodoArbol<T> raiz){ //RECORRE AL ArbolA 
    if(raiz!=null){
       System.out.println(raiz.ToString());
       RecorrerArbolA(raiz.getIzquierda());
       RecorrerArbolA(raiz.getDerecha());
        }
        }
  /**
   * recibe un dato lo envia al contructor creaA para crear un nodo depemdiendo de la posicion que le corresponde
   * despues de haber incertado el dato se revisa el arbol, en caso que que hay este desequilibrado rotarlo segun sea el caso
   */
  public void incertar(T dato){
      crear(dato,ArbolA);   
      revisar(ArbolA,ArbolA);
  }
  /**
   * este metodo recibe el dato del constructor incretar para crear un nodo 
   * recorre al arbol buscando la posicion que le corresponde la imformacion recibida, si la informacon es es mayor que el dato de un nodo avanza el lado derecho
   * si es menor avenza el lado izaquierdo, en caso que un nodo para avanzar crea un nodo con la informacion recibida.
   * si ya existe un Nodo con la misma informacion recibida no realiza ningun cambio al arbol
   */
  private void  crear(T dato,NodoArbol<T> raiz){
    NodoArbol<T> N=new NodoArbol<T>(dato); int r=0;
    if(raiz==null){
        ArbolA=N;
    } else{
        r=N.getDato().compareTo(raiz.getDato());
    }
    if(r>0){ //************ DERECHA 
            if(raiz.getDerecha()!=null){    // SI TIENE NODO DERECHA AVANZAR
                raiz.getDerecha();
                crear(dato, raiz.getDerecha());
            }else{                          // SI NO CREAR UN NODO DERECHA 
                raiz.setDerecha(N);
                Nivel(ArbolA);
            }
    }else if(r<0){//********** IZAQUIERDA
            if(raiz.getIzquierda()!=null){      // SI TIENE NODO IZAQUIERDA AVANZA AL NODO
                raiz.getIzquierda();
                crear(dato, raiz.getIzquierda());
            }else{                              // SI NO CREA UN NODO DERECHA 
                raiz.setIzquierda(N);
                Nivel(ArbolA);
            }
    }
   }
   /**
    * este contructor realiza un recorrido al arbol refrescando los datos de equilibio del arbol
    * si el nodo no tienes ramas es cero, en caso que tenga un SubNodo toma el equilibrio mas uno para su equilibrio
    * si el Nodo tiene Subnodos de Ambos lados toma como base la ramas conequilibio mayor mas uno para su equilibrio
    */
  public void Nivel(NodoArbol<T> raiz){
     if(raiz!=null){
       Nivel(raiz.getIzquierda());
       Nivel(raiz.getDerecha());
       if(raiz.getIzquierda()==null&& raiz.getDerecha()==null){
                raiz.setEq(0);
       }else if(raiz.getIzquierda()!=null&& raiz.getDerecha()!=null){
           if(raiz.getIzquierda().getEq()>raiz.getDerecha().getEq()){
              raiz.setEq(raiz.getIzquierda().getEq()+1);
            }else{
              raiz.setEq(raiz.getDerecha().getEq()+1);
            }
       }else if(raiz.getIzquierda()!=null&& raiz.getDerecha()==null){
                raiz.setEq((raiz.getIzquierda().getEq()+1));
       }else if(raiz.getIzquierda()==null&& raiz.getDerecha()!=null){
                raiz.setEq((raiz.getDerecha().getEq()+1));
       }
        }
    }
    /**
     * este contructor recorrer al arbol analizando que no este desequilibrado
     * si el arbol presenta un desequilibrio llama a uno de los cotructores para rotar lo segun sea el caso
     * la roracion se realiza cuando de un lado tiene mas de uno nodo que del otro lado. lo cual se realiza dos tipos de de rotaciones dobles y sencillos
     */
  public void revisar(NodoArbol<T> raiz,NodoArbol<T> rz){
     if(raiz!=null){
       revisar(raiz.getIzquierda(),raiz);
       revisar(raiz.getDerecha(),raiz);
        if(raiz.getIzquierda()!=null&& raiz.getDerecha()!=null){
         int res=0;
         if((raiz.getIzquierda().getEq())>(raiz.getDerecha().getEq())){
            res=((raiz.getIzquierda().getEq())-(raiz.getDerecha().getEq()));
         }else{
            res=(raiz.getDerecha().getEq())-(raiz.getIzquierda().getEq());
          } 
         if(res>=2){
             if(raiz.getDato().compareTo(ArbolA.getDato ())==0){
                 ArbolA=DobleD(raiz);
                 Nivel(ArbolA);
             } else{
                if((raiz.getDerecha().getEq()>(raiz.getIzquierda().getEq()))){
                    rz.setDerecha(DobleD(raiz));
                    }else{
                    rz.setIzquierda(DobleD(raiz));
                }
                Nivel(ArbolA);
              }
            }
       }else if(raiz.getIzquierda()!=null&& raiz.getDerecha()==null){
            if(raiz.getIzquierda().getIzquierda()!=null){
                 if(raiz.getDato().compareTo(ArbolA.getDato())==0){
                    ArbolA=II(raiz);
                    Nivel(ArbolA);
                } else{
                    rz.setIzquierda(II(raiz));
                    Nivel(ArbolA);
                }
            }else if(raiz.getIzquierda().getDerecha()!=null){
                if(raiz.getDato().compareTo(ArbolA.getDato())==0){
                    ArbolA=ID(raiz);
                    Nivel(ArbolA);
              } else{
                    rz.setIzquierda(ID(raiz));
                    Nivel(ArbolA);
              }
            }
       }else if(raiz.getIzquierda()==null&& raiz.getDerecha()!=null){ /////////ROTACION***********ROTACION *****RPOTACION  DEARECHA////
         if(raiz.getDerecha().getDerecha()!=null){
                if(raiz.getDato().compareTo(ArbolA.getDato())==0){
                    ArbolA=DD(raiz);
                } else{
                    rz.setDerecha(DD(raiz));
                    Nivel(ArbolA);
                }
         }else if(raiz.getDerecha().getIzquierda()!=null){
             System.out.println("rotar Dizq "+raiz.getDato());
            if(raiz.getDato().compareTo(ArbolA.getDato())==0){
                    ArbolA=DI(raiz);
              } else{
                    rz.setDerecha(DI(raiz));
                    Nivel(ArbolA);
              }
            }
       }
        }
      }
  /**
   * rotacion sencilla de lado derecho 
   */
  public NodoArbol<T> DD(NodoArbol<T> raiz){//  ROTACION DE LOS NODOS DERECHOS
     NodoArbol<T> aux1=new NodoArbol<T>(raiz.getDato()); 
     NodoArbol<T> aux2=raiz.getDerecha();
     aux2.setIzquierda(aux1);
     return aux2;
    }
   /**
    * roarcion sencilla de lado derecho
    */
  public NodoArbol<T> II(NodoArbol<T> raiz){
     NodoArbol<T> aux1=new NodoArbol<T>(raiz.getDato()); 
     NodoArbol<T> aux2=raiz.getIzquierda();
     aux2.setDerecha(aux1);
     return aux2;
    }
    /**
     * rotacion doble
     * se realiza cuando tiene Subnodos con mas SubNodo, lo cual es mecesario respaldar algunos nodos y acomodar de forma concruente los nodo duante la rotacion
     * en este caso se puede realizar dos formas segun el lado que este mas cargado.
     */
  public NodoArbol<T> DobleD(NodoArbol<T> raiz){
    NodoArbol<T> R=raiz;
    if((raiz.getIzquierda().getEq())>(raiz.getDerecha().getEq())){
     NodoArbol<T> aux1=new NodoArbol<T>(raiz.getDato());
     aux1.setDerecha(raiz.getDerecha());
     aux1.setIzquierda(raiz.getIzquierda().getDerecha());
     NodoArbol<T> aux2=new NodoArbol<T>(raiz.getIzquierda().getDato());
     aux2.setIzquierda(raiz.getIzquierda().getIzquierda());
     aux2.setDerecha(aux1);
     R=aux2;
   }else{
     System.out.println(raiz.getDato());
     NodoArbol<T> aux1=new NodoArbol<T>(raiz.getDato()); 
     aux1.setIzquierda(raiz.getIzquierda());
     aux1.setDerecha(raiz.getDerecha().getIzquierda());
     NodoArbol<T> aux2=new NodoArbol<T>(raiz.getDerecha().getDato());
     aux2.setDerecha(raiz.getDerecha().getDerecha());
     aux2.setIzquierda(aux1);
     R=aux2 ;
    }
   return R;
   }
   /**
    * se raliza un rotacion sencilla cuando cuando en nodo derecho no tiene nodo derecho pero tiene un nodo izquierdo
    */
  public NodoArbol<T> DI(NodoArbol<T> raiz){ //         ROTACION DE LOS NODOS DERECHOS E IZQUIERDOS
      NodoArbol<T> aux1=new NodoArbol<T>(raiz.getDato());
      NodoArbol<T> aux3=new NodoArbol<T>(raiz.getDerecha().getDato());
      NodoArbol<T> aux2=raiz.getDerecha().getIzquierda();
      aux2.setIzquierda(aux1);
      aux2.setDerecha(aux3);
      return aux2;
    }
  /**
   * se raliza un rotacion sencilla cuando cuando en nodo izquiredo no tiene nodo derecho pero tiene un nodo derecho
   */ 
  public NodoArbol<T> ID(NodoArbol<T> raiz){ //         ROTACION DE LOS NODOS IZQUIERDOS y DERECHOS
      NodoArbol<T> aux1=new NodoArbol<T>(raiz.getDato());
      NodoArbol<T> aux2=new NodoArbol<T>(raiz.getIzquierda().getDato());
      NodoArbol<T> aux3=raiz.getIzquierda().getDerecha();
      aux3.setIzquierda(aux2);
      aux3.setDerecha(aux1);
      return aux3;
    }
  /**
   * recibe un dato y el arbol metodo BuscadorDato 
   * recorre al arbol buscando el dato recibido. si el dato es mayor va al derecha en caso contrio a la izquierda
   * si la informacion existe guarda un mensaje si no guarda otro mensaje.
   */
  public void buscar(NodoArbol<T> raiz, T dato){
      if (raiz != null){
          if (dato.compareTo(raiz.getDato()) < 0){ // Vamos por la izquierda
                buscar(raiz.getIzquierda(), dato);
          }else if (dato.compareTo(raiz.getDato()) > 0){ // Vamos por la derecha
                buscar(raiz.getDerecha(), dato);
          }else{
              this.resultado=String.valueOf("El objeto "+ dato +" se encontró el en arbol.");
            }
       }else{
             this.resultado=String.valueOf("No se encontró el objeto "+dato);
       }
     }
  /**
   * recibe un dato para buscar.
   * envia el dato al metodo buscar el guardar un mensaje de resultado segun sea el caso
   * finalmente este Metodo retunra un mensaje resultado guardado
   */
  public String BuscarDato(T b){
        buscar(ArbolA,b);
        return resultado;
  }
}