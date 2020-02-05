package ZadanieDomowe;

public class Miesiace4litery {
    public static void main(String[] args) {
        String[] months = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};

        int index = 4;
        do {
            System.out.println(months[index]);
            index++;
        } while (index < months.length);
    }
}
