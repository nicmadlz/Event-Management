package Trabalho;

public class Sala
{
    private int codigoSala=0;
    private int tamanho;
    private int lotacao;
    private String local;
    private double preco;
    
    public Sala(int tamanho,int lotacao,String local,double preco,int codigoSala){
        this.tamanho=tamanho;
        this.lotacao=lotacao;
        this.local=local;
        this.preco=preco;
        codigoSala++;
    }
    
    public int getCodigoSala(){ return codigoSala;
    }
    public int getTamanho(){ return tamanho;
    }
    public int getLotacao(){ return lotacao;
    }
    public String getLocal(){ return local;
    }
    public double getPreco(){ return preco;
    }
}
