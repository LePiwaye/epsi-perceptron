public class Run {

    /**+
     * Interface de lancement du perceptron, avec le nombre de neurones, le taux d'apprentissage et le nombre de runs de training
     * @param args
     */
    public static void main(String[] args){
        Perceptron p = new Perceptron(4,0.01,2000);
        p.runTraining();
        p.runPlaying();
    }
}
