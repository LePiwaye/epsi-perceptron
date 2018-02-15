public class Run {

    public static void main(String[] args){
        Perceptron p = new Perceptron(4,0.01,2000);
        p.runTraining();
        p.runPlaying();
    }
}
