public class friend {

    static int numoffriends;
    String name;

    friend(String name) {
        this.name = name;
        numoffriends++;
    }
    static void showfriends(){
        System.out.println("you have " + " " + numoffriends + " " + "friends");
    }
}
