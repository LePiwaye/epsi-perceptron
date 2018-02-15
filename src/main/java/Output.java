public class Output {

    private double expectedOutput;
    private double obtainedOutput;

    public Output(double expectedOutput, double obtainedOutput) {
        this.expectedOutput = expectedOutput;
        this.obtainedOutput = obtainedOutput;
    }

    public double getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(double expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public double getObtainedOutput() {
        return obtainedOutput;
    }

    public void setObtainedOutput(double obtainedOutput) {
        this.obtainedOutput = obtainedOutput;
    }
}
