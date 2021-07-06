package lesson06_StreamAPI.homeWork;

import java.util.Objects;

public class Processor {

    private ProcessorType processorType;
    private int coreCount;
    private double frequencyCPU;
    private MadeIn madeIn;

    public Processor(ProcessorType processorType, int coreCount, double frequencyCPU, MadeIn madeIn) {
        this.processorType = processorType;
        this.coreCount = coreCount;
        this.frequencyCPU = frequencyCPU;
        this.madeIn = madeIn;
    }

    public ProcessorType getProcessorType() {
        return processorType;
    }

    public void setProcessorType(ProcessorType processorType) {
        this.processorType = processorType;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public double getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(double frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public MadeIn getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(MadeIn madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return coreCount == processor.coreCount && Double.compare(processor.frequencyCPU, frequencyCPU) == 0 && processorType == processor.processorType && madeIn == processor.madeIn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(processorType, coreCount, frequencyCPU, madeIn);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "processorType=" + processorType +
                ", coreCount=" + coreCount +
                ", frequencyCPU=" + frequencyCPU +
                ", madeIn=" + madeIn +
                '}';
    }
}
