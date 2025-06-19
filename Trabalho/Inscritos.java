package Trabalho;

public class Inscritos
{
    private String cargo;
    private String instituicao;
    private String nome;
    private int categoriaDoIngresso;
    private String cpf;
    private double precoDoIngressso;
    
    public Inscritos(String nome,String cpf,String cargo,String instituicao){
        this.nome=nome;
        this.cpf=cpf;
        this.cargo=cargo;
        this.instituicao=instituicao;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){return nome;
    }
    
     public void setInstituicao(String instituicao){
        this.instituicao=instituicao;
    }
      public String getInstituicao(){return instituicao;
    }
    
     public void setCargo(String cargo){
        this.cargo=cargo;
    }
      public String getCargo(){return cargo;
    }
    
     public void setCategoriaDoIngresso(int categoriaDoIngresso){
        this.categoriaDoIngresso=categoriaDoIngresso;
    }
     public int getCategoriaDoIngresso(){return categoriaDoIngresso;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){return cpf;
    }
    
    public void setPrecoDoIngressso(int precoDoIngressso){
        this.precoDoIngressso=precoDoIngressso;
    }
    public double getPrecoDoIngressso(){return precoDoIngressso;
    }
    
    public String toString(){
        return "O nome do incrito é: "+ nome;
    }
}
