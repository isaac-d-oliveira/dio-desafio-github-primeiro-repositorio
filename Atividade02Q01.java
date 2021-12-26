import java.util.*;



 class Elevador
 {
 	private int andarAtual;
 	private int totalAnderesPredio;
 	private int capacidade;
 	private int pessoasPresentes;
 	
 	public int getAndarAtual(){
 		return andarAtual;
 	}
 	
 	public void setAndarAtual(int andarAtual){
 		this.andarAtual=andarAtual;
 	}
 	
 	public int getTotalAnderesPredio(){
 		return totalAnderesPredio;
 	}
 	
 	public void setTotalAnderesPredio(int totalAnderesPredio){
 		this.totalAnderesPredio=totalAnderesPredio;
 	}
 	
 	public int getCapacidade(){
 		return capacidade;
 	}
 	
 	public void setCapacidade(int capacidade){
 		this.capacidade=capacidade;
 	}
 	
 	public int getPessoasPresentes(){
 		return this.pessoasPresentes;
 	}
 	public void setPessoasPresentes(int pessoasPresentes){
 		this.pessoasPresentes=pessoasPresentes;
 	}
 	
 	public Elevador(int totalAnderesPredio, int capacidade){
 		this.andarAtual=0;
 		this.totalAnderesPredio=totalAnderesPredio;
 		this.capacidade=capacidade;
 		this.pessoasPresentes=0;
 	}
 	
 	public void entra(){
 		if(getPessoasPresentes()<getTotalAnderesPredio()){
 			setPessoasPresentes(getPessoasPresentes()+1);
 		}
 	}
 	public void sai(){
 		if(getPessoasPresentes()>0){
 			setPessoasPresentes(getPessoasPresentes()-1);
 		}
 	}
 	
 	public void sob(){
 		if(getAndarAtual()<getTotalAnderesPredio()){
 			setAndarAtual(getAndarAtual()+1);
 		}
 	}
 	
 	public void desce(){
 		if(getAndarAtual()>0){
 			setAndarAtual(getAndarAtual()-1);
 		}
 	}
 	
 	public void status(){
 		System.out.println("-x- Status");
 		System.out.println("Andar: " + getAndarAtual());
 		System.out.println("Pessoas: "+ getPessoasPresentes());
 		System.out.println("x x x");
 	}
 }
 
 public class Principal{
 	public static void main(String[] args) {
 	Elevador el1 = new Elevador(5, 10);
 	
 	el1.status();
 	el1.sob();
 	el1.status();
 	el1.entra();
 	el1.status();
 	el1.sai();
 	el1.status();
 	el1.desce();
 	el1.status();
 }
 }