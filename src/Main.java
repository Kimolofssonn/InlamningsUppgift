//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WordCount wordCount = new WordCount();

        wordCount.wordScan();//kallar på metoden för att skriva in ord och meningar

        wordCount.print();//kallar på metoden för att skriva ut resultatet
    }
}