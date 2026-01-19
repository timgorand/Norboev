import java.util.Scanner;

class Decanat{
    private String NameFaculty;
    private int room;
    private char corps;
    private String telephone;
    private String NameDean;

    public Decanat(String NameFaculty,int room,char corps,String telephone,String NameDean){
        this.NameFaculty = NameFaculty;
        this.room = room;
        this.corps = corps;
        this.telephone = telephone;
        this.NameDean = NameDean;
    }
    //Геттер
    public String getNameFaculty(){ return NameFaculty;}
    public int getroom(){ return room;}
    public char getcorps(){ return corps;}
    public String gettelephone(){ return telephone;}
    public String getNameDean(){ return NameDean;}
    //Сеттер
    public void setNameFaculty(){this.NameFaculty = NameFaculty;}
    public void setroom(){ this.room = room;}
    public void setcorps(){this.corps = corps;}
    public void settelephone(){ this.telephone = telephone;}
    public void setNameDean(){ this.NameDean = NameDean;}

    @Override
    public String toString(){
        return String.format("Факультет: %s | Аудитория: %d | Корпус: %s | Телефон: %s | Фамилия %s",
                NameFaculty, room, corps, telephone , NameDean);
    }
}

class Dean{
    private Decanat[] decanats;
    private int n;

    public Dean(){
        this.decanats = new Decanat[100];
        this.n=0;
    }
    public void addDean(Decanat decanat){
        if (n >= decanats.length) {
            Decanat[] New_Deans = new Decanat[decanats.length * 2];
            System.arraycopy(decanats, 0, New_Deans, 0, decanats.length);
            decanats = New_Deans;
        }
        decanats[n] = decanat;
        n++;
    }

    public Decanat find_by_room(int room) {
        for (int i = 0; i < n; i++) {
            if (decanats[i].getroom() == room) {
                return decanats[i];
            }
        }
        return null;
    }
}

public class Zadacha3_1__Group7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }

}
