public class Main {
    public static void main(String[] args){
        double miles = 100; // expression
        double kilometers = (miles * 1.609344); //expression

        int highScore = 50; //expression

        if(highScore > 25){ //expression
            highScore += 1000; //add bonus points expression
        }

        int health = 100; // 1 expression

        if((health < 25) && (highScore > 1000)) { //3 expressions
            highScore = highScore - 1000; //2 expressions
        }

    }
}
