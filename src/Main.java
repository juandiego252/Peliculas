public class Main {
    public static void main(String[] args) {
        Peliculas Titanic = new Peliculas(2,"Titanic","Drama","Mayores de 12 años"); // Juan
        Peliculas fast_Furios = new Peliculas(2,"Rapidos Y furiosos","Accion","Mayores de 13 años"); // Juan
        Peliculas After = new Peliculas(2,"After","Romance","Mayores de 18 años"); // Juan
        Peliculas Sherk = new Peliculas(2,"Sherk","Animada","Todo publico"); // Juan
        Peliculas colorouts = new Peliculas(1,"El color que cayo del cielo","Terror","Mayor de 18 años"); //Heyer
        Peliculas Kingsman = new Peliculas(2,"Kingsman, el servicio secreto","Accion","Mayores de 12 años");//Heyer
        Peliculas Endgame = new Peliculas(3,"Avengers: Endgame","Accion","Mayores de 12 años");//Heyer
        Peliculas chihiro = new Peliculas(2,"El viaje de Chihiro","Anime","Mayores de 7 años");//Heyer
        Peliculas Toy_Story = new Peliculas(1,"Toy Story","Animada","Todo Publico");
        Peliculas Avatar = new Peliculas(2,"Avatar","Ciencia Ficcion","Mayores de 13 años");
        Peliculas CJ7 = new Peliculas(1,"CJ7","Ciencia Ficcion-Comedia","Mayores de 7 años");
        Peliculas Spiderman = new Peliculas(2,"El hombre araña","Fantasia","mayores de 12 años");

        System.out.println(Titanic.getClasificacion());
    }
}
