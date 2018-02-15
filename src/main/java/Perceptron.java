import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Perceptron {

    /**
     * Tableau de neurones du perceptron
     */
    private Neuron[] neurons;

    /**
     * Taux d'apprentissage du perceptron
     */
    private double tau;

    /**
     * Nombre de runs d'apprentissage du perceptron
     */
    private int trainingRuns;

    /**
     * Tableau de stockage des données d'entrée
     */
    private int[][] inputSet;

    /**
     * Tableau de stockage des données de sortie
     */
    private int[][] outputSet;

    /**
     * Constructeur du perceptron
     * @param neuronNumber
     * @param tau
     * @param trainingRuns
     */
    Perceptron(int neuronNumber, double tau, int trainingRuns){

        this.neurons = new Neuron[neuronNumber];
        this.trainingRuns = trainingRuns;
        this.tau = tau;

        this.inputSet = new int[][]
                {
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,0,0,1,0,0,1,0,0,1,0},
                        {1,1,1,0,0,1,1,1,1,1,0,0,1,1,1},
                        {1,1,1,0,0,1,1,1,1,0,0,1,1,1,1},
                        {1,0,1,1,0,1,1,1,1,0,0,1,0,0,1},
                        {1,1,1,1,0,0,1,1,1,0,0,1,1,1,1},
                        {1,1,1,1,0,0,1,1,1,1,0,1,1,1,1},
                        {1,1,1,0,0,1,0,0,1,0,0,1,0,1,1},
                        {1,1,1,1,0,1,1,1,1,1,0,1,1,1,1},
                        {1,1,1,1,0,1,1,1,1,0,0,1,1,1,1}
                };

        this.outputSet = new int[][]
                {
                        {0,0,0,0},{0,0,0,1},{0,0,1,0},{0,0,1,1},
                        {0,1,0,0},{0,1,0,1},{0,1,1,0},{0,1,1,1},
                        {1,0,0,0},{1,0,0,1}
                };


        for(int i = 0; i < neuronNumber; i++){
            this.neurons[i] = new Neuron(this.inputSet[0].length, this.tau);
        }
    }

    void runTraining(){
        for(int currentTrainingRun = 1; currentTrainingRun <= this.trainingRuns; currentTrainingRun++){
            for(int currentNumber = 0; currentNumber < this.inputSet.length; currentNumber++){
                this.feedNeurons(this.inputSet[currentNumber], this.outputSet[currentNumber]);
                this.trainNeurons();
            }
        }
    }

    /**
     * Méthode de paramétrage des données d'entrée et de sortie de chaque neurone
     * @param inputSetRack Une ligne de données entrantes correspondant à un nombre
     * @param outputSetRack La ligne de bits correspondant au nombre de la ligne de données entrantes
     */
    void feedNeurons(int[] inputSetRack, int[] outputSetRack){
        for(int i = 0; i < this.neurons.length; i++){
            this.neurons[i].feedNewData(inputSetRack, outputSetRack[i]);
        }
    }

    /**
     * Méthode d'appel d'entraînement du neurone
     */
    private void trainNeurons(){
        for(int i = 0; i < this.neurons.length; i++){
            this.neurons[i].aggregationSomme();
            this.neurons[i].activationHeaviside();
            this.neurons[i].calculateNewWeights();
        }
    }

    /**
     * Appel au perceptron pour déterminer un nombre par rapport aux données d'entrée
     * Le calcul du nouveau poids est conservé pour réaliser un apprentissage continu
     * @return Le résultat par rapport aux données d'entrée
     */
    double getLastRunResult(){
        double result = 0;
        int multiplicator = 1;
        for(int i = this.neurons.length - 1; i >= 0 ; i--){
            this.neurons[i].aggregationSomme();
            this.neurons[i].activationHeaviside();
            this.neurons[i].calculateNewWeights();

            result += (this.neurons[i].getOutput().getObtainedOutput()) * (multiplicator);
            multiplicator = multiplicator * 2;
        }

        return result;
    }

    /**
     * Méthode de discussion avec l'utilisateur
     */
    void runPlaying(){
        System.out.println("==================================================");
        System.out.println("|           PERCEPTRON - FIND A NUMBER           |");
        System.out.println("==================================================");

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Please enter a number, and I'll find it ! ");
        System.out.println("(Note that entering anything that isn't a number between 0 and 9 will quit the program)");
        try {

            String userInput = "0";

            while(userInput.equals("0") || userInput.equals("1") ||
                    userInput.equals("2") || userInput.equals("3") ||
                    userInput.equals("4") || userInput.equals("5") ||
                    userInput.equals("6") || userInput.equals("7") ||
                    userInput.equals("8") || userInput.equals("9")){

                userInput = inputReader.readLine();
                int userNumber = Integer.parseInt(userInput);

                this.feedNeurons(this.inputSet[userNumber],this.outputSet[userNumber]);

                System.out.println("You probably entered " + getLastRunResult() + ". Type another number to retry !");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int[][] getInputSet() {
        return inputSet;
    }

    int[][] getOutputSet() {
        return outputSet;
    }
}
