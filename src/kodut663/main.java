package kodut663;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*Antud programm loeb failist 'heroes.txt' kangelased ning selgitab välja, kas on superkangelane või tavaline ning näitab palju inimesi ta on päästnud,
kuna programmi ei ole sisestatud kangelase osavust siis kõik vastused tulevad 95 inimest.*/
public class main {
    static List<Hero> heroes = new ArrayList<Hero>();
    public static void main(String[] args) throws IOException {
        readFile();
        System.out.println(heroes);
        for (Hero p : heroes){
            p.päästa(100); //Päästetud inimesi: 95.0
        }
    }

    public static boolean createSuperman(String nimi, String asukoht) {
        heroes.add(new superhero(nimi, asukoht));
        return true;
    }

    public static boolean createNonSuperman(String nimi, String asukoht) {
        heroes.add(new Hero(nimi, asukoht));
        return true;
    }

    public static void readFile() throws IOException {
        try {
            File file = new File("heroes.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("*")) {
                    String[] parts = line.split("/");
                    String nimi = parts[0];
                    String asukoht = parts[1];
                    createSuperman(nimi, asukoht);
                } else {
                    String[] parts = line.split("/");
                    String nimi = parts[0];
                    String asukoht = parts[1];
                    createNonSuperman(nimi, asukoht);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
