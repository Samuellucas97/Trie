public class NoTrie{

    // -> ATRIBUTOS

    private char caractere;
    private boolean ehFim;
    private NoTrie filhos[];

    // -> METODOS

    // -> CONSTRUTORES

    public NoTrie(	  ){

        caractere = ' ';
        ehFim = false;
        filhos = new NoTrie[26];
    }

    public NoTrie( char caractere, boolean ehFim ){

        this.caractere = caractere;
        this.ehFim = ehFim;
        filhos = new NoTrie[26];

    }

    // -> GETTERS E SETTERS

    char getCaractere(){
        return caractere;
    }
    
    boolean getEhFim(){
        return ehFim;
    }

    void setEhFim( boolean ehFim ){
        this.ehFim = ehFim;
    }

    NoTrie getFilho(int posicao) throws NullPointerException {
    	return filhos[posicao];
    }	

}
