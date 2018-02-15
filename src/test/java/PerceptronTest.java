import org.junit.Assert;
import org.junit.Test;

public class PerceptronTest {

    /* Best conditions testing */

    @Test
    public void testPerceptronFinds0(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds1(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds2(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds3(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds4(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds5(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds6(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds7(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds8(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronFinds9(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();
        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    /* Tinkering with learning rate */

    @Test
    public void testPerceptronGoesOKWith01TauAnd5000Runs(){
        Perceptron p = new Perceptron(4,0.1,5000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith05TauAnd5000Runs(){
        Perceptron p = new Perceptron(4,0.5,5000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith1TauAnd5000Runs(){
        Perceptron p = new Perceptron(4,1,5000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith10TauAnd5000Runs(){
        Perceptron p = new Perceptron(4,10,5000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith2000TauAnd5000Runs(){
        Perceptron p = new Perceptron(4,2000,5000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith0001TauAnd5000Runs(){
        Perceptron p = new Perceptron(4,0.001,5000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith00001TauAnd5000Runs(){
        Perceptron p = new Perceptron(4,0.0001,5000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    /* Tinkering with training runs */

    @Test
    public void testPerceptronGoesOKWith0001TauAnd2000Runs(){
        Perceptron p = new Perceptron(4,0.001,2000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith0001TauAnd1500Runs(){
        Perceptron p = new Perceptron(4,0.001,1500);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith0001TauAnd1000Runs(){
        Perceptron p = new Perceptron(4,0.001,1000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith00001TauAnd50000Runs(){
        Perceptron p = new Perceptron(4,0.0001,50000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

    @Test
    public void testPerceptronGoesOKWith00001TauAnd500000Runs(){
        Perceptron p = new Perceptron(4,0.0001,500000);
        p.runTraining();

        p.feedNeurons(p.getInputSet()[0],p.getOutputSet()[0]);
        Assert.assertEquals(0,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[1],p.getOutputSet()[1]);
        Assert.assertEquals(1,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[2],p.getOutputSet()[2]);
        Assert.assertEquals(2,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[3],p.getOutputSet()[3]);
        Assert.assertEquals(3,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[4],p.getOutputSet()[4]);
        Assert.assertEquals(4,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[5],p.getOutputSet()[5]);
        Assert.assertEquals(5,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[6],p.getOutputSet()[6]);
        Assert.assertEquals(6,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[7],p.getOutputSet()[7]);
        Assert.assertEquals(7,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[8],p.getOutputSet()[8]);
        Assert.assertEquals(8,p.getLastRunResult(),0);

        p.feedNeurons(p.getInputSet()[9],p.getOutputSet()[9]);
        Assert.assertEquals(9,p.getLastRunResult(),0);
    }

}
