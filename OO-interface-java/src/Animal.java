public class Animal implements SerVivo{

    private Boolean vivo=true;
    public Animal(){}

    public void mover(){}
    public void comer(int massa){}
    public void info(){
        //A sintaxe e chamada no teste [run acontece lá]
    System.out.printf("Vivo:%s%n",this.vivo ? "Sim" : "Nao");
    }
}
