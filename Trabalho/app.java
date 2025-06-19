package Trabalho;

import java.util.Scanner;

public class app
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int opcao=0;
        Sala s=null;
        Inscritos i=null;
        Evento e=null;
        
        Evento[] listaEvento=new Evento[100];
       
       
        
        int codigoDoEvento=0;
        int codigoDaSala=0;
       
        do{
        menu();
        opcao=in.nextInt();
        switch(opcao){
            case 1:{
                System.out.println("Digite o nome do evento: ");
                String nome=in.next();
                System.out.println("Digite o tipo do evento: ");
                String tipoEvento=in.next();
                System.out.println("Digite a quantidade de salas que você usara no evento: ");
                int quantidadeDeSalas =in.nextInt();
                System.out.println("Digitea quantidade MAXIMA de inscritos para o seu evento: ");
                int quantidadeDeInscritos =in.nextInt();
                System.out.println("Digite quando o dia do evento: ");
                int dia = in.nextInt();
                System.out.println("Digite o mes do evento: ");
                String mes = in.next();
                System.out.println("Digite o ano do evento: ");
                int ano = in.nextInt();
                e= new Evento(nome,tipoEvento,quantidadeDeSalas,codigoDoEvento,quantidadeDeInscritos, dia, mes, ano);
                listaEvento[codigoDoEvento]=e;
                System.out.println("EVENTO CRIADO!"+"\n O codigo de seu evento é: " + codigoDoEvento);
                codigoDoEvento++;
                break;
            }
            
            case 2:{
               System.out.println("Digite o codigo do evento no qual você quer adicionar a sala: ");
               int codigo=in.nextInt();
               for(int j=0;j<codigoDoEvento;j++){
                    if(listaEvento[j].getCodigo()==codigo){
                        int tamanho=0;
                        int lotacao=0;
                        do{
                            menuTamanhoSala();
                            tamanho=in.nextInt();
                            if(tamanho == 1)
                                lotacao=30;
                            else if(tamanho == 2)
                                lotacao=60;
                            else if(tamanho == 3)
                                lotacao=120;
                            else{
                                 System.out.println("OPÇÃO INVALIDA");
                            }
                        }while(tamanho<0 || tamanho>4);
                        System.out.println("Digite o local da Trabalho.Sala: ");
                        String local=in.next();
                        System.out.println("Digite o preço do aluguel da sala: ");
                        double preco=in.nextInt();
                        codigoDaSala++;
                        s= new Sala(tamanho,lotacao,local,preco,codigoDaSala);
                        if(listaEvento[j].addSala(s)){
                            listaEvento[j].addSala(s);
                            System.out.println("\nSALA ADICIONADA!"+"\n O codigo da sua sala é: " + codigoDaSala);
                        }
                        else System.out.println("\nERRO!"+"\nLIMITE DE SALAS JA FOI ATINGIDO NESSE EVENTO!");
                   }
               }
               break;
            }
            
            case 3:{
                 System.out.println("Digite o codigo do evendo no qual você quer adicionar um inscrito: ");
                 int codigo=in.nextInt();
                 
                 for(int j=0;j<codigoDoEvento;j++){
                    if(listaEvento[j].getCodigo()==codigo){
                         System.out.println("Digite o nome do Inscrito: ");
                         String nome=in.next();
                         System.out.println("Digite o CPF do Inscrito: ");
                         String cpf=in.next();
                         System.out.println("Digite o cargo do Inscrito: ");
                         String cargo=in.next();
                         System.out.println("Digite a instituição que o Inscrito: ");
                         String instituicao=in.next();
                         i= new Inscritos(nome,cpf,cargo,instituicao);
                         if(listaEvento[j].addInscrito(i)){
                            System.out.println("\nINSCRITO ADICIONADO!");
                        }
                        else System.out.println("\nERRO!"+"\nLIMITE MAXIMO DE INSCRITO JÁ FOI ATINGIDO NESSE EVENTO!");
                        }
                    }
                 break;
            }
            
            case 4:{
                System.out.println("Digite o codigo do evendo no qual o inscrito que você está buscando esta cadastrado: ");
                 int codigo=in.nextInt();
                 for(int j=0;j<codigoDoEvento;j++){
                    if(listaEvento[j].getCodigo()==codigo){
                         System.out.println("Digite o nome do Inscrito: ");
                         String nome=in.next();
                        Inscritos encontrado = listaEvento[j].buscaInscrito(nome);
                        if(encontrado != null){
                            System.out.println("Inscrito encontrado!");
                            System.out.println("Nome: " + encontrado.getNome());
                            System.out.println("CPF: " + encontrado.getCpf());
                            System.out.println("Cargo: " + encontrado.getCargo());
                            System.out.println("Instituição: " + encontrado.getInstituicao());
                        } else {
                            System.out.println("Inscrito não encontrado.");
                        }
                    }
                }
                 break;
            }
            
            case 5:{
                System.out.println("Digite o código do evento no qual você deseja saber a quantidade total de inscritos: ");
                int codigo = in.nextInt();
                for(int j=0;j<codigoDoEvento;j++){
                    if(listaEvento[j].getCodigo()==codigo){
                        System.out.println(listaEvento[j].getQuantidadeInscritos());
                    }
                }
                break;
            }

            case 6:{
                System.out.println("EVENTOS GERENCIADOS PELO SISTEMA: ");
                for(int j =0; j<codigoDoEvento;j++){
                    Evento evento = listaEvento[j];
                    System.out.println("Código: " +evento.getCodigo()+
                            "\nNome do Evento: " + evento.getNomeDoEvento()+
                            "\nTipo do Evento: " +evento.getTipoDoEvento()+
                            "\nData do Evento: " +evento.getDia()+ " de " + evento.getMes() + " de " + evento.getAno());
                }
                break;
            }

            case 7:{
                System.out.println("Digite o código do evento no qual você deseja saber os inscritos: ");
                int codigo = in.nextInt();
                for(int j=0;j<codigoDoEvento;j++){
                    if(listaEvento[j].getCodigo()==codigo){
                        Inscritos[] inscritos = listaEvento[j].getListaInscritos();
                        boolean achou = false;
                        for(int x = 0; x < inscritos.length; x++){
                            if(inscritos[x]!=null){
                                System.out.println("Inscrito [" + (x+1) + "]: " +inscritos[x].getNome());
                            }
                        }
                    }
                }
                break;
            }

            case 8:{
                System.out.println("Digite qual o tipo de evento que você deseja saber sobre: ");
                String tipo = in.next();

            }
            
        }
       }while(opcao!=15);
    }
    public static void menu(){
        System.out.println("1- Criar novo evento");
        System.out.println("2- Adicionar sala a evento");
        System.out.println("3- Adicionar incrito a evento");
        System.out.println("4- Buscar inscrito pelo nome");
        System.out.println("5- Buscar quantidade total de inscritos em determinado evento");
        System.out.println("6- Mostrar todos os eventos gerenciados pelo sistema");
        System.out.println("7- Listar todos os inscritos de um evento");
        System.out.println("8- Mostrar todos eventos de um tipo");
    }
    public static void menuTamanhoSala(){
        System.out.println("Selecione o tamanho da sala: ");
        System.out.println("1- Trabalho.Sala pequena (Até 30 pessoas)");
        System.out.println("2- Trabalho.Sala media (Até 60 pessoas)");
        System.out.println("3- Trabalho.Sala Grande (Até 120 pessoas)");
    }
}
