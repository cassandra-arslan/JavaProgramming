package Unit4Assessment;

public class Q10 {
    String name;
    int numOfPlayers;
    boolean teamBased;
    public void makeSport (String name, int players, boolean teams){
        name = name;
        numOfPlayers = players;
        teamBased = teams;
    }

    public String toString() {
        String msg = "The sport is "+name+" and has "+
                numOfPlayers+" players total ";
        if(teamBased){
            msg += "dividied into teams";
        }else{
            msg+="but there is no teams";
        }
        return msg;
    }

    public static void main(String[] args) {
        Q10 soccer = new Q10();
        soccer.makeSport("Soccer", 22, true);
        System.out.println(soccer);
    }
}
