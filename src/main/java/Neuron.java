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
     * Les entrées du neurone
     */
    private Input[] inputs;

    /**
     * La sortie du neurone
     */
    private Output output;

    /**
     * Le taux d'apprentissage du neurone
     */
    private double tau;

    /**
     * Constructeur Neurone.
     * Chaque neurone dispose de ses entrées. Bien que tous les neurones disposent des mêmes entrées à un instant T,
     * il était plus simple de les représenter de cette façon. Chaque neurone dispose en revanche, pour chacune de
     * ses entrées, un poids, qui lui n'est pas commun aux autres neurones.
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

    /**
     * Fonction d'agrégation
     * On calcule la valeur du neurone en faisant la somme des produits des entrées avec leur poids respectifs
     */
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

    /**
     * L'entrainement du neurone se base en réalité sur la modification des poids rattachés à ses entrées.
     * Tau trop haut : risque de ... (voir cours)
     */
    public void calculateNewWeights(){
        for(int i = 0; i < this.weights.length; i++){
            double error = this.output.getObtainedOutput() - this.output.getExpectedOutput();
            double delta = this.tau * this.inputs[i].getValue() * error;
            this.weights[i] = this.weights[i] - (delta);
        }
    }

    /**
     * Méthode d'enregistrement des valeurs d'entrée et de sortie attendue pour un neurone, appelée dans le perceptron
     * @see Perceptron Méthode feedNeurons() de Perceptron
     * @param newInputs
     * @param expectedOutput
     */
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
