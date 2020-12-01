package it.unibo.oop.lab.workers02;

public final class MultiThreadSumMatrix implements SumMatrix {
    private int nThreads;

    private MultiThreadSumMatrix(final int n) {
        this.setnThreads(n);
    }

    public int getnThreads() {
        return nThreads;
    }

    public void setnThreads(final int nThreads) {
        this.nThreads = nThreads;
    }

    @Override
    public double sum(final double[][] matrix) {
        return 0;
    }

}
