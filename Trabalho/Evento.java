package Trabalho;

public class Evento
{
    private String nomeDoEvento;
    private String tipoDoEvento;
    private int codigo;
    private int dia;
    private String mes;
    private int ano;
    
    private Sala[] listaSala; 
    private int indexSala=0;
    private int quantidadeDeSalas;
    private int quantidadeDeSalasTotais=0;
    
    private Inscritos[] listaInscritos;
    private int indexInscrito=0;
    private int quantidadeDeInscritos;
    private int quantidadeDeInscritosTotais=0;
    
    public Evento(String nomeDoEvento,String tipoDoEvento,int quantidadeDeSalas,int codigo, int quantidadeDeInscritos, int dia, String mes, int ano ){
        this.nomeDoEvento=nomeDoEvento;
        this.tipoDoEvento=tipoDoEvento;
        this.quantidadeDeSalas=quantidadeDeSalas;
        this.codigo=codigo;
        this.quantidadeDeInscritos=quantidadeDeInscritos;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        indexSala=0;
        indexInscrito=0;
        quantidadeDeSalasTotais=0;
        quantidadeDeInscritosTotais = 0;
        
        listaSala= new Sala[quantidadeDeSalas];
        listaInscritos=new Inscritos[quantidadeDeInscritos];
        
    }
    public int getCodigo(){return codigo;  
    }

    public String getNomeDoEvento(){
        return nomeDoEvento;
    }

    public String getTipoDoEvento(){
        return tipoDoEvento;
    }
    
    public boolean addSala(Sala a){
       if(indexSala<=quantidadeDeSalas){
           listaSala[indexSala] = a;
           indexSala++;
           quantidadeDeSalasTotais++;
           return true;
       }
       return false;
    } 
    
    public Sala buscaSala(int codigoDaSala){
       for(int i=0;i<indexSala;i++){
           if(listaSala[indexSala].getCodigoSala()==codigoDaSala)
           return listaSala[indexSala];
       }
       return null;
    }
    
    
    public boolean addInscrito(Inscritos a){
       if(indexInscrito<quantidadeDeInscritos){
           listaInscritos[indexInscrito] = a;
           indexInscrito++;
           quantidadeDeInscritosTotais++;
           return true;
       }
       return false;
    } 
    
    public Inscritos buscaInscrito(String nome){
       for(int i=0;i<indexInscrito;i++){
           if(listaInscritos[i].getNome().equals(nome))
           return listaInscritos[i];
       }
       return null;
    }
    
    public int getQuantidadeInscritos(){
        return quantidadeDeInscritosTotais;
    }
    public void setQuantidadeInscritos(int quantidadeDeInscritosTotais){
        this.quantidadeDeInscritosTotais=quantidadeDeInscritosTotais;
    }

    public Inscritos[] getListaInscritos(){
        return listaInscritos;
    }

    public int getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
