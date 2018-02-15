public class Run {

    public static void main(String[] args){
        Perceptron p = new Perceptron(3,0.1,5000);
        p.runTraining();
        p.runPlaying();
    }
}
