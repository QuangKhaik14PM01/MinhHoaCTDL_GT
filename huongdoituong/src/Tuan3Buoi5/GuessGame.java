package Tuan3Buoi5;

public class GuessGame {
    //attribute- data
    Player p1;
    Player p2;
    Player p3;

    public void stargame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1=0;
        int guessp2=0;
        int guessp3=0;
        boolean p1right=false;  
        boolean p2right=false;  
        boolean p3right=false;  
        int targetnumber = (int) (Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while (true){
            System.out.println("Number to guess is" + targetnumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 =p1.number;
            System.out.println("player 1 guess" + guessp1);
            guessp2 =p2.number;
            System.out.println("player 2 guess" + guessp2);
            guessp3 =p3.number;
            System.out.println("player 3 guess" + guessp3);

            if(guessp1 == targetnumber){
              p1right=true;
            }
            if(guessp2 == targetnumber){
                p2right=true;
              }
              if(guessp3 == targetnumber){
                p3right=true;
              }
              if(p1right || p2right || p3right){
                  System.out.println("We have a winner!");
                  System.out.println("player 1 got  it right ? " + p1right);
                  System.out.println("player 2 got  it right ? " + p2right);
                  System.out.println("player 3 got  it right ? " + p3right);
                  System.out.println("game is over");
                  break;

              }
              else{
                  System.out.println("player will have try again");
              }
        }

    }
}
