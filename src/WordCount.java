import java.util.ArrayList;
import java.util.Scanner;

public class WordCount {
ArrayList<String> wordList =new ArrayList<>(); //Lista för alla ord
int wordChar = 0; //antal tecken
int wordTot = 0; //ord totalt
String wordLong = ""; //längsta ordet

//läser in alla ord och meningar från användare tills ordet stopp och lägger inte till det i listan.
    public void wordScan() {

    Scanner scanner=new Scanner(System.in);
    String words;

    do {
        System.out.println("Skriv in ett ord eller mening\nAvsluta genom att skriva \"STOP\":");
        words=scanner.nextLine();

        if (!words.equalsIgnoreCase("STOP")){//kontrollerar så stop ej skrivits innan vi lägger till i listan
            wordList.add(words);
            breakdown(words);
        }
    }while (!words.equalsIgnoreCase("STOP"));//när stop skrivs avslutas loopen
}

    void breakdown(String words) {
        //tar bort mellanslag och kontrollerar om strängen är tom efteråt i så fall så registreras inga ord - hittat med tester
        words=words.trim();
        if (words.isEmpty()){
            return;
        }
        wordChar+=words.replace(" ","").length();//räknar totala antalet tecken

        String[] word = words.split("\\s+");//delar upp och räknar orden
        wordTot += word.length;

        for (String wordL : word) {//hittar den längsta strängen.
            if (wordL.length()>wordLong.length()){
                wordLong=wordL;
            }
        }
    }
    public void print(){//skriver ut resultatet
        System.out.println("Antal rader: "+wordList.size());
        System.out.println("Antal tecken: "+ wordChar);
        System.out.println("Antal ord: "+wordTot);
        System.out.println("Längsta ordet: "+wordLong);
    }
}
