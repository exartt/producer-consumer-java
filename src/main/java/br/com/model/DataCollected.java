package br.com.model;

public class DataCollected {
    public long getMemory() {
        return memory;
    }

    public void setMemory(long memory) {
        this.memory = memory;
    }

    public double getOverHead() {
        return overHead;
    }

    public void setOverHead(double overHead) {
        this.overHead = overHead;
    }
    public double getSpeedup() {
        return speedup;
    }

    public void setSpeedup(double speedup) {
        this.speedup = speedup;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    public boolean isSingleThread() {
        return isSingleThread;
    }

    public void setSingleThread(boolean singleThread) {
        isSingleThread = singleThread;
    }
    public long getIdleThreadTimeMedian() {
        return idleThreadTimeMedian;
    }

    public void setIdleThreadTimeMedian(long idleThreadTimeMedian) {
        this.idleThreadTimeMedian = idleThreadTimeMedian;
    }
    private long memory = 0;
    private double speedup = 0;
    private double efficiency = 0;
    private long executionTime = 0;

    private double overHead = 0;

    private long idleThreadTimeMedian = 0;
    private boolean isSingleThread = false;
}
