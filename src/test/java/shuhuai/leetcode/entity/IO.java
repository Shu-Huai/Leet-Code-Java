package shuhuai.leetcode.entity;

public class IO<InputType, OutputType> {
    protected InputType input;
    protected OutputType output;

    public IO(InputType input, OutputType output) {
        this.input = input;
        this.output = output;
    }

    public InputType getInput() {
        return input;
    }

    public void setInput(InputType input) {
        this.input = input;
    }

    public OutputType getOutput() {
        return output;
    }

    public void setOutput(OutputType output) {
        this.output = output;
    }
}