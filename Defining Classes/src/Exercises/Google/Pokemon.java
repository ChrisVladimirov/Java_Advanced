package Exercises.Google;

/*public class Pokemon {
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString(){
        return String.format("%s %s",this.pokemonName, this.pokemonType);
    }
}*/public class Pokemon {
    //pokemonName, pokemonType
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType){
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString() {
        return pokemonName + " " + pokemonType;
    }

}

