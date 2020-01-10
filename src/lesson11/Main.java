package lesson11;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        Dealer player1 = new Dealer();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        player1.setDealer(true);

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);


        game.doFirstRound();
        game.printPlayersHands();
        game.doActionPlayers();
        game.doActionDealer();

        game.printAllPlayersHands();
        game.printWinner();







    }

}
