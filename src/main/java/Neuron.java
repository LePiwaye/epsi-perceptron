import java.util.Random;

public class Neuron {

    /**
     * Le seuil d'activation du neurone
     */
    private double floor;

    /**
     * La table de poids du neurone. Correspond généralement aux nombre d'entrées.
     */
    private Double[] weights;

    /**
     * Les entrées du neurone (15).
     */
    private Input[] inputs;

    /**
     * La sortie du neurone (1)
     */
    private Output output;

    /**
     * Le taux d'apprentissage du neurone
     */
    private double tau;

    /**
     * Constructeur Neurone
     * @param size Le nombre d'entrées
     */
    public Neuron(int size, double tau){
        this.floor = 1;
        this.tau = tau;
        this.weights = new Double[size];
        this.inputs = new Input[size];
        this.output = new Output(0,0);

        /* On génère des poids arbitraires pour chaque entrée, compris entre 0 et 2 */
        for(int i = 0; i < size; i++){
            Random rng = new Random();
            this.weights[i] = rng.nextDouble() * 2;
        }

        /* On crée des entrées */
        for(int i = 0; i < size; i++){
            this.inputs[i] = new Input();
        }
    }

    public void aggregationSomme(){
        double sum = 0;

        for(int i = 0; i < this.inputs.length; i++){
            sum += this.inputs[i].getValue() * this.weights[i];
        }

        this.output.setObtainedOutput(sum);
    }

    public void activationHeaviside(){
        this.output.setObtainedOutput(this.output.getObtainedOutput() >= this.floor ? 1 : 0);
    }

    public void calculateNewWeights(){
        for(int i = 0; i < this.weights.length; i++){
            double error = this.output.getObtainedOutput() - this.output.getExpectedOutput();
            double delta = this.tau * this.inputs[i].getValue() * error;
            this.weights[i] = this.weights[i] - (delta);
        }
    }

    public void feedNewData(int[] newInputs, double expectedOutput){
        for(int i = 0; i < newInputs.length; i++){
            this.inputs[i].setValue(newInputs[i]);
        }

        this.output.setExpectedOutput(expectedOutput);
    }

    public Output getOutput(){
        return this.output;
    }
}
