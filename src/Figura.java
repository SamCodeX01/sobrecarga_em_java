
import javax.swing.JOptionPane;



/**
 *Classe para demonstrar a utilização do recurso de linguagem chamado Sobrecarga de métodos
 * @author Samuel 
 * @since Classe criada em 28/03;2024
 */
public class Figura {
    Integer a, b, c, d; //aqui são objetos do tipo Integer, Integer é uma classe de inteiros
    
    //Construtor genérico para gerar uma figura
    
    public Figura(){
        String msg;
        int opc;
        msg = "1 - Ponto"
               + "\n2 - Linha"
               + "\n3 - Triâgulo"
               + "\n4 - Retangulo";
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch(opc){
            case 1: a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do ponto"));
            break;
            
            case 2: a = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1° coordenada da linha"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2° coordenada da linha"));
            break;
            
            case 3: a = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1° coordenada do triângulo"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2° coordenada do triângulo"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite a 3° coordenada do triângulo"));
            break;  
            
            case 4: a = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1° coordenada da retângulo"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2° coordenada da retângulo"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite a 3° coordenada da retângulo"));
                    d = Integer.parseInt(JOptionPane.showInputDialog("Digite a 4° coordenada da retângulo"));
            break;
            
            case 5: System.exit(0);
            default: JOptionPane.showMessageDialog(null, "Opçao Inválida");

        }
        
    }//fim do cosntrutor gnérico
    
    //Construtor para um ponto
    public Figura(int a){
        this.a = a;
    }
    
    //Construtor para uma linha
    public Figura(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //Construtor para um triangulo
    public Figura(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }   
    
    //Construtor para um retangulo
    public Figura(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
       
    //Método comum para identificar qual o tipo de figura
    //foi instanciada (Ponto, Linha, Triangulo ou Retangulo)
    public void exibirFigura(){
    if(a != null && b == null && c == null && d == null)
        exibirFigura(0);
        else if(a != null && b !=null && c == null && d == null)
            exibirFigura("");
        
        else if(a != null && b != null && c != null && d == null)
            exibirFigura(0,0,0);
                    
        else
            exibirFigura(0,0,0,0);
    }
    
    //Método comum para exibir os dados de um ponto
        public void exibirFigura(int x){
            System.out.println("Ponto de valor: " + a);
        }
    
    //Método comum para exibir as coordenadas para uma linha
        public void exibirFigura(String w){ //esse método é uma sobrecarga do anterior
            System.out.println("Linha de coordenadas: " + a + " e " + b);
        }    
    
        //Método para exibir coordenadas para um triangulo
            public void exibirFigura(int aa, int bb, int cc){
                System.out.println("Triangulo: " + a + " e "+ b + " e " + c);
            }
        
            //Método para exibir coordenadas para um retangulo
                public void exibirFigura(int aaa, int bbb, int ccc, int ddd){
                    System.out.println("Retangulo: " + a + " e "+ b + " e "+ c + " e " + d);
                } 
        
}//fim da classe
