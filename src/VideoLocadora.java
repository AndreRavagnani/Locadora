import java.util.ArrayList;


public class VideoLocadora extends Locadora {
	
	public String nomeFantasia;
	public static String ultimoFilmeAlugado;
	public static ArrayList<String> catalogoDeFilmes = new ArrayList<String>();
	public static ArrayList<String> videosAlugados = new ArrayList<String>();
	public static final int DIAS_SEM_MULTA =2;
	
	public VideoLocadora(String nome){
		nomeFantasia = nome;		
	}
	public String getNome(){
		return this.nomeFantasia;
	}
	
	public void alugarItem(String nomeFilme){
		if(videosAlugados.contains(nomeFilme)){
			System.out.println("Filme Já Alugado");
		}
		else{
			videosAlugados.add(nomeFilme);
			ultimoFilmeAlugado = nomeFilme;
			System.out.println("Filme Alugado Com Sucesso");
		}
	}
	
	public void receberItem(String nomeFilme, int dias){
		if(videosAlugados != null || !videosAlugados.isEmpty() || videosAlugados.contains(nomeFilme)){
			if(dias > DIAS_SEM_MULTA){
				System.out.println("Pague 100 Reais!!!");
			}
			videosAlugados.remove(nomeFilme);
			System.out.println("Filme Devolvido Com Sucesso !!!");
		}
	}
	public static void main(String args[]){
		VideoLocadora p = new VideoLocadora("Teste");
		p.alugarItem("Titanic");
		p.alugarItem("Jason X");
		p.alugarItem("Brasileirinhas");
		p.alugarItem("Titanic");
		p.receberItem("Titanic", 3);
		System.out.println(p.getNome());
		
		
	}
}
